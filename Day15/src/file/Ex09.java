package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
