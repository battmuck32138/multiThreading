/*
Mathew Buck
Java II Lab A
 */
package driverstockexchange;

//class is used to communicate the new stock pice to the customers
public class PriceChangeEvent {
    StockExchange se = new StockExchange();
    int price = 0;
    
    PriceChangeEvent(StockExchange se, int price){
        this.se = se;
        this.price = price;
    }
    
    public int getPrice(){
        return se.price;
    }
    
//end class
}
