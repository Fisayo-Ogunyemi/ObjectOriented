package oo;

public class tst_point {

	public static void main(String[] args) {

		Point P = new Point ();
		Point P1 = new Point(3,8);
		Point P2 = new Point(6,7);
		Point P3 = new Point();
		P3 = Point.add(P1, P2);
		System.out.println(P3);
	}

}
