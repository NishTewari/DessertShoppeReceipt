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
    //Stores the cookie name(Ex.Choc.chip Cookie)
    private String cookieName;
    //Stores the weight of the cookies 
    private int numOfCookie;
    //Stores the price per pound
    private int pricePerDoz;
    
    public Cookie(String name, int number, int pricePer12) {
        this.cookieName = name;
        this.numOfCookie = number;
        this.pricePerDoz = pricePer12;
        
        
    }

    
    public String toString() {
        return null;
        
    }

    @Override
    public int getCost() {
        return pricePerDoz;
    }
    
}
