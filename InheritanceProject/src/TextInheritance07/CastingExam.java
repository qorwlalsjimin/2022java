package TextInheritance07;

public class CastingExam {

	public static void main(String[] args) {
		//��ü���� ����
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		//��ü ����
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("["+mycar.print()+"]"); // CarŬ������ �ִ� print()ȣ��
		System.out.println("["+mybus.print()+"]");// BusŬ������ �ִ� print()ȣ��
		System.out.println("["+mytruck.print()+"]");// TruckŬ������ �ִ� print()ȣ��

		yourcar = mybus; //upCasting �߻�
		System.out.println("["+yourcar.print()+"]");
		//BusŬ������ ��ĳ������ �Ǿ��� ������ BusŬ������ �ִ� �����ǵ� print()�� ȣ��
		yourbus = (Bus)yourcar;
		//�ٿ�ĳ���� �߻�(��ĳ���õ� yourcar�� ������ �ݵ�� �ٿ�ĳ�����ؾ��Ѵ�)
		System.out.println("["+yourbus.print()+"]"); //BusŬ������ �ִ� print()ȣ��
		
		yourcar = mytruck; //UpCasting �߻�
		System.out.println("["+yourcar.print()+"]");
		//TruckŬ������ ��ĳ������ �Ǿ��� ������ Truck Ŭ������ �ִ� �����ǵ� print()ȣ��
		yourtruck = (Truck)yourcar; //yourtruck = new Truck; �� ���� �ǹ��̴�.
		//�ٿ�ĳ���� �߻�(��ĳ���õ� yourcar�� ������ �ݵ�� �ٿ�ĳ�����ؾ��Ѵ�)
		System.out.println("["+yourtruck.print()+"]");
	}

}
