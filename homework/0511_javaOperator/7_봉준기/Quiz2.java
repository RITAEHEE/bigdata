package com.lec.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int s = scanner.nextInt();//키보드로부터 입력받은 정수를 받환받는 함수
		String result = (s%2==0)?"짝수":"홀수";
		System.out.println("입력하신 수는 "+result);
		scanner.close();
	}
}
