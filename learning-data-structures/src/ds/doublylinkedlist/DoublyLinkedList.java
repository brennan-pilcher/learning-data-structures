package ds.doublylinkedlist;

import ds.core.*;

public class DoublyLinkedList
{

	private Node first;
	private Node last;
	private long size;
	
	public DoublyLinkedList ()
	{
		this.first = null;
		this.last = null;
		this.size = 0;
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
		size++;
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
		size++;
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
			size--;
			return current;
		}
	}
	
	public Node deleteLast () throws EmptyStructureException
	{
		if (isEmpty())
		{
			throw new EmptyStructureException("Cannot delete the last node because the linked list is empty.");
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
			size--;
			return current;
		}
	}
	
	
	public boolean insertAfter (Object key, Object data) throws EmptyStructureException
	{
		if (isEmpty())
		{
			throw new EmptyStructureException("Cannot insert after the specified node because the linked list is empty.");
		}
		else
		{
			Node current = new Node();
			current = first; // start from the beginning of the list
			while (current.data != key) // if the key is not in the current node
			{
				current = current.next;
				if(current == null) // end of list reached
				{
					return false;
				}
			}
			
	
			Node newNode = new Node(); // declare and instantiate new node
			newNode.data = data;
			
			if (current == last) // if last
			{
				current.next = null; // last has no value for next
				last = newNode; // become last
			}
			else
			{
				newNode.next = current.next; // new node's next becomes current's next
				current.next.previous = newNode; // node after current's 'previous' is the new node
			}
	
			newNode.previous = current; // new node's previous is current
			current.next = newNode; // current's next is the new node
			size++;
			
			return true;
		}
	}
	
	public Node peekAtIndex (long index, boolean deleteNode) throws EmptyStructureException, NoSuchNodeException
	{
		if (isEmpty())
		{
			throw new EmptyStructureException("Cannot peek at the specified index because the linked list is empty.");
		}
		else if (index >= size || index < 0)
		{
			throw new NoSuchNodeException("The specified index is not in the range of the linked list. index: " + index + "   size: " + size);
		}
		else
		{
			if (index == 0) // first item
			{
				Node current = first;
				if (deleteNode)
				{
					deleteFirst();
				}
				
				return current;
			}
			else if (index == size-1) // last item
			{
				Node current = last;
				if (deleteNode)
				{
					deleteLast();
				}
				
				return current;
			}
			else if (index > size/2) // closer to end of list
			{
				long difference = size - index;
				
				Node current = last;
				while (difference > 0)
				{
					current = current.previous;
					difference--;
				}
				
				if (deleteNode)
				{
					deleteNode(current);
				}
				return current;
			}
			else  // closer to start of list
			{
				long difference = index;
				
				Node current = first;
				while (difference > 0)
				{
					current = current.next;
					difference--;
				}
				
				if (deleteNode)
				{
					deleteNode(current);
				}
				
				return current;
			}
		}
	}
	
	public void deleteNode(Node target)
	{
		Node current = new Node();
		current = target;
		
		if (current == first)
		{
			first = current.next; // new first is current's next
			current.next.previous = null; // current.next's 'previous' becomes null because current.next is becoming first
		}
		else if (current == last)
		{
			last = current.previous; // new last is current's previous
			current.previous.next = null; // current.previous's 'next' becomes null because current.previous is becoming last
		}
		else
		{
			current.previous.next = current.next; // current.previous's 'next' becomes the current's next as node is removed
			current.next.previous = current.previous; // current.next's 'previous' becomes the current's previous as node is removed
		}
		
		size--;
		
	}
	
	public Node deleteKey (Object key) throws EmptyStructureException
	{
		if (isEmpty())
		{
			throw new EmptyStructureException("Cannot delete the specified node because the linked list is empty.");
		}
		else
		{
			Node current = new Node();
			current = first;
			
			while (current.data != key)
			{
				current = current.next;
				if (current.next == null) // reached end of list without locating key
				{
					return null;
				}
			}
		
			deleteNode(current);
			
			return current;
		}
	}
	
	public Object displayFirst ()
	{
		return first.data;
	}

	public Object displayLast ()
	{
		return last.data;
	}
	
	public Object displayNode (Node current)
	{
		return current.data;
	}
	
	
	public void displayForward ()
	{
		System.out.println("List (first --> last):");
		Node current = first;
		while (current != null)
		{
			current.displayData();
			current = current.next;
		}
	}

	public void displayBackward ()
	{
		System.out.println("List (last --> first):");
		Node current = last;
		while (current != null)
		{
			current.displayData();
			current = current.previous;
		}
	}
	
	
}
