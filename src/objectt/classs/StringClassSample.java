package objectt.classs;

public class StringClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "     Showing 1 - 10 of total 42 records     ";
		
		String[] ss = data.split(" ");
		String total = ss[6];
		System.out.println(total);
		int totInt =  Integer.parseInt(total);  
		
		System.out.println(totInt);
		
		String st = data.split(" ")[6];
		
		int zx = Integer.parseInt(data.trim().split(" ")[6]);
		
		String ser = data.trim().toLowerCase().split("42")[0].trim().split("-")[1].trim().split(" ")[0];
		System.out.println(ser);
		

	}

}
