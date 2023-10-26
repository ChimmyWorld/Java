package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt"));
		
		bw.write("보조 스트림을 활용할 출력\n");
		bw.write("차이를 모르겠는데?");
		
		System.out.println("파일 출력 완료");
		bw.close();
	}
}
