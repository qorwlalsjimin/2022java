package Inheritance01;

public class ColorPoint extends Point{
	private String color;
	public void setcolor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
