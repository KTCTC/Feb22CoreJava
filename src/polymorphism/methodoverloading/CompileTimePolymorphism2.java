package polymorphism.methodoverloading;

public class CompileTimePolymorphism2 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is actial main method");
		CompileTimePolymorphism2.main();
		CompileTimePolymorphism2.substraction();

	}

	public static void main() {

		System.out.println("This is non parameterisez main method");
	}

	public static void substraction() {
		int c = 23 - 45;
		System.out.println(c);
	}
	
	public void main(int a)
	{
		System.out.println("This is non static main mathod");
	}

}
