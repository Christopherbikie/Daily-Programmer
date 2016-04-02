package easy239;

import java.util.Scanner;

public class GameOfThrees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long current = sc.nextLong();
		while (current != 1) {
			int n = current % 3 == 0 ? 0 : current % 3 == 1 ? -1 : 1;
            System.out.println(current + " " + n);
            current = (current + n) / 3;
		}
		System.out.println("1");
		sc.close();
	}
}
