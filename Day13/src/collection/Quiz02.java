package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return name + " (" + getTotal() + ")";
	}
	
	int getTotal() {
		return kor + eng + mat;
	}
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getTotal() - getTotal();
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 학생 정보를 입력받는다 - 이름, 국, 영, 수로 3명 정도 입력받는다
		// 2. 입력받은 정보로 Student 인스턴스를 생성 및 리스트에 추가
		// 3. 성적순으로 출력
		
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		int n;
		
		System.out.println("학생 수 ? ");
		n = sc.nextInt();
		
		for (int i= 1; i<= n; i++) {
		System.out.println("학생 이름, 국어, 영어, 수학 입력");
		String inputName = sc.next();
		int inputKor = sc.nextInt();
		int inputEng = sc.nextInt();
		int inputMat = sc.nextInt();
		
		list.add(new Student(inputName, inputKor, inputEng, inputMat));
		}
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("성적 총합 순 내림차순");
		System.out.println("list = " + list);
		
		sc.close();
		
	}
}
