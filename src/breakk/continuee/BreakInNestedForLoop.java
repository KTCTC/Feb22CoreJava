package breakk.continuee;

public class BreakInNestedForLoop {

	public static void main(String[] args) {

		System.out.println("Before code");

		outer: for (int i=0;i<2;i++)
	     {
	    	 System.out.println("HI");
	    	 inner :for (int j=0; j<2;j++)
	    	 {
	    		 System.out.println("Hello");   		
	    		 break outer;
	    		 
	    	 }
	    	
	     }
		System.out.println("After code");

	}

}
