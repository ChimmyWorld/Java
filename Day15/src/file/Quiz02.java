package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("person.xml"));
		String xml = "";
		String line;
		
		while((line = br.readLine())!= null) {
			xml += line + "\n";
		}
		
		System.out.println("xml 출력: ");
		System.out.println(xml + "\n");
		
		int indent = 4;
		JSONObject jo = XML.toJSONObject(xml);
		String jsonStr = jo.toString(indent);
		
		System.out.println("json 출력: ");
		System.out.println(jsonStr + "\n");
		
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> map;
		map = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
		
		System.out.println("맵 출력: ");
		System.out.println(map);
		
		br.close();
		
	}
}
