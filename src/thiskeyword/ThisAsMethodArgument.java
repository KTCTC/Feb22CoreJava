package thiskeyword;



public class ThisAsMethodArgument {
int a ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsMethodArgument oo = new ThisAsMethodArgument();
		
		oo.a = 888;
		
		oo.sm();
		oo.ss(45);
		

	}
	
	public void sm()
	{
		sampleMethod(this);
		
	}
	
	public void sampleMethod(ThisAsMethodArgument obj)
	{
		System.out.println(obj.a);
		
	}
	
	public void ss(int a)
	{
		System.out.println(a);
	}

}
