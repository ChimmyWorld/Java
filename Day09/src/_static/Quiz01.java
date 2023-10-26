package _static;

class Student{
	private String name;
	private int score;
	
	private static int count = 0;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		count++;
	}
	
	void showInfo() {
		System.out.printf("%s(%d점) - %d명\n", name, score, count);
	}
	
	static int getCount() {
		return count;
	}
	 
	int getScore() {
		return score;
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		//아래 코드가 동작되게 클래스를 구현
		Student stu1 = new Student("홍길동", 80);
		stu1.showInfo(); // 홍길동 (80점) - 1명
		
		Student stu2 = new Student("김수진", 77);
		stu2.showInfo(); // 김수진 (77점) - 2명
		
		Student stu3 = new Student("이진호", 93);
		stu3.showInfo(); // 이진호(93점) - 3명
		
		System.out.println("\n현재 학급 인원? : "+ Student.getCount());
		
		System.out.println("홍길동의 점수 : " + stu1.getScore());
		
		stu1.showInfo(); // 홍길동 (80점) - 3명
		stu2.showInfo(); // 김수진 (77점) - 3명
		stu3.showInfo(); // 이진호(93점) - 3명
		
		
	}
}
