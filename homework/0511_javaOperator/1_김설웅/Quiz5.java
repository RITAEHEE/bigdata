package com.lec.quiz;

import java.util.Scanner;

public class Quiz5 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kuk = scanner.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su = scanner.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = scanner.nextInt();
		
		int hab = kuk + su + eng;
		float aver = (kuk + su + eng) / 3;
		
		System.out.printf("������ %d��, ����� %.2f���Դϴ�.", hab, aver);
		
		scanner.close();
	}
}