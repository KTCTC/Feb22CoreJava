package array;

import java.util.Arrays;

public class ArraysInJava {

	public static void main(String[] args) {

		ArraysInJava obj = new ArraysInJava();
		int a = 88;
		int b = 88;
		int arr[] = { 23, 45, 43, 2, 21 };
		int arr1[] = { 23, 45, 43, 2, 21 };
		int arr2[] = arr;
		
		int length = arr.length;
		System.out.println(length);
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		boolean fl = arr==arr2;
		System.out.println(fl);
		
		boolean flag = Arrays.equals(arr, arr1);
		System.out.println(flag);

		boolean ff = a == b;
		System.out.println(ff);
		boolean f = arr == arr1;
		System.out.println(f);

		int aa = arr[1];
		System.out.println(aa);
		System.out.println(arr[3]);
		arr[1] = 777;

		System.out.println(arr[1]);

		arr[5] = 88;

	}

}
