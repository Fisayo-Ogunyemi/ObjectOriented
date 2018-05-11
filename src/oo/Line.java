package oo;

public class Line {
	
	public Point P1;
	public Point P2;
	
	public Line()
	{
		P1 = new Point();
		P2 = new Point();
	}
	public Line(Point P1, Point P2)
	{
		this.P1 = P1;
	    this.P2 = P2;
	}
	public Line (Line L)
	{
		this.P1=L.P1;
		this.P2=L.P2;
	}
	
	public double getLongueur()
	{
		return P1.getDistance(P2);
	}
}
