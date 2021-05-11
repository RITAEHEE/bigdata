package Quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수(n1)을 입력하세요.");
		int n1 = scanner.nextInt();
		System.out.println("두번째 수(n2)을 입력하세요.");
		int n2 = scanner.nextInt();
//		String result = (n1 == n2) ? "O" : "X" ;
//		System.out.println("두 수는 일치할까요?" +result);
		String result = (n1>n2) ? "O" : "X" ;
		System.out.println("첫 번째 수가 더 클까요?" +result);
		scanner.close();
	}
}
