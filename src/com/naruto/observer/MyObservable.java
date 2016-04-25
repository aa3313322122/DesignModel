package com.naruto.observer;

import java.util.Observable;

public class MyObservable extends Observable
{
	public void setNews(String s)
	{
		super.setChanged();
		super.notifyObservers(s);
	}
}
