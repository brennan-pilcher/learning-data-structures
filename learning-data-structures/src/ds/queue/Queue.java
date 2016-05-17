package ds.queue;

import ds.core.*;
import ds.doublylinkedlist.*;
//import java.util.NoSuchElementException;

public class Queue
{

	private DoublyLinkedList queueList; // DoublyLinkedList to hold the data
	private int numItems; // counter to hold the number of items
	
	public Queue ()
	{
		this.queueList = new DoublyLinkedList();
		numItems = 0; // initialize as empty
	}
	
	// TODO check the entire thing
	
	public void enqueue (Object item)
	{
		queueList.insertLast(item); // place new item at the rear
		numItems++; // increment number of items
	}
	
	public Object dequeue () throws EmptyStructureException
	{
		if (queueList.isEmpty())
		{
			throw new EmptyStructureException("The queue is empty.");
		}
		else
		{
			Object itemToRemove = queueList.deleteFirst(); // remove item at the front of the queue
			numItems--; // number of items decreases
			return itemToRemove;
		}
	}
	
	public Object peek() throws EmptyStructureException
	{
		if (queueList.isEmpty())
		{
			// TODO throw a more appropriate exception
			throw new EmptyStructureException("The queue is empty.");
		}
		else
		{
			return queueList.displayFirst();
			//return queueArray[front];
		}
	}
	
	public boolean isEmpty ()
	{
		return (queueList.isEmpty());
	}
	
	public long size ()
	{
		return numItems;
	}
	
	public void view ()
	{
		queueList.displayForward();
	}
	
	
}
