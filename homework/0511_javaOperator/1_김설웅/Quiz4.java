package com.lec.quiz;

import java.util.Scanner;

public class Quiz4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = scanner.nextInt();
		
		if (su >= 65)
		{
			System.out.println("��ο��");
		}
		else
		{
			System.out.println("�Ϲ�");
		}
		
		scanner.close();
	}
}