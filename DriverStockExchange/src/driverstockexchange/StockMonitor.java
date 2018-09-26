/*
Mathew Buck
Java II Lab A
 */
package driverstockexchange;

//adds a customer to the stock exchange and removes him once 
//the stock price has met the required threshold
public class StockMonitor extends StockCustomer implements StockObserver {
    int steps = 0;
    int highPrice = 0;
    int lowPrice = 0;
    
    StockMonitor(StockExchange se, int steps){
        super(se);
        this.steps = steps;
        lowPrice = se.price - steps;
        highPrice = se.price + steps;
    }
    
    //removes the customer after the stock reaches x amount of 
    //dollars up or down in price
    public void priceChanged(PriceChangeEvent pce){
        if(pce.price == lowPrice || pce.price == highPrice){
            
            se.remObserver(this);
            System.out.println("After " + se.numChanges 
                    + " changes, the Price is at $" 
                    + pce.price + "  I'm selling it all and getting out!");
        }
    }
    
    public String toString(){
        return "Get out at: " + steps;
    }
}
