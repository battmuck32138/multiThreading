/*
Mathew Buck
Java II Lab II
 */
package driverconcurrent.programming;

import java.util.Random;

//Class that fills an array with a base number risen to a power.
//Uses multithreading / parallel programing. 
//Large arrays were filled fastes with 8 threads. 
public class ComputePowerArray implements Runnable {

    private int currentIndex;
    int stop;
    private final int arrSize;
    private final int numThreads;
    private int threadsLeft;
    private final int sectionSize;
    private double[] numsArr;//base numbers
    private double[] exponArr;//exponents
    public double[] powArr;//final values (10^2 = 100)
    private boolean stopRequest = false;
    private long begin;
    private long end;
    private long runTime;

    //Constructor
    public ComputePowerArray(int arrSize, int numThreads, int sectionSize) {
        currentIndex = 0;
        this.arrSize = arrSize;
        this.numThreads = numThreads;
        this.threadsLeft = numThreads;
        this.sectionSize = sectionSize;
        stop = sectionSize;
        numsArr = randArr(arrSize);
        exponArr = randArr(arrSize);
        powArr = new double[arrSize];
    }
    
    //Loads the powArr with final values.
    public void fillPowArr() {
        begin = System.currentTimeMillis();
        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(this);
            t.start();
        }
    }

    //Calculates the final values for the power array.
    public synchronized void calcValues(int start, int stop) {
        for (int i = start; i < stop; i++) {
            powArr[i] = Math.pow(numsArr[i], exponArr[i]);
        }
    }

    //Creates an array of random doubles.
    public double[] randArr(int size) {
        double[] arr = new double[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }

    @Override
    public synchronized void run() {
        while (!stopRequest) {
            //Last itteration.
            if (currentIndex + sectionSize >= arrSize) {
                stop = currentIndex + (arrSize - currentIndex);
                stopRequest = true;
            }
            calcValues(currentIndex, stop);
            currentIndex = stop;
            stop = currentIndex + sectionSize;
        }
        threadsLeft--;
        if (threadsLeft == 0) {
            end = System.currentTimeMillis();
            runTime = end - begin;
            System.out.println("Size = " + arrSize + ", Runtime was " 
                    + runTime + " milliseconds,  Array was split into "
                            + "sections of " + sectionSize + " elements, "
                                    + "Threads used = " + numThreads + ".");
        }
    }

    @Override
    public String toString() {
        int elemNum = 0;
        String s = "[";
        for (int i = 0; i < arrSize; i++) {
            s+= "elem#" + elemNum + "(";
            elemNum++;
            s += powArr[i];
            s += ")";
            if (i != arrSize - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
