package ds.queue;

import ds.core.*;

public class App
{

	public static void main (String args[]) throws EmptyStructureException
	{
		Queue myQueue = new Queue();
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		myQueue.enqueue(50);
		myQueue.view();
		System.out.println("-------------");
		
		myQueue.enqueue(60);
		myQueue.enqueue(70);
		myQueue.enqueue(80);
		myQueue.view();
		System.out.println("-------------");
		
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.view();
		System.out.println("-------------");
		
		System.out.println( "Number of items in queue: " + myQueue.size() );
		System.out.println( "Peeking at front of queue: " + myQueue.peek() );
	}
	
}
