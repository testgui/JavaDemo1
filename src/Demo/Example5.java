package Demo;

import java.util.Hashtable;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "red");
		ht.put(2, "blue");
		ht.put(3, "black");

		for(Map.Entry x:ht.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		if(ht.containsKey("blue")) {
			String a = ht.get("blue");
			 System.out.println("value for key"
                     + " \"blue\" is:- " + a);
			
		}
	}

}
