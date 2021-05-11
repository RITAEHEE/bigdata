package Quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int mat = scanner.nextInt();
		int sum = kor + eng + mat;
		double ave = (kor+eng+mat)/3;
		System.out.println("국어 : " +kor+"\t"+"영어 : "+eng+"\t"+"수학 : "+mat);
		System.out.printf("합계 점수 : %d"+"\n"+"평균 점수 : %.2f"+"\t" ,sum, ave);
		scanner.close();
		
	}

}
