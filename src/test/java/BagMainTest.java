/*
 * This file contains JUnit test cases for BagMainTest.java and the
 * methods from the other Bag classes.
 *
 * You should NOT modify this file! When you push Basics.java to
 * GitHub, it should run these tests. You can see the results in the
 * "Actions" tab of your repository.
 */

import org.junit.*;

import static org.junit.Assert.*;


public class BagMainTest {
    Bag[] bags;

    @Before
    public void setUp() throws Exception {
        bags = new Bag[] {new HandBag("Blue", 2),
                          new CrossbodyBag("Red", 3, 2),
                          new HandBag("Yellow", 4),
                          new CrossbodyBag("Orange", 5, 4)};
    }

    @Test(timeout = 50)
    public void TestEnhanceBagsTrue() {
        BagMain.enhanceBags(bags, true);
        assertEquals(4, bags[0].getCapacity());
        assertEquals(5, bags[1].getCapacity());
        assertEquals(6, bags[2].getCapacity());
        assertEquals(7, bags[3].getCapacity());
    }
    @Test(timeout = 50)
    public void TestEnhanceBagsFalse() {
        BagMain.enhanceBags(bags, false);
        assertEquals(3, bags[0].getCapacity());
        assertEquals(5, bags[1].getCapacity());
        assertEquals(5, bags[2].getCapacity());
        assertEquals(7, bags[3].getCapacity());
    }

    @Test(timeout = 50)
    public void TestCountCrossbodyStraps() {
        assertEquals(6, BagMain.countCrossbodyStraps(bags));
    }

}