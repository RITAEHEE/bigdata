package com.lec.quiz;
import java.util.Scanner;

public class quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� �Է��ϼ��� :");
		int ko = scanner.nextInt();
		
		System.out.print("������� �Է��ϼ��� :");
		int eng = scanner.nextInt();
		
		System.out.print("���м����� �Է��ϼ��� :");
		int math = scanner.nextInt();
		
		int sum = ko + eng + math;
		double avg = ((double)sum)/3;
		
		System.out.printf("���� =%d, ���=%.2f",sum,avg);
				
	}
}
