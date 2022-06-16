package wrapperclasses;

public class WrapperClass {
	private final int sam = 90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass obj = new WrapperClass();
		System.out.println(obj);
		int a = 78;
		String data = "345";		
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int bhy = Integer.parseInt(data);
		System.out.println(bhy);
		
		
		Integer sc = new Integer(data);		
		System.out.println(sc);
		
		Integer ab = new Integer(23);		
		int b =  ab.intValue();
		System.out.println(b);
		
		ab= 90;  // ab = new Integer(90);
		System.out.println(ab);
		
		Integer ii = Integer.valueOf(a); // new Integer(a);	
		
		int z = ab;
		
		Integer cd = 89;
		
		System.out.println(z);
		System.out.println(cd);
		Integer tt = new Integer(23);
		
		boolean flag = ab==tt;
		
		System.out.println(flag);
		
		
		
		

	}

}
