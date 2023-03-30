package j12_다형성.Computer;

public class CoputerMain {
	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
		
		c1.Onkeypress();
		c1.onDisplay();
		c1.onSound();
		System.out.println();
		
		c2.onDisplay();
		c2.Onkeypress();
		c2.onSound();
		((DesktopImpl)c2).OnMouseClick();
		
	}
}
