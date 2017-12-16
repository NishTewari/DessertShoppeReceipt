/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Cookie extends DessertItem {

    //Instance Variables
    //Stores the weight of the cookies 
    private int numOfCookie;
    //Stores the price per pound
    private int pricePerDoz;

    /**
     * Constructor to initialize the instance variables
     * @param name the name of the cookie
     * @param number the amount of cookies
     * @param pricePer12 the price for each dozen of cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        //Gets the name from the super class(DessertItem)
        super(name);
        //initialize the number of cookies
        this.numOfCookie = number;
        //initialize the price for each dozen of cookies
        this.pricePerDoz = pricePer12;

    }
    /**
     * A method that returns the string drawing of the object
     * @return the name, the amount, price per dozen and cost of the cookies
     */
    public String toString() {
        //Converts the cost of the cookie 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //Calculate the amount of spaces left over
        int numOfSpaces = 30 - this.getName().length() - output.length();
        //Keep adding space according to the number of spaces left
        for (int i = 0; i < numOfSpaces; i++) {
            output = " " + output;
        }
        return this.numOfCookie + " @ $" + (this.pricePerDoz*0.01) + " /dz\n"
                + this.getName() + output;

    }

    /**
     * get the number of cookies
     * @return the number of cookies
     */
    public int getNumber() {
        return numOfCookie;
    }

    /**
     * a method to calculate the total cost of the cookies 
     * @return cost
     */
    @Override
    public int getCost() {
       int cost = (this.numOfCookie * this.pricePerDoz) / 12;
       return cost;
    }

}
