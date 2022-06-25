package hash.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    HashMap<Integer, String> data = new HashMap<>();
    String str = "Welcome";
    
    data.put(1, "Ajay");
    data.put(2, "Sanket");
    data.put(45, "Sanjay");
    data.put(new Integer(23), "AmitKumar");
    data.put(15, str);
    System.out.println(data);    
    data.put(2, "Amitabh");
    data.put(3, "SG");
    data.put(4, "SG");
    data.put(null, "AJJ");
    data.put(null, "YUI");
    data.put(5, null);
    data.put(6, null);    
   String st = data.get(45);
   System.out.println(st);
   data.remove(6);
   data.remove(4);
   System.out.println(data);
   System.out.println(data.size());
   
   for ( Entry<Integer, String> each: data.entrySet())
   {
	   Integer ky = each.getKey();
	   System.out.println(ky);
	   String val = each.getValue();
	   System.out.println(val);
	   
   }
    

	}

}
