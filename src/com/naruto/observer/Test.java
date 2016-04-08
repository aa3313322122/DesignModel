package com.naruto.observer;

public class Test
{
	public static void main(String[] args)
	{
		String s = "1";
		MyObserver mo = new MyObserver();
		MyObservable m = new MyObservable();
		m.addObserver(mo);
		s = m.changeS(s);
		m.notifyObservers();
		//m.notifyObservers(s);
	}
}
