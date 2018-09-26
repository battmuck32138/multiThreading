/*
Mathew Buck
Java II Lab A
 */
package driversupplierconsumermultithread;

//Test code for Supplier / Consumer Multithread Exercise
public class DriverSupplierConsumerMultiThread {

    public static void main(String[] args) {
        
        MeetingRoom mr = new MeetingRoom();
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        new Supplier(mr);
        new Consumer(mr);
        
    //end main
    }
    
//end class    
}

/*
OUTPUT

run:
Supplier 1 slept for 829 milliseconds.
Consumer 1 attempted to take new data, then slept for 671 milliseconds.
Supplier 2 slept for 997 milliseconds.
Consumer 2 attempted to take new data, then slept for 266 milliseconds.
Supplier 3 slept for 233 milliseconds.
Consumer 3 attempted to take new data, then slept for 80 milliseconds.
Supplier 4 slept for 171 milliseconds.
Supplier 5 slept for 164 milliseconds.
Consumer 5 attempted to take new data, then slept for 995 milliseconds.
Supplier 6 slept for 329 milliseconds.
Consumer 6 attempted to take new data, then slept for 947 milliseconds.
Supplier 7 slept for 362 milliseconds.
Consumer 7 attempted to take new data, then slept for 847 milliseconds.
Consumer 4 attempted to take new data, then slept for 216 milliseconds.
Consumer 8 attempted to take new data, then slept for 740 milliseconds.
Supplier 9 slept for 398 milliseconds.
Supplier 10 slept for 408 milliseconds.
Consumer 9 attempted to take new data, then slept for 880 milliseconds.
Supplier 8 slept for 650 milliseconds.
Consumer 10 attempted to take new data, then slept for 206 milliseconds.
Consumer 3 attempted to take new data, then slept for 672 milliseconds.
Supplier 5 woke up and attempted to deliver new data. 
Supplier 5 delivered new data 21 to Meeting Room.
Supplier 4 woke up and attempted to deliver new data. 
Supplier 3 woke up and attempted to deliver new data. 
Supplier 6 woke up and attempted to deliver new data. 
Supplier 7 woke up and attempted to deliver new data. 
Supplier 9 woke up and attempted to deliver new data. 
Supplier 10 woke up and attempted to deliver new data. 
Supplier 8 woke up and attempted to deliver new data. 
Supplier 1 woke up and attempted to deliver new data. 
Supplier 2 woke up and attempted to deliver new data. 
Consumer 5 removed data: 21 from Meeting Room. Consumer 5 is ending his thread.
Consumer 1 attempted to take new data, then slept for 145 milliseconds.
Consumer 6 attempted to take new data, then slept for 999 milliseconds.
Consumer 2 attempted to take new data, then slept for 266 milliseconds.
Supplier 2 delivered new data 96 to Meeting Room.
Supplier 1 woke up and attempted to deliver new data. 
Supplier 8 woke up and attempted to deliver new data. 
Supplier 10 woke up and attempted to deliver new data. 
Supplier 9 woke up and attempted to deliver new data. 
Supplier 3 woke up and attempted to deliver new data. 
Supplier 6 woke up and attempted to deliver new data. 
Supplier 7 woke up and attempted to deliver new data. 
Supplier 4 woke up and attempted to deliver new data. 
Consumer 2 removed data: 96 from Meeting Room. Consumer 2 is ending his thread.
Consumer 4 attempted to take new data, then slept for 620 milliseconds.
Supplier 6 delivered new data 5 to Meeting Room.
Supplier 4 woke up and attempted to deliver new data. 
Supplier 9 woke up and attempted to deliver new data. 
Consumer 6 removed data: 5 from Meeting Room. Consumer 6 is ending his thread.
Supplier 1 woke up and attempted to deliver new data. 
Supplier 8 woke up and attempted to deliver new data. 
Supplier 10 woke up and attempted to deliver new data. 
Supplier 3 woke up and attempted to deliver new data. 
Supplier 7 woke up and attempted to deliver new data. 
Consumer 9 attempted to take new data, then slept for 74 milliseconds.
Consumer 8 attempted to take new data, then slept for 557 milliseconds.
Consumer 7 attempted to take new data, then slept for 865 milliseconds.
Consumer 1 attempted to take new data, then slept for 156 milliseconds.
Consumer 10 attempted to take new data, then slept for 396 milliseconds.
Consumer 3 attempted to take new data, then slept for 704 milliseconds.
Supplier 7 delivered new data 20 to Meeting Room.
Supplier 4 woke up and attempted to deliver new data. 
Consumer 7 removed data: 20 from Meeting Room. Consumer 7 is ending his thread.
Consumer 10 attempted to take new data, then slept for 160 milliseconds.
Consumer 8 attempted to take new data, then slept for 469 milliseconds.
Consumer 4 attempted to take new data, then slept for 273 milliseconds.
Supplier 4 delivered new data 15 to Meeting Room.
Supplier 9 woke up and attempted to deliver new data. 
Supplier 1 woke up and attempted to deliver new data. 
Supplier 8 woke up and attempted to deliver new data. 
Supplier 10 woke up and attempted to deliver new data. 
Supplier 3 woke up and attempted to deliver new data. 
Consumer 4 removed data: 15 from Meeting Room. Consumer 4 is ending his thread.
Supplier 3 delivered new data 64 to Meeting Room.
Supplier 10 woke up and attempted to deliver new data. 
Supplier 1 woke up and attempted to deliver new data. 
Supplier 8 woke up and attempted to deliver new data. 
Supplier 9 woke up and attempted to deliver new data. 
Consumer 3 removed data: 64 from Meeting Room. Consumer 3 is ending his thread.
Consumer 1 attempted to take new data, then slept for 645 milliseconds.
Supplier 1 delivered new data 9 to Meeting Room.
Supplier 10 woke up and attempted to deliver new data. 
Consumer 1 removed data: 9 from Meeting Room. Consumer 1 is ending his thread.
Supplier 8 delivered new data 74 to Meeting Room.
Supplier 9 woke up and attempted to deliver new data. 
Supplier 10 woke up and attempted to deliver new data. 
Consumer 8 removed data: 74 from Meeting Room. Consumer 8 is ending his thread.
Consumer 9 attempted to take new data, then slept for 392 milliseconds.
Consumer 10 attempted to take new data, then slept for 717 milliseconds.
Supplier 9 delivered new data 50 to Meeting Room.
Consumer 9 removed data: 50 from Meeting Room. Consumer 9 is ending his thread.
Supplier 10 delivered new data 53 to Meeting Room.
Consumer 10 removed data: 53 from Meeting Room. Consumer 10 is ending his thread.
BUILD SUCCESSFUL (total time: 2 seconds)

*/