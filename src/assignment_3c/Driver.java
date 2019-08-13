/**
 * LinkedQueueDriver.java
 *
 * 
 * COMP 2231 Assignment 3 Question 3
 */
package assignment_3c;

import jsjf.exceptions.EmptyCollectionException;

public class Driver 
{
    public static void main(String[] args) 
    {
        LinkedQueue<Integer> queueTest = new LinkedQueue();
    
        System.out.println("=================================");
        System.out.println("           EMPTY QUEUE           ");
        System.out.println("=================================");
	System.out.println("size of queue is " + queueTest.size());
        System.out.println("is the queue empty: " + queueTest.isEmpty());
        System.out.println("Queue:");
	System.out.println(queueTest);
        
	System.out.println("---------Dequeue empty queue---------");
        try 
        {
            queueTest.dequeue();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
        
	System.out.println("--------First empty queue---------");
        try 
        {
            queueTest.first();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
    
        System.out.println("=================================");
        System.out.println("              QUEUE              ");
	System.out.println("=================================");
        System.out.println("-----------Making queue----------");
        System.out.println("Enqueue 1");
	queueTest.enqueue(1);
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();

	System.out.println("Enqueue 2");
	queueTest.enqueue(2);
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();

        System.out.println("Enqueue 3");
	queueTest.enqueue(3);
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();
        
        System.out.println("Enqueue 4");
	queueTest.enqueue(4);
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();
        
        System.out.println("Enqueue 5");
	queueTest.enqueue(5);
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();

	System.out.println("---------Checking queue----------");
	System.out.println("size of queue is " + queueTest.size());
        System.out.println("is the queue empty: " + queueTest.isEmpty());
	System.out.println();
        
        System.out.println("First should be 1");
	System.out.println("First: " + queueTest.first());
	System.out.println();
        
        System.out.println("Dequeue from queue");
	System.out.println("Dequeued: " + queueTest.dequeue());
	System.out.println("Queue:");
	System.out.println(queueTest);
	System.out.println();
    }//end main
    
}//end Driver
