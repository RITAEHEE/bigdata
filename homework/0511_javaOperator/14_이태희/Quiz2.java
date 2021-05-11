package com.lec.quiz;

import java.util.Scanner;

//입력하신수가 홀수인지 짝수인지 출력
public class Quiz2 {
	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in) ;
				System.out.println("수를 일력하세요");
		int su = scnner.nextInt();
		String result = (su % 2 ==0)? "짝수입니다" : "홀수입니다";
		System.out.println("입력하는 수는"+result);
		scnner.close();
		
	}
}