package collection;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("C/C++");
		list.add("Python");
		list.add("Go");
		list.add("Java");
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		list.sort((String o1, String o2) -> o2.compareTo(o1));
		System.out.println("list = " + list);
		
	}
}
