package com.lec.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ��� : ");
		int su1 = scanner.nextInt();
		int su2 = scanner.nextInt();
		String result1 = (su1 == su2) ? "O." : "X.";
		System.out.println("���1 " + result1);
		String result2 = (su1 > su2) ? "O" : "X";
		System.out.println("���2 " + result2);
		scanner.close();
	}
}
