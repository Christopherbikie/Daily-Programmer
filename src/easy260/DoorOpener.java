package easy260;

import java.util.Scanner;

public class DoorOpener {
	
	enum  State {CLOSED, OPENING, OPEN, CLOSING, STOPPED_WHILE_CLOSING, STOPPED_WHILE_OPENING}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int[] FSMData = new int[] {1, -1, 5, 2, 3, -1, 4, 0, 1, -1, 3, -1};
		State doorState = State.CLOSED;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int command = sc.nextLine().startsWith("b") ? 0 : 1;
			System.out.printf("%nDoor: %s%n%s", doorState, command == 0 ? "> Button clicked." : "> Cycle complete.");
			doorState = doorState.values()[FSMData[doorState.ordinal() * 2 + command]];
		}
		sc.close();
	}
}
