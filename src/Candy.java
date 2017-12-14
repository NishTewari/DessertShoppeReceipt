/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Candy extends DessertItem {

    //Instance Variables
    //Stores the weight of the candy 
    private double candyWeight;
    //Stores the price per pounds of the candy
    private int pricePerLbs;

    /**
     * Constructor to initialize the instance variables
     * @param name the name of the candy 
     * @param weight the weight of the candy 
     * @param pricePerLbs the price per pounds of the candy   
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.candyWeight = weight;
        this.pricePerLbs = pricePerLbs;

    }

    public String toString() {
        return null;
    }

    /**
     * a method to get the weight of the candy
     * @return the candy weight
     */
    public double getWeight() {
        return candyWeight;

    }

    /**
     * a method to get the price per pound of candy 
     * @return the price per pound
     */
    public int getpricePerLbs() {
        return pricePerLbs;
    }

    /**
     * a method to calculate the total cost of candy 
     * @return 
     */
    @Override
    public int getCost() {
        return pricePerLbs;
    }
}
