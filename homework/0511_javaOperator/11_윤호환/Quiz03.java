package com.lec.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("ù��° :" );
		int num1 = scanner.nextInt();
		System.out.printf("�ι�° ");
		int num2 = scanner.nextInt();
		System.out.println("�μ��� ������  "+((num1==num2)? "O":"X"));
		System.out.println("ù��° ���� �� ū��  "+((num1>num2)? "O":"X"));
	}
}
