/*
 Mathew Buck
Java II Lab II
 */
package driverconcurrent.programming;

public class DriverConcurrentProgramming {

    //Test code for computing an array of powers using parallel processing.
    //8 Threads produced the best result for large arrays.
    public static void main(String[] args) {
        
        int sectionSize = 1000;
        int s4 = 10000;
        int s5 = (int)Math.pow(10, 5);
        int s6 = (int)Math.pow(10, 6);
        int s7 = (int)Math.pow(10, 7);
        
        //10^4
        ComputePowerArray c1 = 
                new ComputePowerArray(s4, 1, sectionSize);
        c1.fillPowArr(); 
        ComputePowerArray c2 = 
                new ComputePowerArray(s4, 2, sectionSize);
        c2.fillPowArr();
        ComputePowerArray c3 = 
                new ComputePowerArray(s4, 4, sectionSize);
        c3.fillPowArr();
        ComputePowerArray c4 = 
                new ComputePowerArray(s4, 8, sectionSize);
        c4.fillPowArr();
        
        //10^5
        ComputePowerArray c5 = 
                new ComputePowerArray(s5, 1, sectionSize);
        c5.fillPowArr(); 
        ComputePowerArray c6 = 
                new ComputePowerArray(s5, 2, sectionSize);
        c6.fillPowArr();
        ComputePowerArray c7 = 
                new ComputePowerArray(s5, 4, sectionSize);
        c7.fillPowArr();
        ComputePowerArray c8 = 
                new ComputePowerArray(s5, 8, sectionSize);
        c8.fillPowArr();
        
        //10^6
        ComputePowerArray c9 = 
                new ComputePowerArray(s6, 1, sectionSize);
        c9.fillPowArr(); 
        ComputePowerArray c10 = 
                new ComputePowerArray(s6, 2, sectionSize);
        c10.fillPowArr();
        ComputePowerArray c11 = 
                new ComputePowerArray(s6, 4, sectionSize);
        c11.fillPowArr();
        ComputePowerArray c12 = 
                new ComputePowerArray(s6, 8, sectionSize);
        c12.fillPowArr();
        
    //end class
    }
//end class    
}

/*
OUTPUT

run:
Size = 10000, Runtime was 16 milliseconds,  Array was split into sections of
1000 elements, Threads used = 1.
Size = 10000, Runtime was 18 milliseconds,  Array was split into sections of
1000 elements, Threads used = 2.
Size = 10000, Runtime was 5 milliseconds,  Array was split into sections of
1000 elements, Threads used = 4.
Size = 10000, Runtime was 0 milliseconds,  Array was split into sections of
1000 elements, Threads used = 8.
Size = 100000, Runtime was 31 milliseconds,  Array was split into sections of
1000 elements, Threads used = 1.
Size = 100000, Runtime was 31 milliseconds,  Array was split into sections of
1000 elements, Threads used = 2.
Size = 100000, Runtime was 53 milliseconds,  Array was split into sections of
1000 elements, Threads used = 4.
Size = 100000, Runtime was 47 milliseconds,  Array was split into sections of
1000 elements, Threads used = 8.
Size = 1000000, Runtime was 301 milliseconds,  Array was split into sections of
1000 elements, Threads used = 1.
Size = 1000000, Runtime was 331 milliseconds,  Array was split into sections of
1000 elements, Threads used = 2.
Size = 1000000, Runtime was 270 milliseconds,  Array was split into sections of
1000 elements, Threads used = 4.
Size = 1000000, Runtime was 248 milliseconds,  Array was split into sections of
1000 elements, Threads used = 8.
BUILD SUCCESSFUL (total time: 1 second)


*/