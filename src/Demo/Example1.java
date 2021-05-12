package Demo;

import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Lallu");
		al.add("Modi");
		al.add("Narendar");
		al.add("ramu");
		
		System.out.println("The array list"+al);
		
		String Element = al.get(2);
		
		System.out.println("The element retrieved "+Element);
		
		Iterator p = al.iterator();
		
		while(p.hasNext()) {
			System.out.println("The iterator values"+p.next());
			
			Collections.swap(al, 0, 2);
			System.out.println("Array list after swap"+al);
		}

	}

}
