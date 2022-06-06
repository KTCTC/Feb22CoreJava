package thiskeyword;

public class ThisIntanceVariable {
	
	int a ;	
	String n;	
	static int stVari;
	
	public ThisIntanceVariable()
	{
		System.out.println("This is default constructor");
	}
	
	public ThisIntanceVariable(int aa, String nn)
	{
		System.out.println("This is parameterized  constructor");
		this.a=aa;
		this.n=nn;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisIntanceVariable obj = new ThisIntanceVariable();
		ThisIntanceVariable oo = new  ThisIntanceVariable(55, "Salman");
		
		obj.a = 99;
		obj.n = "Ajay";
		obj.stVari = 999;
		
		obj.sampleMethod();
		oo.sampleMethod();
		obj.ss();
		oo.ss();
		
		ThisIntanceVariable.sampleStaticMethod();

	}
	
	
	public void sampleMethod()
	{
		int a = 90;		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.n);
		System.out.println(this.stVari);		
		
	}
	
	public void ss()
	{
		System.out.println(a);
		System.out.println(n);
		System.out.println(stVari);
	}
	
	public static void sampleStaticMethod()
	{
		System.out.println(this.a);
		System.out.println(this.n);
		System.out.println(this.stVari);
	}

}
