package com.lec.quiz;

import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int num=scanner.nextInt();
		String result=(num%2==0)? "¦���Դϴ�.":"Ȧ���Դϴ�.";
		System.out.print("�Է��Ͻ� ����"+result);
		scanner.close();
		
		
}
}
