/**
 * LinkedStack.java
 *
 * 
 * COMP 2231 Assignment 3 Question 1
 * 
 * Implementing a stack using a java.util.LinkedList.
 */
package assignment_3a;

import java.util.LinkedList;
import java.util.ListIterator;

import jsjf.StackADT;
import jsjf.exceptions.EmptyCollectionException;

public class LinkedStack<T> implements StackADT<T> 
{
    private LinkedList stack;
    
    /**
     * Creates an empty stack.
     */
    public LinkedStack()
    {
        stack = new LinkedList();
    }//end LinkedStack
    
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
        
        return (T)stack.removeLast();
    }//end pop

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */    
    public T peek() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");
        
        return (T)stack.peekLast();
    }//end peek
    
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
        return stack.size();
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
   
}//end LinkedStack

/*
References:
Assistance from Linked Stack Source Code
Assistance from Chapter 16 Iterators
Assistance from java api LinkedList/ListIterator
Assistance from http://www.java2s.com/Code/Java/Collections-Data-Structure/MakingastackfromaLinkedList.htm
*/