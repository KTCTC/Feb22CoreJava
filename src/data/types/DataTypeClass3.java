package data.types;

public class DataTypeClass3 {

	public static void main(String[] args) {
		byte byteVariable=89;
		short shortVariable = 56;
		int intVariable = 78;
		long longVariable = 67l;
		
		float floatVariable = 89.56f;
		double doubleVariable = 45.55d;
		
		char ch = 'z';
		
		shortVariable = byteVariable;		
		byteVariable = shortVariable;
		intVariable = shortVariable;
		intVariable = byteVariable;		
		longVariable = intVariable;		
		intVariable = longVariable;
		
		doubleVariable = floatVariable;
		floatVariable = doubleVariable;
		
		intVariable = floatVariable;
		
		floatVariable = intVariable;
		floatVariable = shortVariable;
		floatVariable = byteVariable;
		
		intVariable = doubleVariable;		
		doubleVariable = intVariable;
		
		intVariable = ch;
		floatVariable = ch;
		ch = floatVariable;		
		ch = byteVariable;
		
		
	}

}
