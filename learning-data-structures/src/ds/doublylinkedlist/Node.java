package ds.doublylinkedlist;

import ds.core.*;

public class Node
{

	public Object data;
	public Node next;
	public Node previous;
	
	public void displayData ()
	{
		System.out.println("{ " + data + " }");
	}
	
}
