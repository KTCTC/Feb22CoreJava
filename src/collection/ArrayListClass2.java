package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass2 {
static Integer stInt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> data = new ArrayList<>();
		String str1 = "Welcome";
		String str2 = "Welcome";
		String str3 = new String("Hello ");
		data.add(str1);
		data.add(str3);
		data.add(str2);
		
		System.out.println(data);
		
		String ss = data.get(2);
		System.out.println(ss.toLowerCase());
		
		
		

	}

}
