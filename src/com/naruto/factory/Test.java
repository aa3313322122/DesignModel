package com.naruto.factory;

public class Test
{
	public static void main(String[] args)
	{
		Friend f1 = Friend.newInstance();
		Friend f2 = Friend.newInstance();
		
		if(f1.equals(f2))
		{
			System.out.println("same...");
		}
		else
		{
			System.out.println("different...");
		}
	}
}
