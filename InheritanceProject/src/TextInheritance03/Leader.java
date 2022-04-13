package TextInheritance03;

public class Leader extends Student {
	boolean boss;
	public Leader(String name, String hakbun, boolean boss){
		super(name, hakbun);
		this.boss = boss;
	}
	void isLeader() {
		if(boss) System.out.println(name+"은 학급회장이다.");
		else System.out.println(name+"은 학급회장이 아니다.");
	}
}
