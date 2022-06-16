package encapsulation;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap oo = new Encap();
		
		oo.setA(440);
		
		int z = oo.getA();
		System.out.println(z);
		
		StudentEncap obj = new StudentEncap();		
		obj.setRollNum(12);
		obj.setName("Ajay");
		obj.setMarks(67.78f);
		
		addStudentInformationInSystem(obj);
		

	}
	
	public static void addStudentInformationInSystem(StudentEncap oo)
	{
		System.out.println(oo.getRollNum());
		System.out.println(oo.getName());
		System.out.println(oo.getMarks());
	}

}
