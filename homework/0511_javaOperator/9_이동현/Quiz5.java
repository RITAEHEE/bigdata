package com.lec.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		int kor = 70;
		int eng = 80;
		int math = 85;
		double avr;
		avr = (kor + eng + math) / 3;
		System.out.printf("���� : %d��\n���� : %d��\n���� : %d��\n��� : %.2f��", kor, eng, math, avr);
	}
}
