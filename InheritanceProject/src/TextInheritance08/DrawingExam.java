package TextInheritance08;

public class DrawingExam {

	public static void main(String[] args) {
		Circle c = new Circle(); //c ��ü����
		c.draw(); //Circle Ŭ������ �ִ� draw()ȣ��
		c.painting(); //CircleŬ������ �ִ� painting ȣ��
		
		Shape s = new Shape(); //s�� ShapeŬ������ �ִ� �͸� ����
		s.draw(); //Shape Ŭ������ �ִ� draw()ȣ��
		//s.painting(); --> �����߻�
		
		s=c; //Upcasting
		s.draw(); //CircleŬ������ �ִ� draw()�޼ҵ� ȣ��
		//CircleŬ������ ��ĳ������ �߱� ������
		//ShapeŬ������ �ִ� draw()�޼ҵ带 ȣ������ �ʰ�
		//CircleŬ������ �ִ� draw()�޼ҵ� ȣ��
		//s.painting();-->���� ������ ����Ŭ������ Shape���� ���ǰ� �Ǿ� ���� ����

	}

}
