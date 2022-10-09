/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int capacity;
    private String[] contents;
    private int numberOfContents;


    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.contents = new String[0];
        this.numberOfContents = 0;
    }



    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    public String getColor() {
        return color;
    }
    public int getNumberOfContents() {
        return numberOfContents;
    }
    public int getCapacity() {
        return capacity;
    }

    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            numberOfContents += 1;
            String[] newContents = new String[this.numberOfContents];
            for(int i = 0; i < this.contents.length; i++){
                newContents[i] = this.contents[i];
            }
            newContents[(this.numberOfContents - 1)] = item;
            this.contents = newContents;
            return true;
        }
        return false;
    }




    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem(){
        if (this.numberOfContents > 0){
            numberOfContents -= 1;
            String ret = this.contents[(this.numberOfContents)];
            String[] newContents = new String[this.numberOfContents];
            for(int i = 0; i < newContents.length; i++){
                newContents[i] = this.contents[i];
            }
            this.contents = newContents;
            return ret;
        }
        return null;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
