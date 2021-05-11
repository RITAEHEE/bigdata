package Quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("국어, 영어, 수학 점수를 각각 입력하세요"); 
		double kor = scanner.nextDouble(); 
		double eng = scanner.nextDouble(); 
		double math = scanner.nextDouble(); 
		
		double sum = kor+eng+math; 
		double avg = (kor+eng+math)/3; 
		
		System.out.printf("총점은  %.0f점, 평균은 %.2f 점 입니다.",sum,avg);
		
		scanner.close(); 
	}
}
