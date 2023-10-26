package collection;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Java", 70);					// key는 index 대신에 값을 접근할 용도로 사용
		map.put("Python", 90);					// value는 실제로 저장할 데이터
		map.put("C#", 80);			
		
		System.out.println("map = " + map);

		map.put("Java", 95);					// 중복된 key에 value를 할당하면 value를 덮어쓴다
		System.out.println("map = " + map);		// 즉, key는 중복되지 않음
		
		map.put("Go", 80);						// 새로운 key에 value를 할당하면 새로운 key가 추가됨
		System.out.println("map = " + map + "\n");		// ※ value는 중복이 된다.
		
		System.out.println("map[\"Java\"] = " + map.get("Java"));
		// map은 index 대신에 key로 value에 접근한다
	}
}