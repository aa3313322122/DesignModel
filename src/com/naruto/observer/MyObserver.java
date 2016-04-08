package com.naruto.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		if(null == arg)
		{
			System.out.println("i will updating ");
		}
		else
		{
			System.out.println("im updating " + arg.toString());
		}
	}
	
	public void update(Observable o)
	{
		update(o, null);
	}

}
