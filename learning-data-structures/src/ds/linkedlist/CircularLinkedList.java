package ds.linkedlist;

import ds.core.*;

public class CircularLinkedList
{

	private Node first, last;
	
	public CircularLinkedList ()
	{
		first = null;
		last = null;
	}
	
	public boolean isEmpty ()
	{
		return (first == null);
	}
	
	// insertion at the beginning of the list
	public void insertFirst (Object data)
	{
		// declare and instantiate the new node
		Node newNode = new Node();
		newNode.data = data; // new node's data is passed in as a parameter from the function call
		
		if (isEmpty())
		{
			last = newNode; // list is empty, so first item is also last item
		}
		
		newNode.next = first; // old 'first' node becomes 'second' as the new node is inserted
		
		first = newNode; // new node is now first in the list
		
	}
	
	public void insertLast (Object data)
	{
		// declare and instantiate the new node
		Node newNode = new Node();
		newNode.data = data; // new node's data is passed in as a parameter from the function call
		
		if (isEmpty())
		{
			first = newNode;
		}
		else
		{
			last.next = newNode; // old last node points to the new last node
			last = newNode; // set 'last' to new last node
		}
		
	}
	
	public Object deleteFirst ()
	{
		Node toDelete = first;
		Object toDelete_data = first.data;
		
		if (first.next == null) // if we have one single node
		{
			last = null; // last becomes null
		}
		
		first = first.next; // 'first' will point to old first's next value
		
		return toDelete_data;
	}
	
	public void peekFirst()
	{
		System.out.println("first.data: " + first.data);
	}
	
	public void peekLast()
	{
		System.out.println("last.data: " + last.data);
	}
	
	public void displayList ()
	{
		System.out.println("List (first --> last)");
		// imagine a train car, the 'first' item is newest added and resides at the back of the chain and 'last' would be the at the front of the chain with no 'next' attribute
		Node current = first; // grab the first node
		while (current != null)
		{
			current.displayNode(); // show node contents
			current = current.next; // go to the next node
		}
	}
	
}
