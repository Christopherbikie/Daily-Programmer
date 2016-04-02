package weekly24;

import java.util.Scanner;

public class RampNumberCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RampNumberCounter ramp = new RampNumberCounter();
		System.out.println(ramp.calcLeadingRampNums(sc.nextInt()));
		sc.close();
	}

	public RampNumberCounter() {}
	
	private int calcLeadingRampNums(int limit) {
		int counter = 0;
		for (int i = 0; i < limit; i++)
			counter += isRamp(i) ? 1 : 0;
		return counter;
	}
	
	private boolean isRamp(int number) {
        char[] numberString = Integer.toString(number).toCharArray();
        for (int i = 0; i < numberString.length - 1; i++) {
            if (numberString[i] > numberString[i + 1]) {
                return false;
            }
        }
        System.out.println(number);
        return true;
    }
}
