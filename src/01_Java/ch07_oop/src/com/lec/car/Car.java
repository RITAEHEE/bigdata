package com.lec.car;
// 데이터(private), 메소드(public), setter, getter
public class Car {
	private String color; // 속성, 데이터
	private int cc;
	private int speed;
	public void drive() { // 메소드
		speed = 60;
		System.out.println("운전한다. 지금 속도 " + speed);
	}
	public void park() {
		speed = 0;
		System.out.println("주차한다. 지금 속도 " + speed);
	}
	public void race() {
		speed = 120;
		System.out.println("레이싱한다. 지금 속도 " + speed);
	}
	// setter(color, cc, speed)
	public void setColor(String color) {
		this.color = color; // this '내 객체의'
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// getter (color, cc, speed)
	public String getColor() {
		return color;
	}
	public int getCc() {
		return cc;
	}
	public int getSpeed() {
		return speed;
	}
}














