package com.lec.quiz;

import java.util.Scanner;

public class Quiz1 // ����ڷκ��� �Է¹��� ���� 3�ǹ������ Ȯ���ϰ� ���
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // ��ü ������ Ÿ��
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = scanner.nextInt(); // Ű����κ��� �Է� ���� ������ ��ȯ�޴� �Լ�
	
		System.out.println("�Է��Ͻ� ���� " +  su + "�Դϴ�.");
		
		if (su % 3 ==0)
		{
			System.out.println("�Է��Ͻ� ���� 3�� ����Դϴ�.");
		}
		else
		{
			System.out.println("�Է��Ͻ� ���� 3�� ����� �ƴմϴ�.");
		}
		
		scanner.close();
	}
}
