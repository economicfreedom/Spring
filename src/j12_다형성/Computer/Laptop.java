package j12_다형성.Computer;

public class Laptop extends Computer {

	@Override
	public void Onkeypress() {
		System.out.println("노트북에서 키보드 입력을 받습니다.");
		
	}

	@Override
	public void onDisplay() {
		System.out.println("노트북 화면을 출력합니다.");
		
	}

	@Override
	public void onSound() {
		System.out.println("소리를 출력합니다.");
		
	}

}
