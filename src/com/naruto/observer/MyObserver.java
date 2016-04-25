package com.naruto.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("最新消息：" + arg.toString());
	}
	
	public void update(Observable o)
	{
		update(o, null);
	}

}
