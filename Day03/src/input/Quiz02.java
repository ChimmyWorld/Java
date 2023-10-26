package input;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		String name, address;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		address = sc.nextLine();
		
		System.out.println("이름 : " + name + "(" + age + "세)");
		System.out.println("신장 : " + height + "cm");
		System.out.println("주소 : " + address);
		sc.close();
		
	}
}
