package com.lec.quiz;
//사용자로부터 입력받은 수가 3의배수인지 여부 출력

import java.util.Scanner;

public class Qiuz1 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int su=scanner.nextInt(); //키보드로부터 입력받은 정수를 반환받는 함수
		String result=(su % 3 == 0)? "3의 배수입니다.":"3의 배수가 아닙니다.";
		System.out.print("입력하신 수는"+result);
		scanner.close();
	}

}
