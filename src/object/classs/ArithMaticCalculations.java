package object.classs;

public class ArithMaticCalculations {
	
	int a;
	int b;
	
	public void addition()
	{
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void substraction()
	{
		int c = a-b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		ArithMaticCalculations obj = new ArithMaticCalculations();
		ArithMaticCalculations oo = new ArithMaticCalculations();
		oo.a = 45;
		oo.b = 33;
		
		obj.a = 90;
		obj.b = 20;
		
		obj.addition();
		obj.substraction();
		
		oo.addition();
		oo.substraction();
	}

}
