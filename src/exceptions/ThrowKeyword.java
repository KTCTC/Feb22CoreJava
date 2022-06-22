package exceptions;

public class ThrowKeyword {

	public static void main(String[] args) throws IllegalAgeException {
		// TODO Auto-generated method stub
		int a = 2;
		System.out.println("Sample code");
		checkAge(a);

	}
	
	public static void checkAge(int age) throws IllegalAgeException
	{
		if (age<18)
		{
			System.out.println("Can not vote in India");
			IllegalAgeException obj = new IllegalAgeException();
			throw obj;
		}
		else
		{
			System.out.println("Eligiblr for voting in India");
			
			throw new NullPointerException();
		}
	}

}
