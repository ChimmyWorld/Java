package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex05 {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("vec = " + vec);
		
		// Enumeration iterator의 이전버전
		Enumeration<Integer> en = vec.elements();
		
		while (en.hasMoreElements()) { // == hasNext()
			int n = en.nextElement();  // == next();
			System.out.println("n = " + n);
			
		}
	}
}
