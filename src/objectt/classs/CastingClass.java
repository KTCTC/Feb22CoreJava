package objectt.classs;

public class CastingClass {
	public static void main(String[] args) {		
		
		A ab = new A();
		
		B bb = (B)ab;
		System.out.println(bb.bb);
		
		B bbb = new B();
		
		A ba = (A)bbb;
		
		System.out.println(ba.aa);
	}

}
