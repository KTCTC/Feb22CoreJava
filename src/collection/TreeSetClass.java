package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> data = new TreeSet<>();

		data.add(34);
		data.add(2);
		data.add(24);
		data.add(34);
		System.out.println(data);
		System.out.println(data.size());
		data.remove(34);
		System.out.println(data);
		try {
			data.add(null);// we can not add null value in treeset, as sorting will give null pointer
							// exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			data.add(0);
		}

		Iterator<Integer> itr = data.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		for (Integer each : data) {
			System.out.println(each);
		}

	}

}
