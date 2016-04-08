package com.naruto.factory;

public class Friend
{
	private int age;
	private int sex;
	private static final FriendFactory factory = new FriendFactory();
	
	private static class FriendFactory
	{
		public Friend newInstatnc()
		{
			return new Friend();
		}
		protected FriendFactory()
		{
			
		}
	}
	
	private Friend()
	{
		setAge(0);
		setSex(0);
	}
	
	public static Friend newInstance()
	{
		return factory.newInstatnc();
	}

	public int getSex()
	{
		return sex;
	}

	public void setSex(int sex)
	{
		this.sex = sex;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
