package com.lec.quiz;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int num1=scanner.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int num2=scanner.nextInt();
		String result=(num1==num2)? "����" :"�ٸ���";
		System.out.print("�Է� �Ͻ� ���� "+result);
		scanner.close();
		
		
	}

}
