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

    public IceCream(String name, int cost) {
        super(name);
        this.icCost = cost;
    }

    public String toString() {  
        return null;
    }

    
    
    @Override
    public int getCost() {
        return icCost;
    }
}
