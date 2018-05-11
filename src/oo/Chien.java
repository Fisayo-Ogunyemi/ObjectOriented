package oo;

public class Chien extends Animal {
	
	public Chien ()
	{
		super();
	}
	public Chien (String s, int a)
	{
		super (s,a);
	}
	public Chien (Chien C)
	{
		super (C);
	}
	public String Manger()
	{
		return "Je mange de la viande";
	}
}
