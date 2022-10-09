/*
 * This file contains JUnit test cases for CrossbodyBag.java and the
 * methods from Bag.java.
 *
 * You should NOT modify this file! When you push Basics.java to
 * GitHub, it should run these tests. You can see the results in the
 * "Actions" tab of your repository.
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CrossbodyBagTest {
    CrossbodyBag b;

    @Before
    public void setUp() throws Exception {
        b = new CrossbodyBag("Blue", 4, 2);
    }

    @Test(timeout = 50)
    public void TestGetNumberOfStraps() {
        b.enhance();
        assertEquals(2, b.getNumberOfStraps());
    }

    @Test(timeout = 50)
    public void TestEnhance() {
        b.enhance();
        assertEquals(6, b.getCapacity());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("Blue Crossbody Bag with 2 straps (0 / 4)", b.toString());
    }

}