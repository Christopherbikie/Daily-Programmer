package intermediate260;

public class Diagonal {

	public static void main(String[] args) {
		int x = 100, y = 74;
		System.out.println(x + y - gcd(x, y));
	}

	public static int gcd(int x, int y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}
}
