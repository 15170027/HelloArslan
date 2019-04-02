package HelloArslan.HelloArslan;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloArslanTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloArslanTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloArslanTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHelloArslan()
    {
        assertTrue( true );
    }
}
