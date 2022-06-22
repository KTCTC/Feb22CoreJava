package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandlingChecked {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		sampleMethod3();
		sampleMethod2();
		try {
			sampleMethid1();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void sampleMethod4() throws SQLException 
	{
		File f = new File("C:\\Users\\91992\\Feb22\\FirstJavaProject\\JavaInterviewQue44.txt");		
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DriverManager.getConnection("127.0.0.143", "root", "45678767");
		System.out.println("After SQL exception");
		
	}
	
	
	public static void sampleMethid1() throws FileNotFoundException  
	{
		File f = new File("C:\\Users\\91992\\Feb22\\FirstJavaProject\\JavaInterviewQue.txt");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("after exception line");
	}
	
	public static void sampleMethod2() 
	{
		try {
			Class.forName("exceptions.CheckedOrCompileTimeException343");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Mentioned class is not existed");
			e.printStackTrace();
		}
		System.out.println("After class not found exception");
	}
	
	public static void sampleMethod3() throws SQLException
	{
		DriverManager.getConnection("127.0.0.143", "root", "45678767");
		System.out.println("After SQL exception");
	}
	

}
