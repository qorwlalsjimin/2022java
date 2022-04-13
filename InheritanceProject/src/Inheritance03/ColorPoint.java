package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y); //super()메소드는 1개만 기술한다.
		this.color = color;
		//super(x,y); --ColorPoint생성자의 첫번째 줄에 위치해야한다.
	}
	public void showColorPoint() {
		System.out.println(color);
	}
}
