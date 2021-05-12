package Demo;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(1, "cricket");
		hm.put(2, "football");
		
		for(Map.Entry x:hm.entrySet()) {
			System.out.println(x.getKey() +""+x.getValue());
		}

	}

}
