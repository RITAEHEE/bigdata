package com.lec.quiz;
import java.util.Scanner;

public class quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� :");
		int year = scanner.nextInt();
		
		String result = (year >= 65)?"��ο��":"�Ϲ�";
		System.out.println(result);
	}
}
