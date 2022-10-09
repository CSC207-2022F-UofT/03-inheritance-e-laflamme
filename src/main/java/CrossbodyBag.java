/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag {

    private int numberOfStraps;

    /**
     * Creates a new Crossbody Bag with the given color, capacity, and number of straps.
     *
     * @param color a String of the color of the bag
     * @param capacity an int representing the capacity of the bag
     * @param numberOfStraps an int representing the number of straps of the bag
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps){
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Increase the capacity of the bag by 2.
     */
    @Override
    public void enhance() {
        increaseCapacity(2);
    }

    /**
     * Return the details of this Crossbody Bag, including the number of straps.
     * @return a String representation of this Crossbody Bag
     */
    @Override
    public String toString() {
        return super.getColor() + " Crossbody Bag with " + this.numberOfStraps + " straps (" +
                super.getNumberOfContents() + " / " + super.getCapacity() + ")";
    }
}

