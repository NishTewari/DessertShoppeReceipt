/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Sundae extends IceCream {

    //Instance Variables
    //Stores the name of the topping 
    private String toppingName;
    //Stores the cost of the topping 
    private int toppingCost;

    /**
     * Constructor to initialize the instance variables 
     * @param icName name of the ice Cream
     * @param icCost cost of the ice Cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        super(icName, icCost);

        //initializes both the topping cost and name
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    /**
     * a method to get the topping name 
     * @return the topping name 
     */
    public String getTName() {
        return toppingName;
    }

    /**
     *  a method to get the topping cost 
     * @return the topping cost
     */
    public int getToppingCost() {
        return toppingCost;
    }

    public String toString() {
        //Converts the cost of the candy 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate the amount of spaces.
        int numOfSpaces = 30 - this.getTName().length() - output.length();
        //for loop to print out the extact number of spaces needed
        for (int i = 0; i < numOfSpaces; i++) {
            output = "," + output;
            
        }
        
        return null;
    }

}
