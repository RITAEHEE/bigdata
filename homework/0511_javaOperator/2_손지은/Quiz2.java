package com.lec.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = scanner.nextInt();
		if (i % 2 == 0)
			System.out.printf("%d는 짝수입니다.", i);
		else
			System.out.printf("%d는 홀수입니다.", i);
				
		scanner.close();
	}
}
