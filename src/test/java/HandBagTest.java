/*
 * This file contains JUnit test cases for HandBag.java and the
 * methods from Bag.java.
 *
 * You should NOT modify this file! When you push Basics.java to
 * GitHub, it should run these tests. You can see the results in the
 * "Actions" tab of your repository.
 */

import org.junit.*;

import static org.junit.Assert.*;


public class HandBagTest {
    HandBag b;

    @Before
    public void setUp() throws Exception {
        b = new HandBag("Blue", 4);
    }

    @Test(timeout = 50)
    public void testGetColor() {
        assertEquals("Blue", b.getColor());
    }

    @Test(timeout = 50)
    public void testGetNumberOfContentsEmpty() {
        assertEquals(0, b.getNumberOfContents());
    }

    @Test(timeout = 50)
    public void testGetNumberOfContentsNonEmpty() {
        b.addItem("Cheese");
        b.addItem("Eggs");
        assertEquals(2, b.getNumberOfContents());
    }

    @Test(timeout = 50)
    public void testGetNumberOfContentsPop() {
        b.addItem("Cheese");
        b.addItem("Eggs");
        assertEquals("Eggs", b.popItem());
        assertEquals(1, b.getNumberOfContents());
    }

    @Test(timeout = 50)
    public void TestGetCapacity() {
        assertEquals(4, b.getCapacity());
    }

    @Test(timeout = 50)
    public void TestSetColor() {
        b.setColor("Red");
        assertEquals("Red", b.getColor());
    }

    @Test(timeout = 50)
    public void TestIncreaseCapacity() {
        b.increaseCapacity(2);
        assertEquals(6, b.getCapacity());
    }

    @Test(timeout = 50)
    public void TestEnhance() {
        b.enhance();
        assertEquals(5, b.getCapacity());
    }

}