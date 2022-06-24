package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass3 {
static Integer stInt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Student> data = new ArrayList<>();
	Student st1 = new Student();
	st1.rollNum = 1;
	st1.name = "Amit";
	Student st2 = new Student();
	st2.rollNum = 2;
	st2.name = "Sanjay";
	
	data.add(st1);
	data.add(st2);
	
	Student ss = data.get(1);
	System.out.println(ss.rollNum);
	System.out.println(ss.name);
	ss.displayStudentInfo();
		
		
		

	}

}
