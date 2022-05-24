package variable.types;

public class VariableTypeClass {

	int abcd;
	static float flVariable;

	public static void main(String[] args) {
		flVariable =90;
		sampleStaticMethod();

		VariableTypeClass.flVariable = 999.45f;
		float ftr = VariableTypeClass.flVariable;
		VariableTypeClass.sampleStaticMethod();
		
	    VariableTypeClass.abcd = 56;
	    VariableTypeClass.sampleMethod();

		VariableTypeClass obj1 = new VariableTypeClass();
		VariableTypeClass obj2 = new VariableTypeClass();

		obj1.abcd = 88;
		obj2.abcd = 56;
		obj1.flVariable = 45;

		System.out.println(obj2.flVariable);
		obj2.flVariable = 44;

		System.out.println(obj1.flVariable);

		System.out.println(obj2.abcd);
		obj1.sampleMethod();
		obj1.sampleStaticMethod();

	}

	public void sampleMethod() {
		int stVariable = 88;
	 int pqrs;
		pqrs = 78;
		System.out.println(pqrs);

	}

	public static void sampleStaticMethod() {
		System.out.println("Inside statis method");
	}

}
