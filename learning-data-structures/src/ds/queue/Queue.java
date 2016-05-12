package ds.queue;

import ds.core.*;
import java.util.NoSuchElementException;

public class Queue
{

	private int maxSize; // set number of slots
	private Object[] queueArray; // array to hold the data
	private int front; // index of element at the front of the line
	private int rear; // index of element at the back of the line
	private int numItems; // counter to hold the number of items
	
	public Queue (int size)
	{
		this.maxSize = size;
		this.queueArray = new Object[size];
		front = 0; // index of element at the front of the line
		rear = -1; // index of element at the back of the line
		numItems = 0; // initialize as empty
	}
	
	// TODO check the entire thing
	
	public void insert (Object item) throws FullStructureException
	{
		if (numItems == maxSize) 
		{
			throw new FullStructureException("The queue is full.");
		}
		else
		{ // if the queue is NOT full, add the item at the back
			rear++; // rear moves 'farther back'
			queueArray[rear] = item; // place new item at the rear
			numItems++; // increment number of items
		}
	}
	
	public Object remove () throws EmptyStructureException
	{
		if (numItems == 0)
		{
			throw new EmptyStructureException("The queue is empty.");
		}
		else
		{
			Object itemToRemove = queueArray[front];
			front++; // line moves forward
			numItems--; // number of items decreases
			return itemToRemove;
		}
	}
	
	public Object peek() throws EmptyStructureException
	{
		if (numItems == 0)
		{
			// TODO throw a more appropriate exception
			throw new EmptyStructureException("The queue is empty.");
		}
		else
		{
			return queueArray[front];
		}
	}
	

	public Object peek(int index)
	{
		if (numItems == 0 || index > front || index < rear)
		{
			// TODO throw a more appropriate exception
			throw new NoSuchElementException("There is no item in the queue at the specified index of " + index + ".");
		}
		else
		{
			return queueArray[front];
		}
	}
	
	public boolean isEmpty ()
	{
		return (numItems == 0);
	}
	
	public boolean isFull ()
	{
		return (numItems == maxSize);
	}
	
	public long size ()
	{
		return numItems;
	}
	
	public void view ()
	{
		System.out.print("[ ");
		for(int i = 0; i < queueArray.length; i++)
		{
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
	
}
