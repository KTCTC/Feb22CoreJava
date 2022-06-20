package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedOrCompileTimeException {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException, FileNotFoundException   {
		// TODO Auto-generated method stub
		sampleMethod3();
		sampleMethod2();
		sampleMethid1();
		sampleMethod5();

	}
	
	public static void sampleMethid1() throws FileNotFoundException 
	{
		File f = new File("C:\\Users\\91992\\Feb22\\FirstJavaProject\\JavaInterviewQue44.txt");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("after exception line");
	}
	
	public static void sampleMethod2() throws ClassNotFoundException
	{
		Class.forName("exceptions.CheckedOrCompileTimeException343");
		System.out.println("After class not found exception");
	}
	
	public static void sampleMethod3() throws SQLException
	{
		DriverManager.getConnection("127.0.0.143", "root", "45678767");
		System.out.println("After SQL exception");
	}
	
	public static void sampleMethod4() throws Exception
	{
		File f = new File("C:\\Users\\91992\\Feb22\\FirstJavaProject\\JavaInterviewQue44.txt");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("after exception line");
		Class.forName("exceptions.CheckedOrCompileTimeException343");
		System.out.println("After class not found exception");
		DriverManager.getConnection("127.0.0.143", "root", "45678767");
		System.out.println("After SQL exception");
	}
	
	public static void sampleMethod5() throws ArithmeticException
	{
		
	}

}
