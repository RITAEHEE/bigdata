package com.lec.quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:\n");
		int s = scanner.nextInt();
		System.out.print("������ �Է��ϼ���:\n");
		int k = scanner.nextInt();
		System.out.print("������ �Է��ϼ���:");
		int j = scanner.nextInt();
		int a = s+k+j;
		double b = a/3;
		System.out.printf("���� : %d, ��� : %.2f",a,b);
		scanner.close();
	}
}
