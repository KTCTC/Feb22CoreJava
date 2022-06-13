package access.modifierB;

import access.modifierA.AccessAA;

public class AccessBB extends AccessAA{
	
	// we can invoke parent class constructors of public and protected access modifiers from child class constructor 
	
	public AccessBB()
	{
		super(23,34,45);
	}
	
	public AccessBB(int w)
	{
		super();
	}
	
	public AccessBB(int w, int v)
	{
		super(23,45);
	}
	public AccessBB(int w, String dd)
	{
		super(23);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessAA obj1 = new AccessAA(); // public 
		AccessAA obj2 = new AccessAA(23); // private
		AccessAA obj3 = new AccessAA(23, 45);// default
		AccessAA obj4 = new AccessAA(23, 23.5f, 23.456f); // protected
		
		
		
		

	}

}
