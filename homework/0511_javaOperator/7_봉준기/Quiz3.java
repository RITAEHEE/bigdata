package com.lec.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:\n");
		int s = scanner.nextInt();
		System.out.print("������ �Է��ϼ���:");
		int k = scanner.nextInt();
		String result = (s==k)?"O":"X";
		System.out.println(result);
		scanner.close();
	}
}
