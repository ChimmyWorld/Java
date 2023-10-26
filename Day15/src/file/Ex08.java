package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("eclipse.exe"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));
		
		System.out.println("읽고 쓰기 시작");
		long start = System.currentTimeMillis();
		
		int i;
		
		while((i = bis.read()) != -1) {
			bos.write(i);
		};
		
		long end = System.currentTimeMillis();
		
		System.out.println("읽고 쓰기. 즉, 복사 완료");
		System.out.println((end -start)/ 1000.0 +"초");;
		
		bis.close();
		bos.close();
	}
}
