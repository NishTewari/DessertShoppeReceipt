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
        super(name);
        //initialize the number of cookies
        this.numOfCookie = number;
        //initialize the price for each dozen of cookies
        this.pricePerDoz = pricePer12;

    }

    public String toString() {
        String output = "";
        output += this.pricePerDoz + "\n";
        output += this.getName() + "\n";
        return output;

    }

    /**
     * get the number of cookies
     * @return the number of cookies
     */
    public int getNumber() {
        return numOfCookie;
    }

    /**
     * a method to calculate the total of the cookies 
     * @return cost
     */
    @Override
    public int getCost() {
       int cost = (this.numOfCookie / 12) * this.pricePerDoz;
       return cost;
    }

}
