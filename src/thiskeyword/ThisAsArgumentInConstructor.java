package thiskeyword;

public class ThisAsArgumentInConstructor {
	int a;
	String name;
	
	
	public ThisAsArgumentInConstructor()
	{
		A oy = new A(this);		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsArgumentInConstructor oto = new ThisAsArgumentInConstructor();
		ThisAsArgumentInConstructor tt = new ThisAsArgumentInConstructor();
		oto.a = 11;
		oto.name = "Ajay";
		
		oto.sample();
		
		System.out.println(oto.a);
		System.out.println(oto.name);

	}
	
	public void sample()
	{
		A obj = new A(this);
		
		
		
	}

}
