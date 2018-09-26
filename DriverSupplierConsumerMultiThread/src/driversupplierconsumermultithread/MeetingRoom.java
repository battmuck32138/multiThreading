/*
Mathew Buck
 */
package driversupplierconsumermultithread;

//Acts as a Que that can only hold 1 item at a time, first in first out.
//Data can only be removed by the consumer with the same ID as the 
//suppler who left it in the meeting room.
import java.util.Random;

public class MeetingRoom {

    int data;
    int takenData;
    boolean hasNewData = false;
    int nap;
    Random rand = new Random();
    int key;

    //Takes data left by the supplier with a mathing id number.
    synchronized boolean takeData(int id) {
        //If there isn't any new data ready to be taken, wait.
        while (!hasNewData) {
            try {
                nap = rand.nextInt(1000) + 1;
                System.out.println("Consumer " + id + " attempted to take new"
                        + " data, then slept for " + nap + " milliseconds.");
                wait(nap);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }
        //If new data is ready to be taken, take it, notify all that 
        //more new data can be delivered. 
        //Returns true if data was acully taken and false otherwise
        if (id == key) {//wake up here
            takenData = data;
            data = 0;
            System.out.println("Consumer " + id + " removed data: " + takenData
                    + " from Meeting Room. Consumer " 
                    + id + " is ending his thread.");
            hasNewData = false;
            notifyAll();
            return true;
        }
        return false;
    }

    //Delivers new data if, and only if, the meeting room is empty.
    synchronized boolean deliver(int newData, int id) {
        //If there is already new data in the Meeting Room waiting to
        //be picked up, wait.
        if (hasNewData) {
            try {
                wait();
            } 
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }
        //If the Meeting Room is empty and ready for new data to 
        //be delivered, deliver the new data and notify the appropriate 
        //consumer thats its ready to be picked up.
        while (!hasNewData) {
            data = newData;
            hasNewData = true;
            key = id;
            System.out.println("Supplier " + id + " delivered new data " 
                    + data + " to Meeting Room.");
            notify();
            return true;
        }
        return false;
    }

//end Meeting Room    
}
