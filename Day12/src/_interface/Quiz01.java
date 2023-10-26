package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz01 {
	public static void main(String[] args) {
		Person[] pers = new Person[] {
				new Person("홍길동", 30),
				new Person("김민지", 26),
				new Person("박철민", 18)
		};
		
		System.out.println("정렬전: pers[] = " + Arrays.toString(pers));
		
		//위의 배열을 이름순으로 오름차순과 내림차순으로 둘다 출력, 필요한 경우 access 메서드를 작성한다
		Comparator<Person> desc = (Person o1, Person o2) -> {
			String s1 = o1.getName();
			String s2 = o2.getName();
			
			return s2.compareTo(s1);

		};
		
		Comparator<Person> asc = (Person o1, Person o2) -> {
			String s1 = o1.getName();
			String s2 = o2.getName();
			
			return s1.compareTo(s2);
		};
		
		Arrays.sort(pers, desc);
		System.out.println("desc pers[] = " + Arrays.toString(pers));
		
		Arrays.sort(pers, asc);
		System.out.println("asc pers[] = " + Arrays.toString(pers));
	}
}
