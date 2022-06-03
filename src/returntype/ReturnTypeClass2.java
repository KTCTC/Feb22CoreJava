package returntype;

public class ReturnTypeClass2 {

	public static void main(String[] args) {
		
		StudentClass st = ReturnTypeClass2.getStudentClassInstance();
		System.out.println(st.rollNumber);
		System.out.println(st.name);
		st.display();
		
		int a[] = {2,4,4};
		int b[] = {5,8,6};
		int result[] = ReturnTypeClass2.additionOfTwoArrays(a, b);
	}
	
	public static StudentClass getStudentClassInstance()
	{
		StudentClass obj = new StudentClass();
		obj.rollNumber = 44;
		obj.name = "AmitRaj";		
		
		return obj;
		
	}
	
	public static int[] additionOfTwoArrays(int[] arr1, int[] arr2)
	{
		int add[] = new int[arr1.length];
		
		for (int i=0; i<add.length; i++)
		{
			add[i] = arr1[i] + arr2[i];
		}
		
		
		
		
		return add;	
		
	}
	
	

}
