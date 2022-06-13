package access.modifierB;

import access.modifierA.AccessModiferClassAA;

public class AccessModifierCLassBB extends AccessModiferClassAA{

	public static void main(String[] args) {
		
		
		AccessModifierCLassBB obj = new AccessModifierCLassBB();
		System.out.println(obj.publicVari);
		System.out.println(obj.privateVari);
		System.out.println(obj.protectedVari);
		System.out.println(obj.defaultVari);
		obj.publicSampleMethod();
		obj.privateSampleMethod();
		obj.defaultSampleMethod();
		obj.protectedSampleMethod();
		
		
		AccessModiferClassAA obj1 = new AccessModiferClassAA();
		System.out.println(obj1.publicVari);
		System.out.println(obj1.privateVari);
		System.out.println(obj1.protectedVari);
		System.out.println(obj1.defaultVari);
		obj1.publicSampleMethod();
		obj1.privateSampleMethod();
		obj1.defaultSampleMethod();
		obj1.protectedSampleMethod();
		
		
		
		AccessModiferClassAA.publicVariStatic = 90;
		AccessModiferClassAA.privateVariStatic = 670;
		AccessModiferClassAA.defaultVariStatic = 67;
		AccessModiferClassAA.protectedVariStatic = 78;
		
		AccessModiferClassAA.publicStaticSampleMethod();
		AccessModiferClassAA.privateStaticSampleMethod();
		AccessModiferClassAA.defaultStaticSampleMethod();
		AccessModiferClassAA.protectedStaticSampleMethod();
		
		
		AccessModifierCLassBB.publicVariStatic = 90;
		AccessModifierCLassBB.privateVariStatic = 670;
		AccessModifierCLassBB.defaultVariStatic = 67;
		AccessModifierCLassBB.protectedVariStatic = 78;
		
		AccessModifierCLassBB.publicStaticSampleMethod();
		AccessModifierCLassBB.privateStaticSampleMethod();
		AccessModifierCLassBB.defaultStaticSampleMethod();
		AccessModifierCLassBB.protectedStaticSampleMethod();
		

	}

}
