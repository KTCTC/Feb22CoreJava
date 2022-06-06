package thiskeyword;

public class ThisInvokeMethod {
	int a;
	String n;
	static int stVar = 8;
	public ThisInvokeMethod()
	{
		this.a = 90;
		this.n = "Sample Name 123";
		this.sampleMethod();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisInvokeMethod obj = new ThisInvokeMethod();
		obj.a = 88;
		obj.n = "Sample Name";
		obj.sm();
		obj.sampleMethod();

	}

	public void sm() {
		this.sampleMethod();
		this.staticMethod();
		System.out.println(a);
		sampleMethod();
	}

	public void sampleMethod() {
		System.out.println(this.a);
		System.out.println(n);
		System.out.println(stVar);
	}

	public static void staticMethod() {
		System.out.println("Static Method");
		

	}
}
