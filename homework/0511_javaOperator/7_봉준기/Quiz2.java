package com.lec.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int s = scanner.nextInt();//Ű����κ��� �Է¹��� ������ ��ȯ�޴� �Լ�
		String result = (s%2==0)?"¦��":"Ȧ��";
		System.out.println("�Է��Ͻ� ���� "+result);
		scanner.close();
	}
}
