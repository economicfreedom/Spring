package j12_다형성3;

public abstract class Human extends Creature implements Talkable {

	public Human(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("도구를 사용하여 공격");
		
	}
	//추상메소드 클래스면 인터페이스 구현 하지 않아도 에러가 안 남
	@Override
	public void talk() {
		System.out.println("사람이 말을 합니다");
		
	}
	
}
