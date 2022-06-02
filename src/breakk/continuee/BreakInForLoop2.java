package breakk.continuee;

public class BreakInForLoop2 {

	public static void main(String[] args) {
		// write program to check if char array contains vovel
		System.out.println("Before code");
		char arr[] = { 'c', 'a', 'b', 'g', 'u' };
		

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'a' || arr[i] == 'o' || arr[i] == 'e' || arr[i] == 'u' || arr[i] == 'i') {
				System.out.println("Array contains vovel");
				break;

			}

		}

		System.out.println("After code");

	}

}
