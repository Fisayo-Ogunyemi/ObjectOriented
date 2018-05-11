package oo;

public class Chat extends  Animal{
	public Chat ()
	{
		super();
	}
	public Chat (String s, int a)
	{
		super (s,a);
	}
	public Chat (Chat C)
	{
		super (C);
	}
	public String Manger()
	{
		return "Je bois du lait";
	}
}
