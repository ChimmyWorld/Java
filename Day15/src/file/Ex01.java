package file;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test1.txt");
		
		fw.write("Hello World!!!\n");
		fw.write("안녕 세상아\n");
		
		System.out.println("파일 출력 완료!!!");
		fw.close();
	}
}
