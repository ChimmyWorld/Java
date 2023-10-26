package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		System.out.print("boolean 입력: ");
		bo = scan.nextBoolean();
		System.out.println("bo = " + bo);
		
		System.out.println("byte 입력: ");
		by = scan.nextByte();
		System.out.println("by = " + by);
		
		System.out.println("short 입력: ");
		sh = scan.nextShort();
		System.out.println("sh = " + sh);
		
		System.out.println("int 입력: ");
		it = scan.nextInt();
		System.out.println("it = " + it);
		
		System.out.println("long 입력: ");
		lo = scan.nextLong();
		System.out.println("lo = " + lo);
		
		System.out.println("float 입력 : ");
		fl = scan.nextFloat();
		System.out.println("fl = " + fl);
		
		System.out.println("double 입력: ");
		db = scan.nextDouble();
		System.out.println("db = " + db);
		
		scan.close();
	}
}
