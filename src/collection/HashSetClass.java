package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> data = new HashSet<>();
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
		
		Iterator<Integer> eachData = data.iterator();
		
		while (eachData.hasNext()) {
			
			System.out.println(eachData.next());
		}
		
		for (Integer each:data)
		{
			System.out.println(each);
		}
		
		
		

	}

}
