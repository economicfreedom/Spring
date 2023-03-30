package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
		System.out.println(new Computer());//메모리할당, 주소생성
		System.out.println(new Computer());
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		c1.cpu = "i7";
		c2.cpu = "i5";
//				.주소참조
		
		c1.company = "SAMSUNG";
		c1.ram = 8;
		c1.year = 2022;
		c1.graphic = "RTX3060";
		
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2021;
		c2.graphic = "GTX1080";
		
		
		c1.showInfo();
		c2.showInfo();
		
		c1.addRam(8);
		c1.removeRam(3);
		c1.showInfo();
		
		
		c2.addRam(20);
		c2.removeRam(40);
		c2.showInfo();
		
		
	}

}
