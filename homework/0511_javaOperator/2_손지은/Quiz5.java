package com.lec.quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner kor = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su1 = kor.nextInt();
		System.out.printf("����� ���� ������ "+su1+"�� �Դϴ�.\n");
		
		Scanner eng = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su2 = eng.nextInt();
		System.out.printf("����� ���� ������ "+su2+"�� �Դϴ�.\n");
		
		
		Scanner math = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su3 = math.nextInt();
		System.out.printf("����� ���� ������ "+su3+"�� �Դϴ�.\n");
		
		System.out.println();		
		int total = su1 + su2 + su3;
		System.out.printf("����� ������ "+total+"�� �Դϴ�.\n");
		
		System.out.println();		
		int mean = (su1 + su2 + su3) / 3;
		System.out.printf("����� ����� "+mean+"�� �Դϴ�.\n");
		
		kor.close();
		eng.close();
		math.close();
		
	}
}
