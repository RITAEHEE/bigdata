package com.lec.quiz;

import java.util.Scanner;

public class Quiz3
{
	public static void main(String[] args)
	{
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = scanner.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int su2 = scanner.nextInt();
		
		
		if (su == su2)
		{
			System.out.println("�� ���� �����ϴ�.");
		}
		else if (su > su2)
		{
			System.out.println("su�� su2���� ���� Ů�ϴ�.\n");
		}
		else
		{
			System.out.println("su2�� su���� ���� Ů�ϴ�.\n");
		}
		*/
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = scanner.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int su2 = scanner.nextInt();
		
		char a = (su > su2) ? 'O' : 'X';
		
		System.out.println(a);

		scanner.close();
	}
}