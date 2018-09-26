/*
Mathew Buck
Java II Lab A
 */
package driverstockexchange;

//prints the stockprice after each change
public class StockPricePrinter extends StockCustomer implements StockObserver {

    StockPricePrinter(StockExchange se) {
        super(se);
    }
    
    public void priceChanged(PriceChangeEvent pce){
        System.out.println("Change: " + se.numChanges 
                + "  Stock Price is: $" + pce.price + " per share.");
        if(se.numCustomers == 1){
            se.remObserver(this);
            System.out.println("Trading is closed.  "
                    + "All customers have removed themselves from "
                    + "the stock exchange.");
        }
    }
    
//end class
}
