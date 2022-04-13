package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) {
		// 오버라이딩(재 정의)된 메소드가 호출된다
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line(); //Line 객체 생성
		paint(line);
		paint(new Shape()); // Shape클래스의 재정의된 메소드가 호출되는 상황이다.
		paint(new Line());	// Line클래스의 재정의된 메소드가 호출되는 상황이다.
		paint(new Rect());	// Rect클래스의 재정의된 메소드가 호출되는 상황이다.
		paint(new Circle());// Circle클래스의 재정의된 메소드가 호출되는 상황이다.
	}

}
