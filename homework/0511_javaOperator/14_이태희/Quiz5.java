package com.lec.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		int kor=99, eng=99, mat=100;
		int sum = kor + eng + mat;
		double avg = sum/3.;
		System.out.printf("±¹¾î = %d, ¿µ¾î=%d, ¼öÇÐ=%d\n", kor, eng, mat);
		System.out.printf("ÃÑÁ¡ = %d\n", sum);
		System.out.printf("ÃÑÁ¡ = %.2f\n", avg);
	}
}
