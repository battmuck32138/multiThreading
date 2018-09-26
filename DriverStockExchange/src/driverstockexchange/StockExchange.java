/*
Mathew Buck
Java II LaB A
 */
package driverstockexchange;

import java.util.ArrayList;
import java.util.Random;

public class StockExchange implements Runnable {

    int price = 100;//initial price of stock
    ArrayList<StockCustomer> customerList = new ArrayList<>();
    int numCustomers = 0;
    Random rand = new Random();
    int change = 0;
    int numChanges = 0;
    Thread t = new Thread(this);
    
    
    //start() begins executing at run()
    synchronized public void beginTrading() {
        t.start();
    }

    //changes the stock price by 1 dollar per second and yields control
    //I changed it to a 66.6% chance that the stock rises to save paper
    //the output was going forever at 50/50
    synchronized public void run() {
        try {
            while (numCustomers > 0) {
                int change = rand.nextInt(4);
                price = (change != 1 ? price + 1 : price - 1);
                numChanges++;
                PriceChangeEvent pce = new PriceChangeEvent(this, price);
                informCustomers(pce);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread interupted.");
        }
    }
    
    //informs all customers in the exchange of the new stock price as 
    //it moves up or down once per second
    synchronized public void informCustomers(PriceChangeEvent pce){
        for(int i = 0; i < numCustomers; i++){
            customerList.get(i).priceChanged(pce);
        }
    }

    //adds customers to the exchange
    synchronized public void addObserver(StockCustomer sc) {
        customerList.add(sc);
        numCustomers++;
    }

    //removes customers from the exchange
    synchronized public void remObserver(StockCustomer sc) {
        customerList.remove(sc);
        numCustomers--;
    }

    synchronized public String toString() {
        return customerList.toString();
    }
    
//end class
}
