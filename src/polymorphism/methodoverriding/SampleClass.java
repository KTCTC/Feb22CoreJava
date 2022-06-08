package polymorphism.methodoverriding;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ac = new C();
		System.out.println(ac.aa);
		System.out.println(ac.stAA);
		ac.addition(23);
		ac.substraction();
		ac.m();
		
		B bc = new C();
		System.out.println(bc.aa);
		System.out.println(bc.stAA);
		bc.addition(23);
		bc.substraction();
		bc.m();
		
		
		C cc = new C();
		System.out.println(cc.aa);
		System.out.println(cc.stAA);
		cc.addition(123);
		cc.substraction();
		cc.m();
		
		A ab = new B();
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		ab.substraction();
		ab.addition(444);
		ab.m();
		
		
		
		
		A aa = new A();
		System.out.println(aa.aa);
		System.out.println(aa.stAA);
		aa.substraction();
		aa.addition(2);
		aa.m();
		
		
		
		
		B bb = new B();
		System.out.println(bb.aa);
		System.out.println(bb.stAA);
		bb.addition(2);
		bb.substraction();
		

	}

}
