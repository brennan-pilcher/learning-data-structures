package ds.doublylinkedlist;

import ds.core.*;

public class App
{
	
	public static void main(String args[]) throws EmptyStructureException, NoSuchNodeException
	{
		DoublyLinkedList myList = new DoublyLinkedList();

		myList.insertFirst(10);
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(40);
		myList.insertFirst(50);

		myList.displayForward();

		System.out.println( myList.displayNode( myList.peekAtIndex(0, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(1, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(2, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(3, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(4, false) ) );
		
		
		myList.insertFirst(60);
		myList.insertFirst(70);
		myList.insertFirst(80);
		myList.insertFirst(90);
		myList.insertFirst(100);
		
		myList.displayForward();
		System.out.println("-------------");
		

		System.out.println( myList.displayNode( myList.peekAtIndex(9, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(8, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(7, false) ) );
		System.out.println( myList.displayNode( myList.peekAtIndex(6, false) ) );
		System.out.println("-------------");

		System.out.println( myList.displayNode( myList.peekAtIndex(2, true) ) );
		System.out.println("-------------");

		myList.displayForward();
		System.out.println("-------------");
		
		System.out.println( myList.displayNode( myList.peekAtIndex(8, true) ) );
		System.out.println("-------------");

		myList.displayForward();
		System.out.println("-------------");
		
		myList.displayBackward();
		System.out.println("-------------");
		
		
		myList.deleteFirst();
		myList.deleteLast();
		myList.deleteKey(40);

		myList.displayForward();
		System.out.println("-------------");
		
		myList.insertAfter(60, 55);
		myList.insertAfter(80, 75);

		myList.displayForward();
		System.out.println("-------------");
	}
	
}
