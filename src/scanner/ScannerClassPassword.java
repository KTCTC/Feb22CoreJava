package scanner;

import java.util.Scanner;

public class ScannerClassPassword {

	public static void main(String[] args) {
		int password = 5678;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password");
		int upass = sc.nextInt();
		
		if(password==upass)
		{
			System.out.println("You have logged in to syatem successfully...");
		}
		else
		{
			System.out.println("Your password is incorrect.You can not login to system");
		}
		
		
		
		

	}

}
