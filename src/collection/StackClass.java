package collection;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		
		st.push('a');
		st.push('b');
		st.push('c');
		System.out.println(st);
		
		Character ch = st.pop();
		System.out.println(ch);
		
		System.out.println(st);
		
		st.add('d');
		
		st.remove(2);
		
		System.out.println(st);
		

	}

}
