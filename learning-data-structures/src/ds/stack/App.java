package ds.stack;

import ds.core.*;

public class App
{

	public static void main(String[] args) throws EmptyStructureException, FullStructureException
	{
		 /*
		Stack theStack = new Stack(5);
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		System.out.println( "peek: " + theStack.peek() );
		
		// theStack.push(60);
		// should error | DONE
		
		System.out.println( theStack.pop() );
		System.out.println( theStack.pop() );
		System.out.println( theStack.pop() );
		System.out.println( theStack.pop() );
		
		System.out.println( "peek: " + theStack.peek() );
		
		System.out.println( theStack.pop() );
		
		// should error | DONE
		//System.out.println( theStack.pop() );
		 
		 */
		
		String test = reverseString("testing string reversal 123");
		
		
	}
	
	public static String reverseString (String str) throws EmptyStructureException, FullStructureException
	{
		StringBuilder stringBuilder = new StringBuilder();
		String reversed;
		
		Stack strToReverse = new Stack(str.length());
		
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
		System.out.println( "peek at pos 0: " + strToReverse.peek(0) );
		System.out.println( "peek at pos 5: " + strToReverse.peek(5) );
		//System.out.println( "peek at pos 50: " + strToReverse.peek(-1) );
		
		
		return reversed;
	}
}
