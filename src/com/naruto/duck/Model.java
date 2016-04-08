package com.naruto.duck;

public class Model
{
	private Quack quack;
	
	static{
		Model m = new Model();
		try
		{
			m.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

	public void perFormQuack(Quack quack)
	{
		quack.quack();
	}

	public Quack getQuack()
	{
		return quack;
	}

	public void setQuack(Quack quack)
	{
		this.quack = quack;
	}

}
