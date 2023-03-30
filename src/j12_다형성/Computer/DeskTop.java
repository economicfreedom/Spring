package j12_다형성.Computer;

public abstract class DeskTop extends Computer{
	@Override
	public void Onkeypress() {
		System.out.println("컴퓨터의 키보드 입력을 받는다");
	}
	
	public abstract void OnMouseClick();
	
	
}
