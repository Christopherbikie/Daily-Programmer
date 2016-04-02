package easy149;

import java.util.Scanner;

public class Disemvoweler {
	public static String vowels = "aeiou ";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to disemvowel");
		String input = sc.nextLine();
		System.out.printf("%s%n%s", input.replaceAll("[aeiou ]", ""), input.replaceAll("[^aeiou]", "").replaceAll(" ", ""));
		sc.close();
	}

}
