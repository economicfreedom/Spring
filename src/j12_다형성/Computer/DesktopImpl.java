package j12_다형성.Computer;

public class DesktopImpl extends DeskTop{

	@Override
	public void onDisplay() {
		System.out.println("컴퓨터 화면을 출력합니다.");
		
	}
	@Override
	public void OnMouseClick() {
		System.out.println("컴퓨터에서 마우스를 클릭 받습니다.");
		
		
	}
	@Override
	public void onSound() {
		System.out.println("소리를 출력합니다.");
		
	}
	
}
