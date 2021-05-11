package com.lec.quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:\n");
		int s = scanner.nextInt();
		System.out.print("정수를 입력하세요:\n");
		int k = scanner.nextInt();
		System.out.print("정수를 입력하세요:");
		int j = scanner.nextInt();
		int a = s+k+j;
		double b = a/3;
		System.out.printf("총점 : %d, 평균 : %.2f",a,b);
		scanner.close();
	}
}
