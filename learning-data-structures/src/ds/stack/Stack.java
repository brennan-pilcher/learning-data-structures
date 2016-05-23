package ds.stack;

import ds.core.*;
import ds.doublylinkedlist.*;
import java.util.NoSuchElementException;

public class Stack
{

	private DoublyLinkedList stackList;
	private int numItems; // counter to hold the number of items
	
	public Stack ()
	{ // basic constructor
		this.stackList = new DoublyLinkedList();
		this.numItems = 0;
	}
	
	public void push (Object item)
	{
		numItems++; // increment the number of items in the stack
		stackList.insertFirst(item);
	}
	
	public Object pop () throws EmptyStructureException
	{
		if( !isEmpty() )
		{
			numItems--; // decrement the number of items in the stack
			return stackList.deleteFirst();
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
			return stackList.displayFirst();
		}
		else
		{ // throw error if empty
			throw new EmptyStructureException("The stack is empty.");
		}
	}
	
	public Object peekAtIndex (long index) throws EmptyStructureException, NoSuchNodeException
	{
		return stackList.displayNode(stackList.peekAtIndex(index, false));
	}
	
	public boolean isEmpty ()
	{
		return (stackList.isEmpty()); // if empty return false, else true
	}
	
	public long size ()
	{
		return numItems;
	}
	
}
