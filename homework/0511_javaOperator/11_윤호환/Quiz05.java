package com.lec.quiz;

public class Quiz05 {
	public static void main(String[] args) {
		int kor=99, eng=99, mat=100;
		int sum = kor + eng + mat;
		double age = sum/3;
		System.out.printf("���� = %d , ���� = %d , ���� =%d ", kor , eng , mat );
		System.out.printf("���� = %d\n",sum);
		System.out.printf("���� = %.2f\n",age);
	}
}
