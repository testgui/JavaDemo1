package Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("red");
		ll.add("green");
		ll.add("blue");
		ll.add("black");
		
		System.out.println("The linked list"+ll);
		
		Iterator p = ll.descendingIterator();
		System.out.println("Elements in reverse order");
		while(p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
