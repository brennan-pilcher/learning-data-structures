package ds.queue;

import ds.core.FullStructureException;

public class App
{

	public static void main (String args[]) throws FullStructureException
	{
		Queue myQueue = new Queue(5);
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.view();
		myQueue.insert(60);
		myQueue.insert(70);
		myQueue.insert(80);
		myQueue.view();
	}
	
}
