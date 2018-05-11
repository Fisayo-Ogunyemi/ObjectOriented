package oo;

public class Point {
	
	public double x;
	public double y;
	

	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point (int a, int b)
	{
		x=a;
		y=b;
	}

	public Point (Point P) // Constructeur de copie
	{
		x = P.x;
		y = P.y;
	}
	public double getX()
	{
		return x;
	}
	public void setY(double a)
	{
		y=a;
	}
	public static Point add(Point P1, Point P2)
	{
		Point sortie = new Point();
		sortie.x= P1.x+P2.x;
		sortie.y= P1.y+P2.y;
		return sortie;
	}
	public void add(Point P1)
	{
			this.x += P1.x;
			this.y += P1.y;
	
	}
	
	public static Point mul(Point P1, double a)
	{
		Point sortie = new Point();
		sortie.x=  (P1.x*a);
		sortie.y=  (P1.y*a);
		return sortie;
	}
	
	public void mul(double a)
	{
			this.x *= a;
			this.y *= a;
	}
	public static double getDistance(Point P1, Point P2)
	{
		
		return Math.sqrt( Math.pow(P2.x-P1.x, 2) + 
				Math.pow(P2.y-P1.y, 2) );
	}
	
	public double getDistance(Point P1)
	{
			return Math.sqrt( Math.pow(this.x-P1.x, 2) + 
					Math.pow(this.y-P1.y, 2) );
	}
	public static Point Rot(Point P1, double theta)
	{
		Point sortie = new Point();
		double ct = Math.cos(theta);
		double st = Math.sin(theta);
		sortie.x =  ((ct*P1.x)-(st*P1.y));
		sortie.y = ((st*P1.x)+(ct*P1.y));
		return sortie;
	}
	public void Rot( double theta)
	{
		double ct = Math.cos(theta);
		double st = Math.sin(theta);
		this.x =  ((ct*this.x)-(st*this.y));
		this.y =  ((st*this.x)+(ct*this.y));
	}
	public String toString()
	{
		return "( "+x+", "+y+ " )";
	}
}
