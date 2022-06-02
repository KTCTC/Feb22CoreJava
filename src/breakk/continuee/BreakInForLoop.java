package breakk.continuee;

public class BreakInForLoop {

	public static void main(String[] args) {

		System.out.println("Before code");		

		for (int j = 0; j < 5; j++) {
			System.out.println("Bafore break");

			if (j == 2) {
				break;
				System.out.println("ff");// we can not write code after break statement
			}
			System.out.println("After break");
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("inside for loop");

			if (i == 3) {
				break;
			}

		}

		System.out.println("After code");

	}

}
