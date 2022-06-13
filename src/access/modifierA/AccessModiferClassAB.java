package access.modifierA;

public class AccessModiferClassAB {
	
	
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
