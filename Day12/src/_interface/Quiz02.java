package _interface;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
	private String name;
	int kor; int eng; int mat;
	int sum;
	double avg = (sum / 3);
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor + eng + mat;
		this.avg = sum/ 3.0;
	}
	
	@Override
	public String toString() {
//		String msg = "이름:" + name + "(국어:" + kor + " 영어" + eng + " 수학:" + mat + " 평균: " + avg +")"; 
		String msg = "%s (국 %d, 영 %d, 수 %d)";
		msg = String.format(msg, name, kor, eng, mat);
		
		return msg;
	}
	
	public double getAvg() {
		return avg;
	}

	@Override
	public int compareTo(Student o) {
		return (int) (o.avg - avg);
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		// 아래 클래스를 작성 후 성적 순으로 내림차순
		Student[] stus = new Student[] {
			new Student("홍길동", 70, 80, 98),
			new Student("김민지", 90, 77, 85),
			new Student("박철민", 88, 91, 70)
		};
		
		System.out.println("stus = " + Arrays.toString(stus));
		
		Comparator<Student> avgDesc = (Student o1, Student o2) ->{
			return (int) (o2.getAvg() - o1.getAvg());
		};
		
		Arrays.sort(stus, avgDesc);
		System.out.println("평균 순 내림차순 = " + Arrays.toString(stus));
		
	}
}
