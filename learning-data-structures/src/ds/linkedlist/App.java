package ds.linkedlist;

import ds.core.*;

public class App
{

	public static void main (String args[]) throws NoSuchNodeException
	{
		/*
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		nodeA.next = nodeB; // link previous node to current
		
		Node nodeC = new Node();
		nodeC.data = 15;
		nodeB.next = nodeC; // link previous node to current
		
		Node nodeD = new Node();
		nodeD.data = 47;
		nodeC.next = nodeD; // link previous node to current
		
		System.out.println( listLength(nodeA) ); // should print 4

		System.out.println( listLength(nodeC) ); // should print 2
		*/
		
		CircularLinkedList myList = new CircularLinkedList();

		myList.insertFirst(100);
		myList.insertFirst(60);
		myList.insertFirst(75);
		myList.insertFirst(40);
		myList.insertFirst(30);
		myList.insertLast(99999);
		
		myList.displayList();
		
		myList.peekFirst();
		myList.peekLast();
		
		myList.deleteFirst();
		myList.peekFirst();
		myList.peekLast();
	}
	
	public static int listLength (Node initialNode) throws NoSuchNodeException
	{
		int length = 1; // size of initial node
		
		if (initialNode == null)
		{
			throw new NoSuchNodeException("A reference to a non-existent node was passed.");
		}
		else
		{
			Node currentNode = initialNode;
			
			while (currentNode.next != null)
			{
				currentNode = currentNode.next;
				length++;
			}
		}
		
		return length;
	}
}
