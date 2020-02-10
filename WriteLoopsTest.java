

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WriteLoopsTest.
 *
 * @author  kyounger
 * @version 1.2
 */
public class WriteLoopsTest
{
    /**
     * Default constructor for test class WriteLoopsTest
     */
    public WriteLoopsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void TestOneToFive()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(5, writeLoo1.oneToFive());
    }
    @Test
    public void TestOneToTen()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(10, writeLoo1.oneToTen());
    }
    @Test
    public void TestStartAtTwentyOne()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(11, writeLoo1.startAtTwentyOne());
    }

    @Test
    public void TestCountDown()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(100, writeLoo1.countDown());
    }

    @Test
    public void Test2to32()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(0, writeLoo1.byTwoTo32());
    }

    @Test
    public void TestCountDownFrom5000()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(455, writeLoo1.countDownFrom5000());
    }

    @Test
    public void TestNestedFors()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(100, writeLoo1.nestedFors());
    }

    @Test
    public void TestHelloZipCode()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(47, writeLoo1.helloZipCode());
    }

    @Test
    public void TestDriveHome()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(6, writeLoo1.driveHome());
    }



    @Test
    public void TestCheckGameScore()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(3, writeLoo1.checkGameScore());
    }

    @Test
    public void TestCheckGameScoreDoWhile()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(true, writeLoo1.checkGameScoreDoWhile());
    }

    @Test
    public void TestCheckServer()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(3, writeLoo1.checkServerStatus());
    }
    
    @Test
    public void Testloop50by7()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(7, writeLoo1.loop50by7());
        
    }
    
    @Test
    public void Testfoo()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(1, writeLoo1.foo());
        
    }
    
    @Test
    public void TestrewriteFooAsFor()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(1, writeLoo1.rewriteFooAsFor());
    }
}











