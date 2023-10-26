package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz01 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {
		// 1. 현재 프로젝트에 있는 perosn.json을 읽어온다
		// 2. 그대로 콘솔에 출력해 본다
		// 3. Map으로 변환시켜 출력한다 (* 라이브러리 추가 까먹지 말고)
		
		BufferedReader br = new BufferedReader(new FileReader("person.json"));
		String json ="";
		String line;
		
		while((line = br.readLine()) != null) {
			json += line + "\n";
		}

		System.out.println(json + "\n");
		
		System.out.println("읽어오기 완료");
		
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map;
		map = om.readValue(json, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(map);
		System.out.println(map.get("person"));
		System.out.println(((Map)map.get("person")).get("name"));
		
		br.close();
	}
}
