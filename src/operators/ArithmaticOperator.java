package operators;

public class ArithmaticOperator {

	public static void main(String[] args) {
		//  Arithmatic operator  +,-,*,/,%
		
		int aa=167;
		int bb = 45;
		float xy = 45.4f;	
		float xz = 5.6f;
		
		float ll = xy%xz;
		System.out.println(ll);
		
		int kk = aa%bb;
		System.out.println(kk);
		
		System.out.println("-----------------------------------------");
		float jj = aa/xy;
		
		System.out.println(jj);
		
		float ii = xy/xz;
		
		System.out.println(ii);
		
		int hh = aa/bb;
		System.out.println(hh);
		
		
		System.out.println("-----------------------------------------");
		int ff = aa*bb;
		
		 float gg = xy*bb;
		System.out.println(ff);
		System.out.println(gg);
		
		System.out.println("-----------------------------------------");
		float ee = aa-xy;
		System.out.println(ee);
		
		int dd = aa-bb;
		
		System.out.println(dd);
		
		
		System.out.println("-----------------------------------------");
		
		String str1 = "Hello";
		String str2 = "HI";
		   
	String str3 = str1+str2;	
	
	System.out.println(str3);
		
      int a = 88;
      int b = 77;      
     
      float xx = 8.5f;
      float yy = 45.4f;
      String str4 = str1 + a + b ;
      System.out.println(str4);
      String str5 = a+b+str2;
      System.out.println(str5);      
      System.out.println(a+b+xx+str1);
      System.out.println(a+str1+a+b);     
      
     float cc = xx+yy;
     System.out.println(cc);      
      int c = a+b;      
      System.out.println(c);
      
		 
		
	}

}
