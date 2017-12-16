/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class IceCream extends DessertItem {
    //Instance Variables
    //Stores the cost of the ice cream 
    private int icCost;

    /**
     * Constructor to initialize the instance variables
     * @param name the name of the ice cream
     * @param cost  the cost of the ice cream
     */
    public IceCream(String name, int cost) {
        //Gets the name from the super class (DessertItem)
        super(name);
        this.icCost = cost;
    }

    /**
     * A method that returns the string drawing of the object. 
     * @return the name of the ice cream and cost of the ice cream.
     */
    public String toString() { 
        //Converts the cost of the iceCream
        String output = DessertShoppe.cents2dollarsAndCents(this.icCost);
        //Calculates the amount of spaces left over 
        int numOfSpaces = 30 - this.getName().length() - output.length();
        // keep addding space according to the number of spaces left
        for (int i = 0; i < numOfSpaces; i++) {
            output = " " + output;
        }
 
        return this.getName() + output;
    }

    
    /**
     * a method to return the cost of ice cream
     * @return the ice cream cost
     */
    @Override
    public int getCost() {
        return icCost;
    }
}
