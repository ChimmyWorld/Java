package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private LinkedList<Student> list = new LinkedList<Student>();
	File path = new File("E:\\Test");
	File save = new File(path, "학생점수.txt");
	
	public void run() throws IOException {
		int menu;
		
		do {
			System.out.println("------------- 메뉴 -------------");
			System.out.println("\t 1. 학생 목록");
			System.out.println("\t 2. 학생 정보 입력");
			System.out.println("\t 3. 학생 정보 수정");
			System.out.println("\t 4. 학생 정보 제거");
			System.out.println("\t 5. 저장");
			System.out.println("\t 6. 불러오기");
			System.out.println("\t 0. 프로그램 종료");
			
			System.out.println(">>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				list(); continue;
			case 2:
				join(); continue;
			case 3:
				update(); continue;
			case 4:
				remove(); continue;
			case 5:
				save(); continue;
			case 6:
				load(); continue;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
			
		} while(menu!=0);
		
		
	}

	private void load() throws FileNotFoundException {
		if (path.exists() == false ) {
			System.out.println("불러올 파일이 없습니다.");
		}
		
		Scanner sc = new Scanner(save);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	}

	private void save() throws IOException {
		if (path.exists() == false) {
			path.mkdir();
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(save, true));
		
		for (Student stu : list) {
			String msg = stu.getInfo();
			bw.write(msg);
		}
		
		System.out.println("학생점수.txt로 저장완료");
		bw.close();
	}

	private void remove() {
		System.out.println("삭제할 이름 입력");
		String deleteName = sc.next();
		
		int index = search(deleteName);
		
		if (index != -1) {
			list.remove(index);
			
			System.out.println("삭제 완료");
			return;
		}
		
		System.out.println("존재하지 않는 이름입니다");
	}

	private int search(String name) {
		Student find = new Student(name, 0, 0, 0);
		
		for(int i =0; i < list.size(); i++) {
			if (find.equals(list.get(i))) {
				return i;
			}
		}
		
		return -1;
	}
	private void update() {
		System.out.println("수정할 데이터 입력");
		String updateName = sc.next();
		
		int index = search(updateName);
		
		if (index != -1) {
			list.set(index, input());
			System.out.println("수정 완료");
			return;
		}
		
		System.out.println("일치하는 정보가 없습니다");
		
	}

	private Student input() {
		System.out.println("학생 이름, 국어, 영어 수학 순으로 입력");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt(); 
		int mat = sc.nextInt();
		
		return new Student(name, kor, eng, mat);
		
		
	}
	private void join() {
		list.add(input());
		
	}

	private void list() {
		System.out.println("\n학생 목록)");
		
		for (Student stu : list) {
			System.out.println(stu);
		}
		System.out.println();
	}
}
