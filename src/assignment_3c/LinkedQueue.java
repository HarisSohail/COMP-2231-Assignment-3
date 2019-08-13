/**
 * LinkedQueue.java
 *
 * 
 * COMP 2231 Assignment 3 Question 3
 * 
 * Implementing a queue using a java.util.LinkedList.
 */
package assignment_3c;

import java.util.LinkedList;
import java.util.ListIterator;

import jsjf.QueueADT;
import jsjf.exceptions.EmptyCollectionException;

public class LinkedQueue<T> implements QueueADT<T> 
{
    private LinkedList queue;

    /**
     * Creates an empty queue.
     */    
    public LinkedQueue()
    {
        queue = new LinkedList();
    }//end LinkedQueue
    
    /**
     * Adds the specified element to the queue.
     * @param element generic element to be put into queue
     */
    public void enqueue(T element)
    {
        queue.addLast(element);
    }//end enqueue
    
    /**
     * Removes the element from front of this queue.
     * @return element at front of queue
     * @throws EmptyCollectionException if queue is empty
     */
    public T dequeue() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        
        return (T)queue.remove();
    }//end dequeue

    public T first() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        
        return (T)queue.peekFirst();
    }//end first
    
    /**
     * Returns true if this queue is empty and false otherwise.
     * @return true if this queue is empty
     */ 
    public boolean isEmpty()
    {
        return (queue.isEmpty());
    }//end isEmpty

    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in the queue
     */
    public int size()
    {
        return queue.size();
    }//end size
    
    /**
     * Returns a string representation of this queue
     * @return a string representation of the queue
     */    
//    @Override
    public String toString()
    {
        String output = "[Front]";
        ListIterator<T> stackIterator = queue.listIterator();
        
        if(queue.isEmpty())
        {
            return "The queue is empty";
        }//end if    
        else
        {
            while(stackIterator.hasNext())
            {
                output += "[" + stackIterator.next() + "]";
            }//end while
        }//end else
                
        output += "[Back]";
        return output;
    }//end toString
    
}//end LinkedQueue Class

/*
References:
Assistance from Linked Queue Source Code
Assistance from Chapter 16 Iterators
Assistance from java api LinkedList/ListIterator
Assistance from http://faculty.washington.edu/moishe/javademos/ch07%20Code/jss2/LinkedQueue.java
*/