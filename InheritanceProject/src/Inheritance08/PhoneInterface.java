package Inheritance08;

interface PhoneInterface { // �������̽� ����
	//java 7
	final int TIMEOUT = 10000; // ��� �ʵ� ����

	void sendCall(); // �߻� �޼ҵ�

	void receiveCall(); // �߻� �޼ҵ�

	//java 8
	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}