package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) {
		// �������̵�(�� ����)�� �޼ҵ尡 ȣ��ȴ�
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line(); //Line ��ü ����
		paint(line);
		paint(new Shape()); // ShapeŬ������ �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�.
		paint(new Line());	// LineŬ������ �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�.
		paint(new Rect());	// RectŬ������ �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�.
		paint(new Circle());// CircleŬ������ �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�.
	}

}
