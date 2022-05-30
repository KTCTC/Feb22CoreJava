package switchch;

public class SwitchStatementWithBreak4 {

	public static void main(String[] args) {
		// fall through switch
		String year = "second";
		String branch = "Electrical";
		switch (branch) {
		case "Mech":
			switch (year) {
			case "first":
				System.out.println("Your subjects are math and physics");
				break;
			case "second":
				System.out.println("Your subjects are  TOM");
				break;

			case "third":
				System.out.println("Your subjects are SOM");
				break;
			case "forth":
				System.out.println("Your subjects are Heat transfer");
				break;

			default:
				System.out.println("You have selected invalid year");
				break;

			}
			break;
		case "Electrical":
			switch (year) {
			case "first":
				System.out.println("Your subjects are math and physics");
				break;
			case "second":
				System.out.println("Your subjects are  CN");
				break;

			case "third":
				System.out.println("Your subjects are M3");
				break;
			case "forth":
				System.out.println("Your subjects are Transform and Signal and System");
				break;

			default:
				System.out.println("You have selected invalid year");
				break;

			}
			break;
		
		default:
			System.out.println("You have selected invalid year");
			break;

		}

		
		System.out.println("After switch");
	}
	
	
}
