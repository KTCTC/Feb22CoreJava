package thiskeyword;

public class ThisAsReturnType {
	int a;
	String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsReturnType obj = new ThisAsReturnType();
		
		ThisAsReturnType oo = obj.sampleMethod();
		
		System.out.println(obj.a);
		System.out.println(oo.a);

	}
	
	public ThisAsReturnType sampleMethod()
	{
		this.a = 44;
		this.name = "Salman";
		
		return this;
	}

}
