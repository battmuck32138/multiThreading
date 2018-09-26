/*
 */
package multithread;

public class NewThread implements Runnable {
    String name;
    Thread t;
    
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }
    
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println(name + ": " + t);
        t.start();
    }
    
    
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name + " interurppted.");
        }
        System.out.println("Exiting " + name);
   
    
}
    
    
}
