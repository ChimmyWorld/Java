package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// Map의 Key는 String이, Value는 Object가 가장 자주 사용된다. 왜 그럴까?
		// 1. key는 문자열 접근이 가장 수월하다
		// 2. value는 모든 데이터를 받기 위함
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", 25);
		map.put("address", "부산광역시 해운대구");
		
		System.out.println("map = " + map + "\n");
		
		// Map은 순환이 불가능한 구조
		Set<String> keys = map.keySet();
		
		for (String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println();
		
		//연습) iterator로 map을 전체 출력
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			Object v = map.get(k);
			
			System.out.println(k + " : " + v);
			
		}
		
	}
}
