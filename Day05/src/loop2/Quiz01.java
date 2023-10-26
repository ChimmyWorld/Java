package loop2;

public class Quiz01 {
	public static void main(String[] args) {
		System.out.println("1번");
		for (int i = 1; i <= 5; i++){
			for(int j= 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n2번");
		for (int i = 1; i<=5; i++) {
				System.out.print("");
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n3번");
		for (int i = 0; i < 5; i++) {
			for (int j =0 ; j < 5 - i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n4번");
		for (int i = 1; i <= 5; i++){
			for (int j = 0; j < 5 - i ; j++) {
				System.out.print(" ");
			}
		
			for(int k= 1; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n5번");
		for (int i = 0; i <= 5; i++){
			for(int k= 1; k <= i ; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 5 - i ; j++) {
				System.out.print("*");
			}
		
			
			System.out.println();
		}
		
		System.out.println("\n6번");
		for (int i = 0; i <= 5; i++){
			for (int j =0; j<= 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k= 0; k <= i* 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n7번");
		for (int i = 0; i < 5; i++){
			for(int k= 0; k < i ; k++) {
				System.out.print(" ");
			}
			for (int j =0; j< (5 - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}