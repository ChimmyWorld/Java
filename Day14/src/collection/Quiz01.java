package collection;

import java.util.Comparator;
import java.util.TreeSet;

//1. Person 클래스를 작성 | 필드는 이름, 나이만
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// return 0를 하면 모두 같은것으로 인식돼서 하나만 출력됨
	}
	
	int getAge() {
		return age;
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		
		// 2. TreeSet에 Person 3개 정도 저장 후 출력 | 이름 순으로 오름차순 
		
		TreeSet<Person> ts = new TreeSet<Person>();

		ts.add(new Person("박원숭", 29));
		ts.add(new Person("최토끼", 52));
		ts.add(new Person("김사자", 32));
		
		System.out.println("ts = " + ts);
		
		// 3. Comparator를 사용해서 나이순으로 내림차순 후 출력
		Comparator<Person> ageDesc;
		
		ageDesc = (Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		TreeSet<Person> ts2 = new TreeSet<Person>(ageDesc);
		ts2.addAll(ts);
		
		System.out.println("ts2 = " + ts2);
	}

}
