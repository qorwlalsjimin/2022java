package TextInheritance09;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship = new MyShip(); //myship ��ü ������ MyShipŬ������ ����ȯ
		Ship yourship = new YourShip(); //yourship ��ü ������ YourShipŬ������ ����ȯ
		ShipName.search(myship); 
		//1.search(myship); �޼ҵ带 ȣ���Ҷ� ���ڰ����� myship�� ����
		//ShipNameŬ�������� search(Ship s)�� �������� ����ɶ� 
		//Ship s = myship�� ����� ����. ���� s��ü������ MyShip Ŭ������ ����ȯ(��ĳ����)
		//�׷��� s�� MyshipŬ���� ��ü Ÿ�Դϴ�. 
		
		ShipName.search(yourship);
		//2.search(yourship); �޼ҵ带 ȣ���Ҷ� ���ڰ����� yourship�� ����
		//ShipNameŬ�������� search(Ship s)�� �������� ����ɶ� 
		//Ship s = yourship�� ����� ����. ���� s��ü������ YourShip Ŭ������ ����ȯ(��ĳ����)
		//�׷��� s�� YourshipŬ���� ��ü Ÿ�Դϴ�. 
	}

}
