package hash.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Student> data = new HashMap<>();

		Student st1 = new Student();
		st1.rollNum = 1;
		st1.name = "Ajay";
		Student st2 = new Student();
		st2.rollNum = 2;
		st2.name = "Sanjay";

		data.put(1, st2);
		data.put(2, st1);

		Student obj = data.get(1);
		System.out.println(obj.name);

		for (Entry<Integer, Student> each : data.entrySet()) {
			Integer ky = each.getKey();
			System.out.println(ky);
			Student val = each.getValue();
			System.out.println(val.rollNum);
			System.out.println(val.name);
			val.displayStudentInfo();

		}

	}

}
