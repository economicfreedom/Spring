package j11_상속;

public class Human extends Animal{
	
	
	public Human() {
		super();
		System.out.println("Human 객체 생성");
	}
//	오버라이딩 : 재정의, @ -> 어노테이션
//	
	
	
	@Override
	public void move() {
		super.move();//부모 호출
		System.out.println("사람이 두발로 걷습니다.");
		
		
	}
	
	public void resdBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
}

