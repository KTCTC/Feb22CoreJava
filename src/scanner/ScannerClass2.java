package scanner;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer value");
		int a = sc.nextInt();
		System.out.println("Enter second integer value");
		int b = sc.nextInt();
		
		int c = a +b;
		
		System.out.println("Addition is = "+c);
		
	}

}
