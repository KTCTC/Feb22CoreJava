package inheritance;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A objA = new A();
		objA.aa = 67;
		objA.stAA = 45;
		objA.sampleNonStaticMethodFromA();
		objA.staticMethodFromA();
		
		
		B objB = new B();
		
		objB.aa = 88;
		objB.bb =66;
		objB.stAA = 45;
		objB.stBB = 34;
		
		objB.sampleNonStaticMethodFromA();
		objB.sampleNonStaticMethodFromB();
		objB.staticMethodFromA();
		objB.staticMethodFromB();
		
		
		C objC = new C();
		
		objC.aa = 77;
		objC.bb = 34;
		objC.cc = 65.34f;
		objC.stAA = 56;
		objC.stBB = 34;
		objC.stName = "KTCTC";
		
		objC.sampleNonStaticMethodFromA();
		objC.sampleNonStaticMethodFromB();
		objC.sampleNonStaticMethodFromC();
		objC.staticMethodFromA();
		objC.staticMethodFromB();
		objC.staticMethodFromC();
		
		
		
		A.stAA = 90;
		A.staticMethodFromA();
		
		B.stAA = 78;
		B.stBB = 56;
		B.staticMethodFromB();
		B.staticMethodFromA();
		
		
		
		
		
		
		
		

	}

}
