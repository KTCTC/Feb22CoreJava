package switchch;

public class SwitchStatement {

	public static void main(String[] args) {
		// fall through switch
		int a = 1;

		switch (a) {
		case 3:
			System.out.println("You have selected case three");

		case 1:
			System.out.println("You have selected case one");

		case 2:
			System.out.println("You have selected case two");

		default:

			System.out.println("You have entered unsxpected case number");

		case 5:
			System.out.println("You have selected case five");

		}

		System.out.println("After switch");
	}

}
