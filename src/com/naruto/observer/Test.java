package com.naruto.observer;

public class Test
{
	public static void main(String[] args)
	{
		MyObserver mo = new MyObserver();
		MyObservable m = new MyObservable();
		m.addObserver(mo);
		m.setNews("胡祖雯");
		m.setNews("是傻比");
	}
}
