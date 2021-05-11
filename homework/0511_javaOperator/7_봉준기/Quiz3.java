package com.lec.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:\n");
		int s = scanner.nextInt();
		System.out.print("정수를 입력하세요:");
		int k = scanner.nextInt();
		String result = (s==k)?"O":"X";
		System.out.println(result);
		scanner.close();
	}
}
