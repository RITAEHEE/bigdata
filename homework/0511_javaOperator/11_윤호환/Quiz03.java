package com.lec.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 :" );
		int num1 = scanner.nextInt();
		System.out.printf("두번째 ");
		int num2 = scanner.nextInt();
		System.out.println("두수가 같은지  "+((num1==num2)? "O":"X"));
		System.out.println("첫번째 수가 더 큰가  "+((num1>num2)? "O":"X"));
	}
}
