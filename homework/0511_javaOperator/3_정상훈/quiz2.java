package com.lec.quiz;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);																						
		System.out.print("������ �Է��ϼ���:");
		int su = scanner.nextInt();				
		
		String result = (su%2==0)?"¦���Դϴ�.":"Ȧ���Դϴ�.";
		System.out.println("�Է��Ͻ� ���� " + result);
		scanner.close();
		
	}
}
