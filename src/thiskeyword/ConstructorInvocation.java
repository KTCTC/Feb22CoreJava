package thiskeyword;

public class ConstructorInvocation {
	int a;
	String n;
	static int stVari = 8;

	public ConstructorInvocation() {		
		this(44);		
		System.out.println("Default constructor");
	}

	public ConstructorInvocation(int a) {
		
		this.a = a;
		System.out.println("Parameterized constructor");
	}

	public ConstructorInvocation(int a, String nn) {
		this();
		this.a = a;
		this.n = nn;
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInvocation oo = new ConstructorInvocation(55, "ZZZ");

		ConstructorInvocation obj = new ConstructorInvocation();

		System.out.println(obj.a);

	}

	public void sample() {
     this(); // we can not invoke constructor explicitly or we can not invoke constructor by using this keyword in method
	}

}
