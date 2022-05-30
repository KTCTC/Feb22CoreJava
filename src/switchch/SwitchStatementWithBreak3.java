package switchch;

public class SwitchStatementWithBreak3 {

	public static void main(String[] args) {
		// fall through switch
		String year = "first";
      
		SwitchStatementWithBreak3.printSubjectsOfStudentAccordingToYear("second");
		SwitchStatementWithBreak3.printSubjectsOfStudentAccordingToYear("third");
		
		System.out.println("After switch");
	}
	
	public static void printSubjectsOfStudentAccordingToYear(String year)
	{
		switch (year) {
		case "first":
			System.out.println("Your subjects are math and physics");
			break;
		case "second":
			System.out.println("Your subjects are applied physics, TOM");
			break;

		case "third":
			System.out.println("Your subjects are machine learning and SOM");
			break;
		case "forth":
			System.out.println("Your subjects are Heat transfer and Java and AI");
			break;

		default:
			System.out.println("You have selected invalid year");
			break;

		}

	}

}
