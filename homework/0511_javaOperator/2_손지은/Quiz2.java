package com.lec.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int i = scanner.nextInt();
		if (i % 2 == 0)
			System.out.printf("%d�� ¦���Դϴ�.", i);
		else
			System.out.printf("%d�� Ȧ���Դϴ�.", i);
				
		scanner.close();
	}
}
