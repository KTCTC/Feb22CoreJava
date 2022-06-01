package forloop;

public class ForLoopClass {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		
		for (int i=0; i<0;i++)
		{
			System.out.println("HJH");
		}

		for (int i = 5; i >= 0; i--) {			
			
        System.out.println("Running for loop for i = "+i);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("For loop code 1");
			System.out.println("For loop code 2");
			System.out.println("For loop code 3");
			System.out.println("For loop code 4");
		}
		System.out.println("After for loop");
	}

}
