package object.classs;

public class SampleObjectClass {
	int sampleInt = 90;

	public static void main(String[] args) {	
		int a = 90;
		
		ArithMaticCalculations arthOBj = new  ArithMaticCalculations();
		ArithMaticCalculations oz = arthOBj;
	
		
		arthOBj.a = 888;
		arthOBj.b = 555;
		arthOBj.addition();
		arthOBj.substraction();
		
		arthOBj.a = 884564655;
		arthOBj.b = 555465456;
		arthOBj.addition();
		arthOBj.substraction();	
		
		SampleObjectClass oo = new SampleObjectClass();
		oo.sampleInt = 88;
		oo.sampleClassMethod();	
		
		HumanBeing obj = new HumanBeing();
		
		obj.height = 90;		
		obj.weight = 34;
		obj.name = "ABCD";
		obj.canTalk();
		obj.eatsFood();
		

	}
	
	public void sampleClassMethod()
	{
		int a = 90;
		System.out.println("Sample class method");
		
		HumanBeing obj = new HumanBeing();
		obj.height = 88;
		System.out.println(obj.height);
		obj.canTalk();
	}

}
