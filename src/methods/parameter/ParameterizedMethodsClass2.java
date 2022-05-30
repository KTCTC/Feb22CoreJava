package methods.parameter;

public class ParameterizedMethodsClass2 {
	
	
	public void sampleMethodWithStudentInfo(Student oo)
	{
		
		oo.displayStudentInfo();
		System.out.println(oo.rollNum);
		System.out.println(oo.Name);
		oo.rollNum = 999;
	}
	
	public void sampleInt(int a)
	{
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.Name = "Anand";		
		int z = 99;
		
		ParameterizedMethodsClass2 obj = new ParameterizedMethodsClass2();
		
		
		obj.sampleInt(z);
		obj.sampleMethodWithStudentInfo(st1);
		
		System.out.println(st1.rollNum);
		
		
	}

}
