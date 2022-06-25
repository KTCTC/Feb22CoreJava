package hash.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    HashMap<String, String> data = new HashMap<>();
    
    data.put("FirstName", "Ajay");
    data.put("LastName", "Patil");
    data.put("Country", "India");
    data.put("LastName", "Pawar");   

   
   for ( Entry<String, String> each: data.entrySet())
   {
	   String ky = each.getKey();
	   System.out.println(ky);
	   String val = each.getValue();
	   System.out.println(val);
	   
   }
    

	}

}
