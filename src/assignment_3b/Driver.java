/**
 * ArrayStackDriver.java
 *
 * 
 * COMP 2231 Assignment 3 Question 2
 */
package assignment_3b;

import jsjf.exceptions.EmptyCollectionException;

public class Driver 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayStack<Integer> stackTest = new ArrayStack<>(6);
   
        System.out.println("=================================");
        System.out.println("           EMPTY STACK           ");
        System.out.println("=================================");
	System.out.println("size of stack is " + stackTest.size());
        System.out.println("is the stack empty: " + stackTest.isEmpty());
        System.out.println("Stack:");
	System.out.println(stackTest);
        
	System.out.println("---------Pop empty stack---------");
        try 
        {
            stackTest.pop();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
        
	System.out.println("--------Peek empty stack---------");
        try 
        {
            stackTest.peek();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();

        System.out.println("=================================");
        System.out.println("              STACK              ");
	System.out.println("=================================");
        System.out.println("-----------Making stack----------");
        System.out.println("Push 1");
	stackTest.push(1);
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();

	System.out.println("Push 2");
	stackTest.push(2);
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();

        System.out.println("Push 3");
	stackTest.push(3);
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();
        
        System.out.println("Push 4");
	stackTest.push(4);
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();
        
        System.out.println("Push 5");
	stackTest.push(5);
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();

	System.out.println("---------Checking stack----------");
	System.out.println("size of stack is " + stackTest.size());
        System.out.println("is the stack empty: " + stackTest.isEmpty());
	System.out.println();
        
        System.out.println("Peek should be 5");
	System.out.println("Peeked: " + stackTest.peek());
	System.out.println();
        
        System.out.println("Pop from stack");
	System.out.println("Popped: " + stackTest.pop());
	System.out.println("Stack:");
	System.out.println(stackTest);
	System.out.println();
    }//end main
    
}//end Driver   

