package edu.escuelaing.arep.parcial;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCorrectWeather() {
        ApiWeather apiWeather = new ApiWeather();
        String clima = apiWeather.getWeather("London");
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(clima);
        assertEquals(json.get("name"),"London");
    }
}
