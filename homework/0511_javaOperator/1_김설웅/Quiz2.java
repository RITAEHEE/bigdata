package com.lec.quiz;

import java.util.Scanner;

public class Quiz2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = scanner.nextInt();
		
		if(su % 2 == 0)
		{
			System.out.println("�Է��Ͻ� ���� ¦���Դϴ�.");
		}
		else
		{
			System.out.println("�Է��Ͻ� ���� Ȧ���Դϴ�.");
		}
		
		scanner.close();
	}
}