/*
Mathew Buck
Java II Lab A
 */
package driversupplierconsumermultithread;

import java.util.Random;

//Takes data away from the meeting room if, and only if, it was left 
//by a supplier with the same id number.
public class Consumer implements Runnable {
    private MeetingRoom mr;
    public static int consumerNum = 1;
    private final int id = consumerNum;
    private String name;
    Thread t;
    Random rand = new Random();
    int nap;
    boolean stopRequested = false;
    

    Consumer(MeetingRoom mr){
        this.mr = mr;
        name = Integer.toString(consumerNum);
        consumerNum++;
        t = new Thread(this, name);
        t.start();
    }
    
    //Runs until new data has acutally been taken by a consumer with
    //a matching ID as the the supplier who left it. 
    public void run() {
        while (!stopRequested) {
            stopRequested = mr.takeData(id);
        }
    }
    
//end class    
}
