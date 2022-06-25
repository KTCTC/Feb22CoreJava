package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Float> data = new LinkedList<>();
		
		data.add(555.34f);
		data.add(34.45f);
		data.add(22.1f);
		data.add(77.32f);
		data.add(null);
		data.add(null);
		
		System.out.println(data);
		data.remove(1);
		System.out.println(data);
		// Collections.sort(data);
		System.out.println(data.size());
		
		Iterator<Float> itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for (int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for (Float fl :data)
		{
			System.out.println(fl);
		}

	}

}
