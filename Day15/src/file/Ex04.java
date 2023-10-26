package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".project"));
		
		String line;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("\n 읽어오기 완료");
		br.close();
	}
}
