package ds.stack;

import ds.core.*;
import java.util.NoSuchElementException;

public class Stack
{
	
	// test commit

	private int maxSize;
	private Object[] stackArray;
	private int top;
	
	public Stack (int size)
	{ // basic constructor
		this.maxSize = size;
		this.stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	public void push (Object item) throws FullStructureException
	{
		if( !isFull() )
		{
			top++; // increment top index
			stackArray[top] = item;
		}
		else
		{ // throw error if full
			// TODO throw a more appropriate error
			throw new FullStructureException("The stack is full.");
		}
	}
	
	public Object pop () throws EmptyStructureException
	{
		if( !isEmpty() )
		{
			top--; // decrement top index
			return stackArray[top+1]; // push item at previous top index from when function was called
		}
		else
		{ // throw error if empty
			throw new EmptyStructureException("The stack is empty.");
		}
	}
	
	public Object peek () throws EmptyStructureException
	{ // take a look at item on top without popping
		if( !isEmpty() )
		{
			return stackArray[top];
		}
		else
		{ // throw error if empty
			throw new EmptyStructureException("The stack is empty.");
		}
	}
	
	// overloaded method to handle peeking at a specific index
	public Object peek (int index)
	{ // take a look at item on top without popping
		if( !isEmpty() && index > -1 && index < stackArray.length  )
		{
			return stackArray[index];
		}
		else
		{ // throw error if empty
			throw new NoSuchElementException("There is no element of the stack at position " + index + ".");
		}
	}
	
	
	public boolean isEmpty ()
	{
		return (top == -1); // if empty return false, else true
	}
	
	public boolean isFull ()
	{
		return (top == maxSize - 1); // if full return true, else false
	}
	
	public long size ()
	{
		return stackArray.length;
	}
	
}
