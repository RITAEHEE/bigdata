package com.lec.quiz;

import java.util.Scanner;

// ���׿����� ���
public class Quiz3 {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int su1 = first.nextInt();
		Scanner second = new Scanner(System.in);
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int su2 = second.nextInt();
		String result1 = (su1 == su2) ? "O" : "X";
		System.out.println(result1);
		String result2 = (su1 > su2) ? "O" : "X";
		System.out.println(result2);
		
		first.close();
		second.close();
		
	}
}



// if�� ��� 
//
//public class Quiz3 {
//	public static void main(String[] args) {
//		Scanner first = new Scanner(System.in);
//		System.out.print("ù ��° ������ �Է��ϼ��� : ");
//		int su1 = first.nextInt();
//		Scanner second = new Scanner(System.in);
//		System.out.print("�� ��° ������ �Է��ϼ��� : ");
//		int su2 = second.nextInt();
//		
//		if (su1 == su2)
//			System.out.printf("O, �� ���� �����ϴ�.\n");
//		else
//			System.out.printf("X, �� ���� �ٸ��ϴ�.\n");
//		
//		if (su1 > su2)
//			System.out.printf("O, ù ��° ���� �� Ů�ϴ�.\n");
//		else
//			System.out.printf("X, �� ��° ���� �� Ů�ϴ�.\n");
//		
//		first.close();
//		second.close();
//	}
//}
