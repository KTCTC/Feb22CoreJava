package switchch;

public class SwitchStatementWithBreak2 {

	public static void main(String[] args) {
		// fall through switch
		int a = 3;

		switch (a) {
		case 3:
			System.out.println("You have selected case three");
			System.out.println("sfsfdsfsdf");			

		case 1:
			System.out.println("You have selected case one");
			break;

		case 2:
			System.out.println("You have selected case two");
			break;

		default:

			System.out.println("You have entered unsxpected case number");
			break;

		case 5:
			System.out.println("You have selected case five");
			break;

		}

		System.out.println("After switch");
	}

}
