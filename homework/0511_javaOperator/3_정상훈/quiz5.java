package com.lec.quiz;
import java.util.Scanner;

public class quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어성적을 입력하세요 :");
		int ko = scanner.nextInt();
		
		System.out.print("영어성적을 입력하세요 :");
		int eng = scanner.nextInt();
		
		System.out.print("수학성적을 입력하세요 :");
		int math = scanner.nextInt();
		
		int sum = ko + eng + math;
		double avg = ((double)sum)/3;
		
		System.out.printf("총점 =%d, 평균=%.2f",sum,avg);
				
	}
}
