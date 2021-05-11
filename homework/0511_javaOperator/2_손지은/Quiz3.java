package com.lec.quiz;

import java.util.Scanner;

// 삼항연산자 사용
public class Quiz3 {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int su1 = first.nextInt();
		Scanner second = new Scanner(System.in);
		System.out.print("두 번째 정수를 입력하세요 : ");
		int su2 = second.nextInt();
		String result1 = (su1 == su2) ? "O" : "X";
		System.out.println(result1);
		String result2 = (su1 > su2) ? "O" : "X";
		System.out.println(result2);
		
		first.close();
		second.close();
		
	}
}



// if문 사용 
//
//public class Quiz3 {
//	public static void main(String[] args) {
//		Scanner first = new Scanner(System.in);
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int su1 = first.nextInt();
//		Scanner second = new Scanner(System.in);
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int su2 = second.nextInt();
//		
//		if (su1 == su2)
//			System.out.printf("O, 두 수는 같습니다.\n");
//		else
//			System.out.printf("X, 두 수는 다릅니다.\n");
//		
//		if (su1 > su2)
//			System.out.printf("O, 첫 번째 수가 더 큽니다.\n");
//		else
//			System.out.printf("X, 두 번째 수가 더 큽니다.\n");
//		
//		first.close();
//		second.close();
//	}
//}
