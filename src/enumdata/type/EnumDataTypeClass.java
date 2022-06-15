package enumdata.type;

public class EnumDataTypeClass {	
	
	public enum WeekDays {SUN,MON,TUE,WED,THR,FRI,SAT};
	
	
	
	static byte b = 45;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EnumDataTypeClass.b);
		System.out.println(WeekDays.SUN);
		
		byte a = EnumDataTypeClass.b;
		
		WeekDays abcd = WeekDays.TUE;
		System.out.println(abcd);
		
		for (WeekDays each: WeekDays.values())
		{
			System.out.println(each);
		}
		
		

	}

}
