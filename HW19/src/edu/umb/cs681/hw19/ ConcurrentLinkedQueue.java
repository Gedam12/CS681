package edu.umb.cs681.hw19;

import java.util.concurrent.*;
 
class ConcurrentLinkedQueue {
   
    public static void main(String[] args)
    {
        ConcurrentLinkedQueue<Integer>
            clq = new ConcurrentLinkedQueue<Integer>();
 
        clq.add(12);
        clq.add(70);
        clq.add(1009);
        clq.add(475);
 
        // Displaying the existing LinkedQueue
        System.out.println("ConcurrentLinkedQueue: "
                           + clq);
 
        ConcurrentLinkedQueue<Integer>
            clq1 = new ConcurrentLinkedQueue<Integer>(clq);
 
        System.out.println("ConcurrentLinkedQueue1: "
                           + clq1);
    }
}
