package Inheritance04;

public class instanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor");
	}
	
	public static void main(String[] args) {
		System.out.println("new Student() -->\t");print(new Student());
		System.out.println("new Researcher() -->\t");print(new Researcher());
		System.out.println("new Professor() -->\t");print(new Professor());
	}
}
