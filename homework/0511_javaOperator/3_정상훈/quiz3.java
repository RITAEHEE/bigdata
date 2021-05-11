package com.lec.quiz;
import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수1을 입력하세요:");
		int su1 = scanner.nextInt();
		System.out.print("정수2을 입력하세요:");
		int su2 = scanner.nextInt();
		
		String result = (su1>su2 == true)?"첫번째 수가 크다": "첫번째 수가 크지 않다";
		System.out.println("입력하신 두수 중 "+result);
		scanner.close();
	}
}
