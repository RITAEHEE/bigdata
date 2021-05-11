package Quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in); 
		System.out.println("정수를 입력하세요");
		int su = scanner.nextInt(); 
		String result = (su%2 ==0)? "짝수입니다" : "홀수입니다";
		System.out.println("입력하신 수는 "+ result);
		scanner.close(); 		
	}
}
