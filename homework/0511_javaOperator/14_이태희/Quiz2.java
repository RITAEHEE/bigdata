package com.lec.quiz;

import java.util.Scanner;

//�Է��Ͻż��� Ȧ������ ¦������ ���
public class Quiz2 {
	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in) ;
				System.out.println("���� �Ϸ��ϼ���");
		int su = scnner.nextInt();
		String result = (su % 2 ==0)? "¦���Դϴ�" : "Ȧ���Դϴ�";
		System.out.println("�Է��ϴ� ����"+result);
		scnner.close();
		
	}
}