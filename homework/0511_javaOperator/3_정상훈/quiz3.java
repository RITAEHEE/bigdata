package com.lec.quiz;
import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���:");
		int su1 = scanner.nextInt();
		System.out.print("����2�� �Է��ϼ���:");
		int su2 = scanner.nextInt();
		
		String result = (su1>su2 == true)?"ù��° ���� ũ��": "ù��° ���� ũ�� �ʴ�";
		System.out.println("�Է��Ͻ� �μ� �� "+result);
		scanner.close();
	}
}
