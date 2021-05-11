package com.lec.quiz;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int num1=scanner.nextInt();
		System.out.print("수를 입력하세요:");
		int num2=scanner.nextInt();
		String result=(num1==num2)? "같다" :"다르다";
		System.out.print("입력 하신 수는 "+result);
		scanner.close();
		
		
	}

}
