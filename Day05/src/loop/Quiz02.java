package loop;

public class Quiz02 {
	public static void main(String[] args) {
		int n1 =0; int n2 =0; int n3 =0;
		
		for (int i=1; i<=1000; i++) {
			n1 += i;
			
			// 디버깅
			// System.out.printf("i = %d, total =%d\n", i, n1);
		}	
		System.out.println(n1);
	
		
		for (int i=1; i<=1000; i++)	{
			if (i % 3 != 0) {
				n2 +=i; 
			}
		}
		System.out.println(n2);
	
		for (int i=1; i<=1000; i++) {
			if (i % 3 ==0 && i % 5 == 0 ) {
				n3 +=i; 
			}
		}
		System.out.println(n3);
		
	}
}
