package ds.stack;

import ds.core.*;

public class App
{

	public static void main(String[] args) throws EmptyStructureException, FullStructureException
	{
		 
		Stack theStack = new Stack();
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		System.out.println( "peek: " + theStack.peek() );
		
		
		theStack.pop();
		System.out.println( "peek: " + theStack.peek() );
		theStack.pop();
		System.out.println( "peek: " + theStack.peek() );
		theStack.pop();
		System.out.println( "peek: " + theStack.peek() );
		theStack.pop();
		System.out.println( "peek: " + theStack.peek() );
		
		// should error | DONE
		//theStack.pop();
		//System.out.println( "peek: " + theStack.peek() );
		 
		 
		
		String test = reverseString("testing string reversal 123");
		
		System.out.println( test );
		
		
	}
	
	public static String reverseString (String str) throws EmptyStructureException
	{
		StringBuilder stringBuilder = new StringBuilder();
		String reversed;
		
		Stack strToReverse = new Stack();
		
		while(str.length() > 0)
		{
			int len = str.length();
			strToReverse.push( str.substring(len-1,len) );
			//System.out.println( strToReverse.peek() );
			
			stringBuilder.append( strToReverse.peek() );
			
			str = str.substring(0, len-1);
		}
		
		reversed = stringBuilder.toString();
		
		System.out.println( "peek: " + strToReverse.peek() );
		//System.out.println( "peek at pos 0: " + strToReverse.peek(0) );
		//System.out.println( "peek at pos 5: " + strToReverse.peek(5) );
		//System.out.println( "peek at pos 50: " + strToReverse.peek(-1) );
		
		
		return reversed;
	}
}
