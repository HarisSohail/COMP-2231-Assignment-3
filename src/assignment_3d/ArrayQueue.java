/**
 * ArrayQueue.java
 *
 * 
 * COMP 2231 Assignment 3 Question 4
 * 
 * Implementing a queue using a java.util.ArrayList.
 */
package assignment_3d;

import java.util.ArrayList;
import java.util.ListIterator;

import jsjf.QueueADT;
import jsjf.exceptions.EmptyCollectionException;

public class ArrayQueue<T> implements QueueADT<T> 
{
    private ArrayList queue;
    private static final int DEFAULT_CAPACITY = 10;
    
    /**
     * Creates an empty queue using the default capacity.
     */    
    public ArrayQueue()
    {
        this(DEFAULT_CAPACITY);
    }//end ArrayQueue
    
    /**
     * Creates an empty queue using the specified capacity.
     * @param size the initial size of the array
     */    
    public ArrayQueue(int size)
    {
        queue = new ArrayList(size);
    }//end ArrayQueue
    
    /**
     * Adds the specified element to the queue.
     * @param element generic element to be put into queue
     */
    public void enqueue(T element)
    {
        queue.add(element);
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
        
        return (T)queue.remove(0);
    }//end dequeue

    /**
     * Returns a reference to the element at front of this queue.
     * The element is not removed from the queue.
     * @return element at front of queue
     * @throws EmptyCollectionException if queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        
        return (T)queue.get(0);
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
    }//end to String
    
}//end ArrayQueue Class

/*
References:
Assistance from CircularArrayQueue Source Code
Assistance from Chapter 16 Iterators
Assistance from java api ArrayList/ListIterator
Assistance from https://stackoverflow.com/questions/29121371/arraylist-to-emulate-a-queue-java
Assistance from http://faculty.washington.edu/moishe/javademos/ArrayQueue.java
*/