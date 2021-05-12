package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hset = new HashSet<String>();
		hset.add("red");
		hset.add("green");
		hset.add("blue");
		hset.add("black");
		
		System.out.println("The linked list"+hset);
		
		Iterator p = hset.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}

}
