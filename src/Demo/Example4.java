package Demo;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(1, "red");
hm.put(2, "blue");
hm.put(3, "black");

for(Map.Entry x:hm.entrySet()) {
	System.out.println(x.getKey()+" "+x.getValue());
}

	}

}
