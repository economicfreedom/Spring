package j12_다형성3;

public class Pigeon extends Animal implements Flyable {

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printInfo() {
		System.out.println("Pigeon - > "+ toString());
		
	}
	

	@Override
	public void fly(int yDistance) {
		setY(getY()+yDistance);
		
	}

	@Override
	public void flyMove(int xDistance, int yDistance) {
		// TODO Auto-generated method stub
		
	}

	
	
}
