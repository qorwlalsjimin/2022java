package TextInheritance07;

public class CastingExam {

	public static void main(String[] args) {
		//객체변수 선언
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		//객체 생성
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("["+mycar.print()+"]"); // Car클래스에 있는 print()호출
		System.out.println("["+mybus.print()+"]");// Bus클래스에 있는 print()호출
		System.out.println("["+mytruck.print()+"]");// Truck클래스에 있는 print()호출

		yourcar = mybus; //upCasting 발생
		System.out.println("["+yourcar.print()+"]");
		//Bus클래스로 업캐스팅이 되었기 때문에 Bus클래스에 있는 재정의된 print()가 호출
		yourbus = (Bus)yourcar;
		//다운캐스팅 발생(업캐스팅된 yourcar를 가지고 반드시 다운캐스팅해야한다)
		System.out.println("["+yourbus.print()+"]"); //Bus클래스에 있는 print()호출
		
		yourcar = mytruck; //UpCasting 발생
		System.out.println("["+yourcar.print()+"]");
		//Truck클래스로 업캐스팅이 되었기 때문에 Truck 클래스에 있는 재정의된 print()호출
		yourtruck = (Truck)yourcar; //yourtruck = new Truck; 와 같은 의미이다.
		//다운캐스팅 발생(업캐스팅된 yourcar를 가지고 반드시 다운캐스팅해야한다)
		System.out.println("["+yourtruck.print()+"]");
	}

}
