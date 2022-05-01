package com.pack.string;

public class StringHandeling
{
	public void checkString(String name)
	{
		if(!name.isEmpty() && name!=null && name.isBlank()==false)
		{
			System.out.println("the name entered is "+ name);
		}
	}

	public static void main(String[] args)
	{
		StringHandeling checkstring = new StringHandeling();
		checkstring.checkString("shivani");
	}
}
