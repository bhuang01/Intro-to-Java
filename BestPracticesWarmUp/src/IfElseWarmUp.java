
public class IfElseWarmUp {

	public static void main(String[] args) {
		boolean a, b, c, d, condition1 = false, condition2 = true, condition3 = true;
		int  x = 10, y, z, i;
		double xx = 10.0, yy = 5.0, zz;
		
		a = true;
		b = false;
		condition1 = a && b;
		c = (condition2 != a && b);
	
		System.out.println( " a = " + a);
		if (condition1 || condition2) {
			xx = 5.01;
			a = true;
			System.out.println( " 1) x = " + x);
			System.out.println( " 2) a = " + a);
			
		}
		if (condition3 && condition1) {
		   a = false;
		   c = true;
			System.out.println( " 3) x = " + x);
			System.out.println( " 4) a = " + condition3);
		}
		if (!c) {
			if (a) {
			System.out.println( " 5) x = " + x);
			System.out.println( " 6) a = " + a);
			}
		}
	}
}


