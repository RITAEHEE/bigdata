package Quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		String result = (age>=65)? "경로우대" : "일반";
		System.out.println("당신은 " +result + " 고객 입니다.");
		scanner.close();
	}

}
