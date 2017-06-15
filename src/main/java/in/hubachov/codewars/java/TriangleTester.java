package in.hubachov.codewars.java;

/**
 * Implement a method that accepts 3 integer values a, b, c. The method should return true if a triangle can be built
 * with the sides of given length and false in any other case.

 (In this case, all triangles must have surface greater than 0 to be accepted).

 * Created by Sashko on 6/15/17.
 */
public class TriangleTester {
	/*
	public static boolean isTriangle(int a, int b, int c){
		return a + b > c && a + c > b && c + b > a;
	}
*/
	public static boolean isTriangle(int a, int b, int c) {
		return checkSide(a, b, c) && checkSide(b, c, a) && checkSide(c, b, a);
	}

	private static boolean checkSide(int a, int b, int c) {
		return a < b + c && a > java.lang.Math.abs(b - c);
	}

}
