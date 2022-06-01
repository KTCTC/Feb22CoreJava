package array;

import java.util.Arrays;

public class MultiDiamentionalArray {

	public static void main(String[] args) {
		
		int arr[] = {23, 45};
		int first[][] = {{4,5},{7,8}};
		int second[][] = {{6,7},{2,5}};
		int third[][] = {{4,5},{7,8}};
		
		int add[][] = new int[2][2];
		int multi[][] = new int[2][2];
		
		add[0][0] = first[0][0] + second[0][0];
		
		int marr[][] = {{3,56,4},{5,1,6}};
		
		int a = marr[1][1];
		System.out.println(a);
		System.out.println(marr[0][1]);
		
		int[] ab = marr[0];
		System.out.println(ab[2]);
		
		Arrays.sort(marr[1]);
		boolean fl = Arrays.equals(first[1], third[1]);
		System.out.println(fl);
		

	}

}
