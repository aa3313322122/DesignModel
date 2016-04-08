package com.naruto.observer;

import java.util.Observable;

public class MyObservable extends Observable
{
	public String changeS(String s)
	{
		setChanged();
		return "2";
	}
}
