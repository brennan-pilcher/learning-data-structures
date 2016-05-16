package ds.doublylinkedlist;

import ds.core.*;

public class DoublyLinkedList
{

	private Node first;
	private Node last;
	
	public DoublyLinkedList ()
	{
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty ()
	{
		return (first == null);
	}
	
	public void insertFirst (Object data)
	{
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty())
		{
			last = newNode; // if it is empty, last refers to this new node
		}
		else
		{
			first.previous = newNode; // list is not empty, so old first node's 'previous' now points to this node which will be the new first node
			newNode.next = first; // new node's 'next' now points to the old first
		}
		
		first = newNode; // this instance's 'first' becomes the newly created node
	}
	
	public void insertLast (Object data)
	{
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty())
		{
			first = newNode; // if it is empty, first refers to this newly created node
		}
		else
		{
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
	}
	
	public Node deleteFirst () throws EmptyStructureException
	{
		if(isEmpty())
		{
			throw new EmptyStructureException("Cannot delete from the list because it is empty.");
		}
		else
		{
			Node current = new Node();
			current = first; // temporarily hold old first node
			if (first.next == null) // if true, list only has one item
			{
				last = null;
			}
			else // else, list has more than one item
			{
				first.next.previous = null; // old 'second' node (first.next) 's previous node becomes null
			}
			
			first = first.next; // old 'second' node becomes first
			return current;
		}
	}
	
	public Node deleteLast () throws EmptyStructureException
	{
		if (isEmpty())
		{
			throw new EmptyStructureException("");
		}
		else
		{
			Node current = new Node();
			current = last; // temporarily hold old last node
			if(last.previous == null) // if true, list only has one item
			{
				first = null;
			}
			else
			{
				last.previous.next = null; // old second to last node's 'next' is now null as it becomes the new last node
			}
			
			last = last.previous; // old second to last node becomes last
			return current;
		}
	}
	
	/*
	public boolean insertAfter (Object key, Object data) throws EmptyStructureException
	{
		Node current = first; // start from the beginning of the list
		while (current.data != key) // if the key is not in the current node
		{
			current = current.next;
		}
	}
	*/
	
	
}
