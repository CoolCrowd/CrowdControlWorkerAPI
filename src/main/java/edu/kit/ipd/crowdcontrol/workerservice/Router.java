package edu.kit.ipd.crowdcontrol.workerservice;

import edu.kit.ipd.crowdcontrol.workerservice.command.Commands;
import edu.kit.ipd.crowdcontrol.workerservice.proto.ErrorResponse;
import edu.kit.ipd.crowdcontrol.workerservice.query.Query;
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
    private final Query query;
    private final Commands commands;

    /**
     * creates a new Router.
     * @param query the query to call
     * @param commands the commands to call
     */
    public Router(Query query, Commands commands) {
        this.query = query;
        this.commands = commands;
    }

    /**
     * Invoked from the SparkFilter. Used to define routes.
     */
    @Override
    public void init() {
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

        get("/next/:platform/:experiment", query::getNext);

        post("/email/:platform", commands::submitEmail);

        post("/answer/:workerID", commands::submitAnswer);

        post("/rating/:workerID", commands::submitRating);

        post("/calibration/:workerID", commands::submitCalibration);

    }

    /**
     * Creates an error response and encodes it into JSON / protocol buffers.
     *
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     * @param code
     *         Short error code to make errors machine readable.
     * @param detail
     *         Detailed error message for humans.
     *
     * @return Encoded message.
     */
    private String error(Request request, Response response, String code, String detail) {
        ErrorResponse error = ErrorResponse.newBuilder().setCode(code).setDetail(detail).build();
        return transform(request, response, error);
    }
}
