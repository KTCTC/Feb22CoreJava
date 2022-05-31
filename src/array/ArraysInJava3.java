package array;

import java.util.Arrays;

public class ArraysInJava3 {

	public static void main(String[] args) {

		
		char[] ch = {'A', 'V', 'U','a'};
	
		float[] flArr = {34.5f,45,33.22f};
		
		String[] strArr = {"Hello", "Hi", "KTCTC"};
		System.out.println(ch.length);
		System.out.println(ch[1]);
		sampleMethod(ch);
		sampleSSSMethod(strArr);
		
	}
	
	public static void sampleMethod(char[] a)
	{
		System.out.println(a[0]);
	}
	
	public static void sampleSSSMethod(String[] s)
	{
		System.out.println(s[2]);
	}

}
