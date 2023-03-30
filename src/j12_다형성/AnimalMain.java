package j12_다형성;

public class AnimalMain {
	public static void main(String[] args) {
//	추상클래스는 생성이 안 됨
//	Animal animal = new Animal();
		Animal animal = new Human();
		animal.move();
		
	}
	
}
