package com.lec.quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner kor = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int su1 = kor.nextInt();
		System.out.printf("당신의 국어 점수는 "+su1+"점 입니다.\n");
		
		Scanner eng = new Scanner(System.in);
		System.out.print("영어 점수를 입력하세요 : ");
		int su2 = eng.nextInt();
		System.out.printf("당신의 영어 점수는 "+su2+"점 입니다.\n");
		
		
		Scanner math = new Scanner(System.in);
		System.out.print("수학 점수를 입력하세요 : ");
		int su3 = math.nextInt();
		System.out.printf("당신의 수학 점수는 "+su3+"점 입니다.\n");
		
		System.out.println();		
		int total = su1 + su2 + su3;
		System.out.printf("당신의 총점은 "+total+"점 입니다.\n");
		
		System.out.println();		
		int mean = (su1 + su2 + su3) / 3;
		System.out.printf("당신의 평균은 "+mean+"점 입니다.\n");
		
		kor.close();
		eng.close();
		math.close();
		
	}
}
