package ds.doublylinkedlist;

import ds.core.EmptyStructureException;

public class App
{
	
	public static void main(String args[]) throws EmptyStructureException
	{
		DoublyLinkedList myList = new DoublyLinkedList();

		myList.insertFirst(10);
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(40);
		myList.insertFirst(50);
		myList.insertFirst(60);
		myList.insertFirst(70);
		myList.insertFirst(80);
		myList.insertFirst(90);
		myList.insertFirst(100);
		
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
