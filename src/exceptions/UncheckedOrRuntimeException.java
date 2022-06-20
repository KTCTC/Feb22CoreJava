package exceptions;

public class UncheckedOrRuntimeException {
	static Student st1;
	int a = 7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str4 = "Welcome";
		
		System.out.println(str4.charAt(33));
		
		int arr[] = {23,45,67};
		
		System.out.println(arr[5]);
		
		
		String data = "34er";
		
		int d = Integer.parseInt(data);
		System.out.println(d);
		
		
		System.out.println(st1.a);
		
		String str = null;
		
		str.length();
		
		int a = 345;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);

	}

}
