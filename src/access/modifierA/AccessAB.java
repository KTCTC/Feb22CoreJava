package access.modifierA;

public class AccessAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessAA obj1 = new AccessAA(); // public 
		AccessAA obj2 = new AccessAA(23); // private
		AccessAA obj3 = new AccessAA(23, 45);// default
		AccessAA obj4 = new AccessAA(23, 23.5f, 23.456f); // protected

	}

}
