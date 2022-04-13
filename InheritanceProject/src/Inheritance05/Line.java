package Inheritance05;

public class Line extends Shape{
	@Override // 어노테이션
	public void draw() {
		System.out.println("Line");
	}
//	public void draw() {
//		System.out.println("Line");
//	}
}
