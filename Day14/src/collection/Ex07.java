package collection;

import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://data.ex.co.kr/openapi/restinfo/restWeatherList?key=3209466440&type=json&sdate=20230724&stdHour=11");
		
		Map<String, Object> jsonMap = om.readValue(url, new TypeReference<Map<String, Object>>() {});
	
		// System.out.println(jsonMap);
		// 1. 한줄로 모두 출력되니 보기가 힘들다 -> 반복으로 간다
		
		// jsonMap.forEach((String k, Object v)-> System.out.println(k + " :" + v));
		// 2. 받은 결과인 Map의 Key들을 확인해보자
		
		//System.out.println(jsonMap.get("list").getClass()); -> class java.util.ArrayList
		// 3. list라는 key에 여러 정보가 담겨 있네
		// 4. 자료형을 확인해보자 -> List네
		
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> list = (List<Map<String, Object>>) jsonMap.get("list");
		
		System.out.println(list.get(0).get("unitName"));
		
		for (Map<String, Object> map : list) {
			//System.out.println(map);
			System.out.println(map.get("unitName") + " :" + map.get("weatherContents"));
		}
		
	}
}
