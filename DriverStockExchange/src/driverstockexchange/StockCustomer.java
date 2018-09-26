/*
Mathew Buck
Java II Lab A
 */
package driverstockexchange;

public class StockCustomer implements Runnable, StockObserver {

    StockExchange se = new StockExchange();
    Thread t = new Thread(this);

    StockCustomer(StockExchange se) {
        this.se = se;
        t = new Thread(this);
        t.start();
    }
    
    //adds the customer to the stock exchange and yields control
    public void run(){
        try{
            se.addObserver(this);
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(t + " was interrupted.");
        }
    }
    
    //child methods perform the only usefull tasks through polymorphism
    public void priceChanged(PriceChangeEvent pce){
    }

//end class
}
