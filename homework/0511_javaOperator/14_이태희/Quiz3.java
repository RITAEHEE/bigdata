package com.lec.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("ù��° ����");
		int su1 = scanner.nextInt();
		System.out.println("�ι�° ����");
		int su2 = scanner.nextInt();
		System.out.println("�μ��� ������ ����� "+((su1==su2)? "O":"X"));
		System.out.println("ù��° ���� �� ū�� ���� "+((su1>su2)? "O":"X"));
		scanner.close(); }
}
