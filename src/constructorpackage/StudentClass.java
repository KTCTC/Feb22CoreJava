package constructorpackage;

public class StudentClass {
	int rollNumber ;
	String name;
	float marks = 50.00f;
	
	public StudentClass()
	{
		System.out.println("Inside default constructor");
	}
	
	public StudentClass(int a)
	{
		rollNumber = a;
	}
	
	public StudentClass(int a, String nn)
	{
		rollNumber = a;
		name=nn;	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		StudentClass st = new StudentClass();
			
		st.StudentClass(); //  we can not invoke constructor by using object name or class name
		StudentClass oo = st;
		StudentClass st1  = new StudentClass(33);		
		StudentClass st2 = new StudentClass(22, "Amit");
		StudentClass st3 = new StudentClass(33, "Ajay");
		
		StudentClass st5 = new StudentClass(45);
		System.out.println(st1.rollNumber);
		
		st2.rollNumber = 88;
		st2.name = "AHDGsdf";	
		
		st.sample();
		st.sample();
		st.sample();
		st.rollNumber = 4;
		st.name = "AGAG";

	}
	
	public void sample()
	{
		System.out.println("Sample Method");
		
	}
	
	public int StudentClass(float ff)
	{
		System.out.println("This is method with name as Class name");
		return 23;
	}

}
