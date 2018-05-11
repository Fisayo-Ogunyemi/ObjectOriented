package oo;

public class Animal {
	public String Nom;
	public int age;
	
	public Animal ()
	{
		this.Nom = "";
		this.age = 0;
	}
	public Animal (String s, int a)
	{
		this.Nom = s;
		this.age = a;
	}
	public Animal (Animal A)
	{
		this.Nom = A.Nom;
		this.age = A.age;
	}
	
	public String Manger()
	{
		return "Je mange de l'herbe";
	}
	public String toString ()
	{
		return "Je m'appele "+this.Nom +", J'ai "+this.age+" ans"; 
	}
}
