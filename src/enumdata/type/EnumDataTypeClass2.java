package enumdata.type;

public class EnumDataTypeClass2 {

	public enum Color {
		Red, Green, Blue
	};

	static byte b = 45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		EnumDataTypeClass2.printSubjectsOfStudentAccordingToYear(EnggYears.Forth);
		
		Color col = Color.Green;
		int a = 1;
		switch (col) {
		case Red:
			System.out.println("You have selected Red color");
			break;
		case Green:
			System.out.println("You have selected Green color");
			break;
		case Blue:
			System.out.println("You have selected Blue color");
			break;

		default:
			System.out.println("You have selected unknown color");
			break;
		}

	}
	
	public static void printSubjectsOfStudentAccordingToYear(EnggYears year)
	{
		switch (year) {
		case First:
			System.out.println("Your subjects are math and physics");
			break;
		case Second:
			System.out.println("Your subjects are applied physics, TOM");
			break;

		case Third:
			System.out.println("Your subjects are machine learning and SOM");
			break;
		case Forth:
			System.out.println("Your subjects are Heat transfer and Java and AI");
			break;

		default:
			System.out.println("You have selected invalid year");
			break;

		}

	}

}
