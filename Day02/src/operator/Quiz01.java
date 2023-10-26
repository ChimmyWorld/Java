package operator;

public class Quiz01 {
	public static void main (String[] args) {
		int kor = 70;
		int eng = 80;
		int mat = 98;
		
		System.out.println("성적 : 국 " + kor + ", 영 " + eng + ", 수 " + mat);
		System.out.println("합계: " + (kor+eng+mat));
		System.out.println("평균 : " + (kor+eng+mat) / 3.0 );
		// System.out.println("평균 : " + (kor+eng+mat) / 3 );
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////
		
		
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d\n", kor+eng,mat);
		System.out.printf("평균 : %f\n", (kor+eng+mat)/3.0);
	
		//////////////////////////////////////////////////////////////////////////////
		int sum = kor + eng + mat;
		double avg = sum/3.0;
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////
		
		System.out.println("합계 " + sum);
		System.out.println("평균 : " + avg);
		
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("avg = " + avg);
		
		
	}

}
