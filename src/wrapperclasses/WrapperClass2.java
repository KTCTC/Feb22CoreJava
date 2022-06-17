package wrapperclasses;

public class WrapperClass2 {
	private final int sam = 90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Float.BYTES);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		String data = "34.56";
		
		
		
		float aa = Float.parseFloat(data);
		System.out.println(aa);
		
		Float fl = new Float(23.45f);
		
		float a = fl.floatValue();
		System.out.println(a);
		
		Float fl2 = Float.valueOf(34.45f); // new Float(34.45f);
		
		
		Float obj = 45.56f;
		System.out.println(obj);
		
		float abcd = fl;
		

	}
	
	
	
	
	
	
}
