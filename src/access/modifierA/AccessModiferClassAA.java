package access.modifierA;

public class AccessModiferClassAA {
	public int publicVari = 78;
	private int privateVari = 56;
	protected int protectedVari = 33;
	 int defaultVari = 56;
	 
	 public static int publicVariStatic = 78;
	private static int privateVariStatic = 56;
		protected static int protectedVariStatic = 33;
		static int defaultVariStatic = 56;

	public void publicSampleMethod() {
		System.out.println("public Sample Method");	
		
	}

	private void privateSampleMethod() {
		System.out.println("private Sample Method");
	}

	void defaultSampleMethod() {
		System.out.println("default Sample Method");
	}

	protected void protectedSampleMethod() {
		System.out.println("protected Sample Method");
	}
	
	
	
	public static void publicStaticSampleMethod() {
		System.out.println("public Sample Method");	
		
	}

	private static void privateStaticSampleMethod() {
		System.out.println("private Sample Method");
	}

	static void defaultStaticSampleMethod() {
		System.out.println("default Sample Method");
	}

	protected static void protectedStaticSampleMethod() {
		System.out.println("protected Sample Method");
	}
	
	
	public static void main(String[] args) {
		
		AccessModiferClassAA obj = new AccessModiferClassAA();
		System.out.println(obj.publicVari);
		System.out.println(obj.privateVari);
		System.out.println(obj.protectedVari);
		System.out.println(obj.defaultVari);
		obj.publicSampleMethod();
		obj.privateSampleMethod();
		obj.defaultSampleMethod();
		obj.protectedSampleMethod();
		
		AccessModiferClassAA.publicVariStatic = 90;
		AccessModiferClassAA.privateVariStatic = 670;
		AccessModiferClassAA.defaultVariStatic = 67;
		AccessModiferClassAA.protectedVariStatic = 78;
		
		AccessModiferClassAA.publicStaticSampleMethod();
		AccessModiferClassAA.privateStaticSampleMethod();
		AccessModiferClassAA.defaultStaticSampleMethod();
		AccessModiferClassAA.protectedStaticSampleMethod();
		
		
	}

}
