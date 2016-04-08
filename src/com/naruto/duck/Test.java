package com.naruto.duck;

public class Test
{
	public static void main(String[] args)
	{
		testStrategy();
	}

	private static void testStrategy()
	{
		Model model = new Model();
		Quack quack = new QuackImpl();
		model.perFormQuack(quack);
		Quack quack2 = new QuackImpl2();
		model.perFormQuack(quack2);
	}
}
