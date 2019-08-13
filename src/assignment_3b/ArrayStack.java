/**
 * ArrayStack.java
 *
 * 
 * COMP 2231 Assignment 3 Question 2
 * 
 * Implementing a stack using a java.util.ArrayList.
 */
package assignment_3b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import jsjf.StackADT;
import jsjf.exceptions.EmptyCollectionException;

public class ArrayStack<T> implements StackADT<T> 
{
    private ArrayList stack;
    private static final int DEFAULT_CAPACITY = 10;    
    
    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }//end ArrayStack
    
    /**
     * Creates an empty stack using the specified capacity.
     * @param size the initial size of the array
     */
    public ArrayStack(int size)
    {
        stack = new ArrayList(size);
    }//end ArrayStack
    
    /**
     * Adds the specified element to the top of this stack
     * @param element generic element to be pushed onto stack
     */
    public void push(T element)
    {
        stack.add(element);
    }//end push
    
    /**
     * Removes the element at the top of this stack
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");
        
        return (T)stack.remove(size()-1);     
    }//end pop
    
    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek()
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");
        
        return (T)stack.get(size()-1);
    }//edn peek
    
    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if this stack is empty
     */
    public boolean isEmpty()
    {
        return (stack.isEmpty());
    }//end isEmpty

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size()
    {
        Iterator itr = stack.iterator();
        int i = 0;
        while(itr.hasNext())
        {
            Object size = itr.next();
            i++;
        }    
        return i;
        //return stack.size();
    }//end size    
    
    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
//    @Override
    public String toString()
    {
        String output = "";
        ListIterator<T> stackIterator = stack.listIterator(size());
        
        if(stack.isEmpty())
        {
            return "The stack is empty";
        }//end if
        else
        {
            while(stackIterator.hasPrevious())
            {
                output += stackIterator.previous() + "\n";
            }//end while
        }//end else
        return output;
    }//end toString
    
}//end ArrayStack Class

/*
References:
Assistance from Array Stack Source Code
Assistance from Chapter 16 Iterators
Assistance from java api ArrayList/ListIterator
Assistance from https://courses.cs.washington.edu/courses/cse373/13wi/lectures/01-25/ArrayStack.java
Assistance from https://stackoverflow.com/questions/20595624/java-stacks-with-arraylist
*/