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
    //Stores the name of the candy 
    private String candyName;
    //Stores the weight of the candy 
    private double candyWeight;
    //Stores the price per pounds of the candy
    private int pricePerLbs;
    
    
    
    public Candy(String name, double weight, int pricePerLbs){
        this.candyName = name;
        this.candyWeight = weight;
        this.pricePerLbs = pricePerLbs;
        

    }

 
    
    public String toString()
    {
        return null;
       
    }

    @Override
    public int getCost() {
       return pricePerLbs;
    }
}
