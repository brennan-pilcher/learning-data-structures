package ds.core;

public class Counter
{

	private String name;
	private int value;
	
	public Counter (String str)
	{
		this.name = str;
		value = 0;
	}
	
	public void increment ()
	{
		value++;
	}
	
	public String toString ()
	{
		return Integer.toString(value);
	}
	
	
}
