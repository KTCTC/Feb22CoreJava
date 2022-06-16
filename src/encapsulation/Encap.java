package encapsulation;

public class Encap {
	
	private int a;
	
	public void setA(int a)
	{
		if (a<0)
		{
			this.a = 0;
		}
		else if(a>100)
		{
			this.a = 100;
		}
		else
		{
			this.a = a;
		}		
		
	}
	
	public int getA()
	{
		return a;
	}
	

}
