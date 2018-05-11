package oo;

public class tst_p {

	public static void main(String[] args) {
		Animal a = new Animal ("Test",1);
		
		System.out.println(a.Manger());
		Chien c = new Chien ("Boby", 3);
		System.out.println(c);
		Animal A1 = new Chien ("Fox",5);
		System.out.println(A1.Manger());
		System.out.println(CalculDuPrix(new Chat ("Tom", 15)));
		
	}
	public static double CalculDuPrix(Animal A)
	{
		return A.age*3;
	}

}
