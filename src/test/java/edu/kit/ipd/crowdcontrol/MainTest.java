package edu.kit.ipd.crowdcontrol;

import org.junit.Test;

import javax.naming.NoInitialContextException;

/**
 * @author LeanderK
 * @version 1.0
 */
public class MainTest {

    @Test
    public void testMainCanParseExample() throws Exception {
        String[] args = new String[2];
        args[0] = "/example_config_without_Pool.properties";
        args[1] = "true";
        Main.main(args);
    }

    @Test(expected = RuntimeException.class)
    public void testMainCanParsePoolExample() throws Exception {
        String[] args = new String[2];
        args[0] = "/example_config.properties";
        args[1] = "true";
        Main.main(args);
    }
}