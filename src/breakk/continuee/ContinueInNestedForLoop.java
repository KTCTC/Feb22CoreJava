package breakk.continuee;

public class ContinueInNestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before ");
		outer: for (int i=0;i<2;i++)
	     {
	    	 System.out.println("HI");
	    	 inner :for (int j=0; j<2;j++)
	    	 {
	    		 if (j>0)
	    		 {
	    			 continue;
	    		 }
	    		 System.out.println("Hello");   		
	    		
	    	
	    	 }
	    		break; 
	     }
		System.out.println("After ");

	}

}
