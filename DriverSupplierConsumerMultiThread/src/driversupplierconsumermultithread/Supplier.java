/*

 */
package driversupplierconsumermultithread;

import java.util.Random;

//Produces data to be temporarily stored in the Meeting Room prior 
//to be taken away by consumers. 
public class Supplier implements Runnable {

    private MeetingRoom mr;
    public static int supplierNum = 1;
    private final int id = supplierNum;
    private String name;
    Random rand = new Random();
    private int newData;
    Thread t;
    private int nap;
    boolean stopRequested = false;

    //Constructor creates a new thread, assigns it a number,
    //and starts the thread.
    Supplier(MeetingRoom mr) {
        name = Integer.toString(supplierNum);
        supplierNum++;
        this.mr = mr;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
            nap = rand.nextInt(1000) + 1;
            try {
                System.out.println("Supplier " + id + " slept for " + nap
                        + " milliseconds.");
                t.sleep(nap);
            } 
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
            //New data is deleivered into the Meeting Room only if someone 
            //has taken the old data.
            while (!stopRequested) {//Wake up here.
                System.out.println("Supplier " + id + " woke up and attempted to "
                        + "deliver new data. ");
                newData = rand.nextInt(100) + 1;
               stopRequested = mr.deliver(newData, id);
            }
    }

//end class
}
