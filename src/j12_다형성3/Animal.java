package j12_다형성3;

public abstract class Animal extends Creature{

	public Animal(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("몸을 사용하여 공격");
		
	}


	
	
	
}
