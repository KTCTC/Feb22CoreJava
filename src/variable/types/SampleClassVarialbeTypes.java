package variable.types;

public class SampleClassVarialbeTypes {

	public static void main(String[] args) {
		
		VariableTypeClass.flVariable = 90;
		VariableTypeClass.sampleStaticMethod();
		
		VariableTypeClass obj = new VariableTypeClass();
		
		obj.abcd = 77;
		System.out.println(obj.flVariable);
		obj.sampleMethod();
		obj.sampleStaticMethod();
		
		

	}

}
