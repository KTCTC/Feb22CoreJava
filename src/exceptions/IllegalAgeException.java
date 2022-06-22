package exceptions;

public class IllegalAgeException extends Exception{
	
	public IllegalAgeException()
	{
		super("Age is illegal to vote in India");
	}

}
