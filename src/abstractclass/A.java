package abstractclass;

public class A extends AbstractClass{
	
	public A()
	{
		System.out.println("A class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass obj = new A();
		obj.abstractMethodFromAbstractClass();
		obj.staticMethodFromAbstractClass();
		obj.sampleAbstractMethodOfAbstractClass2();
		
		A oo = new A();
		oo.abstractMethodFromAbstractClass();
		oo.addition();
		oo.sampleAbstractMethodOfAbstractClass2();
		
		AbstractClass2 ot = new A();
		
		ot.sampleAbstractMethodOfAbstractClass2();
		

	}

	@Override
	public void abstractMethodFromAbstractClass() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract Method From Abstract Class implemented by A class");
		
	}
	
	public void addition()
	{
		System.out.println("This is sample addition method from A class");
	}

	@Override
	public void sampleAbstractMethodOfAbstractClass2() {
		// TODO Auto-generated method stub
		System.out.println("sample Abstract Method Of Abstract Class2");
		
	}
	public void reserveBankInterfaceMethod()
	{
		System.out.println("reserve Bank Interface Method");
	}

}
