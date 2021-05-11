package Quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요 :");
		int ins = scanner.nextInt();
		String result = (ins%2)==0 ? "짝수" : "홀수";
			System.out.println("입력하신 수는 "+ result + " 입니다.");
		
		scanner.close();
				
}
}
