public class Fraction {
	private int num;
	private int denom;

	// Zero args constructor
	public Fraction() {
		num = 0;
		denom = 1;
	}

	public Fraction(int n) {
		num = n;
		denom = 1;
	}

	public Fraction(int n, int d) {
		if (d != 0) {
			num = n;
			denom = d;
			reduce();
		} else {
			throw new IllegalArgumentException("Fraction construction error: denominator is 0");
		}
	}

	public Fraction(double x) {
		String s = String.valueOf(x);

		int cdenom = 1;

		for (int i = 0; i < s.length() - 1 - s.indexOf('.'); i++) {
			cdenom *= 10;
			x *= 10;
		}
		
		int cnum = (int) Math.round(x);

		int greatestCommonFactor = gcf(cnum, cdenom);
		this.num = cnum / greatestCommonFactor;
		this.denom = cdenom / greatestCommonFactor;
	}

	// Copy constructor
	public Fraction(Fraction other) {
		num = other.num;
		denom = other.denom;
	}

	// Returns the sum of this fraction and other
	public Fraction add(Fraction other) {
		int newNum = num * other.denom + denom * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the sum of this fraction and m
	public Fraction add(int m) {
		return new Fraction(num + m * denom, denom);
	}

	// Returns the product of this fraction and other
	public Fraction multiply(Fraction other) {
		int newNum = num * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the product of this fraction and m
	public Fraction multiply(int m) {
		return new Fraction(num * m, denom);
	}

	// Returns the value of this fraction as a double
	public double getValue() {
		return (double) num / (double) denom;
	}

	// Returns a string representation of this fraction
	public String toString() {
		return num + "/" + denom;
	}
	
	// Returns the value of this fraction subtracted from another
	public Fraction substract(Fraction other) {
		int newNum = 
	}
	
	//Returns the value of this fraction subtracted from m
	public Fraction subtract(int m) {
		
	}

	// *** private methods ***

	// Reduces this fraction by the gcf and makes denom > 0
	private void reduce() {
		if (num == 0) {
			denom = 1;
			return;
		}

		if (denom < 0) {
			num = -num;
			denom = -denom;
		}

		int q = gcf(Math.abs(num), denom);
		num /= q;
		denom /= q;
	}

	// Returns the greatest common factor of two positive integers
	private int gcf(int n, int d) {
		if (n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
		}

		if (n % d == 0)
			return d;
		else if (d % n == 0)
			return n;
		else
			return gcf(n % d, d % n);
	}
}