package collection;

import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String xmlStr =
				"<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" +
				"<person>" +
				"<name>김멍키</name>" +
				"<age>23</age>" +
				"</person>";
		
		// xml -> json
		int indent = 4;
		JSONObject jo = XML.toJSONObject(xmlStr);
		String jsonStr = jo.toString(indent);
		
		System.out.println(jsonStr);
		
		// json -> map
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map;
		map = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(map);
		
		/*
		 출력결과
		 {"person": {
    		"name": "김멍키",
    		"age": 23
		}}
		{person={name=김멍키, age=23}}
		 */
	}
}
