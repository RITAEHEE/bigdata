package com.lec.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("첫번째 수는");
		int su1 = scanner.nextInt();
		System.out.println("두번째 수는");
		int su2 = scanner.nextInt();
		System.out.println("두수가 같은지 결과는 "+((su1==su2)? "O":"X"));
		System.out.println("첫번째 수가 더 큰지 여부 "+((su1>su2)? "O":"X"));
		scanner.close(); }
}
