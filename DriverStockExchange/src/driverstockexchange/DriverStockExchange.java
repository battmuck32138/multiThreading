/*
Mathew Buck
Java II Lab A
 */
package driverstockexchange;

public class DriverStockExchange {

    public static void main(String[] args) {
        
        StockExchange se = new StockExchange();
        StockPricePrinter spp = new StockPricePrinter(se);
        StockMonitor sm1 = new StockMonitor(se, 5);
        StockMonitor sm2 = new StockMonitor(se, 10);
        StockMonitor sm3 = new StockMonitor(se, 15);
        StockMonitor sm4 = new StockMonitor(se, 20);
        StockMonitor sm5 = new StockMonitor(se, 25);
        
        
        System.out.println("The Stock Price is starting at $" 
                + se.price + " per share.");
        se.beginTrading();
        
    //end main    
    }
//end class   
}

/*
OUTPUT 

run:
The Stock Price is starting at $100 per share.
Change: 1  Stock Price is: $101 per share.
Change: 2  Stock Price is: $102 per share.
Change: 3  Stock Price is: $103 per share.
Change: 4  Stock Price is: $102 per share.
Change: 5  Stock Price is: $103 per share.
Change: 6  Stock Price is: $104 per share.
Change: 7  Stock Price is: $105 per share.
After 7 changes, the Price is at $105  I'm selling it all and getting out!
Change: 8  Stock Price is: $106 per share.
Change: 9  Stock Price is: $107 per share.
Change: 10  Stock Price is: $108 per share.
Change: 11  Stock Price is: $107 per share.
Change: 12  Stock Price is: $108 per share.
Change: 13  Stock Price is: $107 per share.
Change: 14  Stock Price is: $108 per share.
Change: 15  Stock Price is: $109 per share.
Change: 16  Stock Price is: $110 per share.
After 16 changes, the Price is at $110  I'm selling it all and getting out!
Change: 17  Stock Price is: $111 per share.
Change: 18  Stock Price is: $110 per share.
Change: 19  Stock Price is: $111 per share.
Change: 20  Stock Price is: $110 per share.
Change: 21  Stock Price is: $111 per share.
Change: 22  Stock Price is: $112 per share.
Change: 23  Stock Price is: $113 per share.
Change: 24  Stock Price is: $114 per share.
Change: 25  Stock Price is: $115 per share.
After 25 changes, the Price is at $115  I'm selling it all and getting out!
Change: 26  Stock Price is: $114 per share.
Change: 27  Stock Price is: $115 per share.
Change: 28  Stock Price is: $116 per share.
Change: 29  Stock Price is: $117 per share.
Change: 30  Stock Price is: $118 per share.
Change: 31  Stock Price is: $119 per share.
Change: 32  Stock Price is: $118 per share.
Change: 33  Stock Price is: $117 per share.
Change: 34  Stock Price is: $118 per share.
Change: 35  Stock Price is: $119 per share.
Change: 36  Stock Price is: $120 per share.
After 36 changes, the Price is at $120  I'm selling it all and getting out!
Change: 37  Stock Price is: $119 per share.
Change: 38  Stock Price is: $120 per share.
Change: 39  Stock Price is: $121 per share.
Change: 40  Stock Price is: $122 per share.
Change: 41  Stock Price is: $123 per share.
Change: 42  Stock Price is: $124 per share.
Change: 43  Stock Price is: $123 per share.
Change: 44  Stock Price is: $124 per share.
Change: 45  Stock Price is: $125 per share.
After 45 changes, the Price is at $125  I'm selling it all and getting out!
Change: 46  Stock Price is: $126 per share.
Trading is closed.  All customers have removed themselves
from the stock exchange.
BUILD SUCCESSFUL (total time: 46 seconds)

*/