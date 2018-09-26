
package multithread;

public class MultiThread {

    public static void main(String[] args) {
        
     new NewThread("one");
     new NewThread("two");
     new NewThread("three");
     
     try{
         for (int i = 5; i > 0; i--){
             System.out.println("Main Thread: " + i);
             Thread.sleep(10000);
         }
     }
     catch(InterruptedException e){
         System.out.println("Main thread interupted.");
     }
     System.out.println(("Exit Main"));
        
        
        
        
        
        
        
    }
    
}
