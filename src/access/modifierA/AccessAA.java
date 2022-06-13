package access.modifierA;

public class AccessAA {
	public int publicVari = 78;
	private int privateVari = 56;
	protected int protectedVari = 33;
	 int defaultVari = 56;

	public AccessAA() {
		System.out.println("Public constructor");
	}

	private AccessAA(int a) {
		System.out.println("private constructor");
	}

	AccessAA(int a, int b) {
		System.out.println("Public constructor");
	}

	protected AccessAA(float xx, float yy, float ert) {
		System.out.println("Public constructor");
	}
	
	public static void main(String[] args) {
		AccessAA obj1 = new AccessAA(); // public 
		AccessAA obj2 = new AccessAA(23); // private
		AccessAA obj3 = new AccessAA(23, 45);// default
		AccessAA obj4 = new AccessAA(23, 23.5f, 23.456f); // protected
		
		
		
	}

}
