package collection;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Ex04 {
	public static void main(String[] args) {
		// TreeMap: key순으로 정렬된다
		TreeMap<String, Object> map = new TreeMap<>();
		
		map.put("name", "홍길동");
		map.put("age", 25);
		map.put("address", "부산광역시 해운대구");
		
		System.out.println("map = " + map);
		
		BiConsumer<String, Object> bc = new BiConsumer<String, Object>() {
			
			@Override
			public void accept(String k, Object v) {
					System.out.println(k + " :" + v);
			}
		};
		
		// 아래는 참고용
		map.forEach(bc);
//		map.forEach((String k, Object v) -> System.out.println(k + " : " + v));

	}
}
