package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "(" + name + ", " +  age + "세)";
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// 1. Person 클래스를 작성 (필드는 이름, 나이만)
		// 2. 1번의 클래스 객체를 3개 정도 생성
		// 3. 2번의 객체를 List에 순서대로 추가
		// 4. iterator를 사용해서 반복으로 모두 출력
		// 5. 이름 순으로 오름차순 후 출력
		// 6. 나이 순으로 내림차순 후 출력
		
		Person per1 = new Person("박원숭", 11);
		Person per2 = new Person("김멍멍", 27);
		Person per3 = new Person("하기린", 26);
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(per1);
		list.add(per2);
		list.add(per3);
		list.add(new Person("신물개", 52));
		
		Iterator<Person> it = list.iterator();
		
		while(it.hasNext()) {
			Person per = it.next();
			System.out.println("per = " + per);
		}
		
		//이름 순 오름차순
		list.sort(null);
		System.out.println("list = " +list);
		
		//나이 순 내림차순
		Comparator<Person> ageDesc =(Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		list.sort(ageDesc);
		System.out.println("list = " + list );
	}
	
}
