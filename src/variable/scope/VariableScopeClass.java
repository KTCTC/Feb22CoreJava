package variable.scope;

public class VariableScopeClass {
int a = 90;
static int b = 45;
	public static void main(String[] args) {
		int aa = 8;
		System.out.println(a);
		System.out.println(b);

	}
	
	public void sampleNonStaticMethod()
	{
		int bb = 5;
		System.out.println(a);
		System.out.println(b);
		if (true)
		{
			int IntVari = 77;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(bb);
			System.out.println(IntVari);
			for (;true;)
			{
				int forInt = 88;
				System.out.println(forInt);
				System.out.println(a);
				System.out.println(b);
				System.out.println(IntVari);
				System.out.println(bb);
				System.out.println(pqr);
			}
			int pqr = 77;
		}
		System.out.println(forVari);
		System.out.println(forInt);
		
	}
	
	

}
