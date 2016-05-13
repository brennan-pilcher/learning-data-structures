package ds.linkedlist;

import ds.core.*;

public class SinglyLinkedList
{

	private Node first;
	
	public SinglyLinkedList ()
	{
		first = null;
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
		newNode.next = first; // old 'first' node becomes 'second' as the new node is inserted
		first = newNode; // new node is now first in the list
	}
	
	public void insertLast (Object data)
	{
		// start at the first node
		Node current = first;
		while (current.next != null)
		{
			current = current.next; // loop until you get to the end
		}
		Node newNode = new Node(); // declare and instantiate a new node
		newNode.data = data; // set data to be whatever was passed in
		current.next = newNode; // do the insertion at the end of the list
	}
	
	public Node deleteFirst ()
	{
		Node toDelete = first;
		first = first.next; // 'second' node becomes the new 'first'
		return toDelete;
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
