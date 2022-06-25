package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> data = new LinkedHashSet<>();
		Integer obj = new Integer(23);		
		data.add(obj);
		data.add(44);
		data.add(67);		
		System.out.println(data);
		data.add(obj);
		data.add(44);
		data.add(null);
		data.add(null);
		System.out.println(data.size());
		data.remove(44);// in set remove method will work on values not index location
		System.out.println(data);		
		

		Iterator<Integer> itr = data.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		for (Integer each:data)
		{
			System.out.println(each);
		}
		
		
		

	}

}
