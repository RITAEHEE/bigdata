package com.lec.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		int kor = 70;
		int eng = 80;
		int math = 85;
		double avr;
		avr = (kor + eng + math) / 3;
		System.out.printf("국어 : %d점\n영어 : %d점\n수학 : %d점\n평균 : %.2f점", kor, eng, math, avr);
	}
}
