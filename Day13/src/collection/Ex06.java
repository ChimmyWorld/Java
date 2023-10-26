package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(10); // 중복된 데이터는 에러를 발생시키지 않고, 자동으로 무시 한다
		
		System.out.println("set = " + set);
		
		// System.out.println("set[0] = " + set.get(0));
		// - index가 없어 indexing 불가능
		
		set.remove(20);
		System.out.println("set = " + set);
		
		System.out.println("set의 길이: " + set.size());
		
		Integer[] arr = new Integer[] {50,60,70,80,90};
		
		set.addAll(Arrays.asList(arr));
		System.out.println("set = " + set);
		// 요소를 한번에 여러개 추가할때 사용한다
		
		// 일반 for문은 index가 필요한데 set은 index가 없어 불가능,
		// 따라서 for-each와 iterator를 사용해야한다
		
		for (int n : set) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println("num = " + num);
		}
	}
}
