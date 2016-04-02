package weekly24;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt(), digits = (int) Math.log10(n) + 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int answer = (i + 1) * (j + 1);
				for (int k = 0; k < digits - (int) Math.log10(answer) + 1; k++)
					sb.append(" ");
				sb.append(answer);
				System.out.print(sb.toString() + " ");
				sb.setLength(0);
			}
			System.out.println();
		}
		sc.close();
	}
}
