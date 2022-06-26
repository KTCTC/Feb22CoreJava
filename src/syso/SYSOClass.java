package syso;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;

public class SYSOClass {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello");
		
		Sample.obj.sampleMethodFromA("Testing");
		
		PrintStream pt = new PrintStream(System.out);
         pt.print("DSSDJBFIBNFIF KJIFNIFJ");
	}

}
