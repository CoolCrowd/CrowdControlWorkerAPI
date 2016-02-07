package edu.kit.ipd.crowdcontrol.workerservice;

import edu.kit.ipd.crowdcontrol.workerservice.command.Commands;
import edu.kit.ipd.crowdcontrol.workerservice.proto.ErrorResponse;
import edu.kit.ipd.crowdcontrol.workerservice.query.Queries;
import spark.Request;
import spark.Response;
import spark.servlet.SparkApplication;

import static spark.Spark.*;

/**
 * the router is the glue that connects the methods from the Command & Query package to the REST-interfaces.
 * @author LeanderK
 * @version 1.0
 */
public class Router implements SparkApplication, RequestHelper {
    private final Queries queries;
    private final Commands commands;
    private final int port;

    /**
     * creates a new Router.
     * @param queries the query to call
     * @param commands the commands to call
     * @param port the port the server is listening on
     */
    public Router(Queries queries, Commands commands, int port) {
        this.queries = queries;
        this.commands = commands;
        this.port = port;
    }

    /**
     * Invoked from the SparkFilter. Used to define routes.
     */
    @Override
    public void init() {
        port(port);

        exception(BadRequestException.class, (exception, request, response) -> {
            response.status(400);
            response.body(error(request, response, "badRequest", exception.getMessage()));
        });

        exception(InternalServerErrorException.class, (exception, request, response) -> {
            InternalServerErrorException internalError = (InternalServerErrorException) exception;
            System.err.println("an internal error occurred");
            internalError.printStackTrace();
            response.status(500);
            response.body(error(request, response, "internalServerError", exception.getMessage()));
        });

        exception(NotAcceptableException.class, (exception, request, response) -> {
            // Don't use error(...) in this handler,
            // otherwise we end up throwing the same exception again.

            response.status(406);
            response.type("text/plain");
            response.body("notAcceptable: " + exception.getMessage());
        });

        before((request, response) -> {
            if (request.headers("accept") == null) {
                throw new BadRequestException("Missing required 'accept' header.");
            }

            response.header("access-control-allow-origin", "*");
            response.header("access-control-allow-methods", "GET,PUT,POST,PATCH,DELETE,OPTIONS");
            response.header("access-control-allow-credentials", "true");
            response.header("access-control-allow-headers", "Authorization,Content-Type");
            response.header("access-control-expose-headers", "Link,Location");
            response.header("access-control-max-age", "86400");
        });

        get("/preview/:experiment", queries::preview);

        get("/next/:platform/:experiment", queries::getNext);

        post("/emails/:platform", commands::submitEmail);
        options("/emails/:workerID", (request, response) -> {
            response.status(200);
            return "";
        });

        post("/answers/:workerID", commands::submitAnswer);
        options("/answers/:workerID", (request, response) -> {
            response.status(200);
            return "";
        });

        post("/ratings/:workerID", commands::submitRating);
        options("/ratings/:workerID", (request, response) -> {
            response.status(200);
            return "";
        });

        post("/calibrations/:workerID", commands::submitCalibration);
        options("/calibrations/:workerID", (request, response) -> {
            response.status(200);
            return "";
        });

    }

    /**
     * Creates an error response and encodes it into JSON / protocol buffers.
     *
     * @param request Request provided by Spark
     * @param response Response provided by Spark
     * @param code Short error code to make errors machine readable
     * @param detail Detailed error message for humans
     *
     * @return Encoded message
     */
    private String error(Request request, Response response, String code, String detail) {
        ErrorResponse error = ErrorResponse.newBuilder().setCode(code).setDetail(detail).build();
        return transform(request, response, error);
    }
}
