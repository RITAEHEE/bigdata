package com.lect.ex2_human;
// Man man = new Man();
public class Man {
	private int age;
	public Man() {
		System.out.println("개발자 생성자 함수를 만들지 않으면 컴파일러가 디폴트 생성자 생성함");
	}
	public Man(int age) {
		System.out.println("매개변수(파라미터)가 있는 생성자 함수 호출");
		this.age = age; // 데이터 초기화
	}
}
