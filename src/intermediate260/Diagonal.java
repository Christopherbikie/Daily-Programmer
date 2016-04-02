package intermediate260;

public class Diagonal {

	public static void main(String[] args) {
		int x = 100, y = 74;
		System.out.println(x + y - gcd(x, y));
	}

	private static int gcd(int dividend, int divisor) {
		int remainder = 0;
		while (true) {
			remainder = dividend % divisor;
			if (remainder != 0)
				return remainder;
			dividend = divisor;
			divisor = remainder;
		}
	}
}
