package j15_스태틱.싱글톤;

public class SingletonMain2 {
	public static void main(String[] args) {
		
		KIA2 kia2 = KIA2.getInstance();
		
		System.out.println(kia2);
		
		System.out.println(kia2.produceCar("kia1"));
		System.out.println(kia2.produceCar("kia2"));
		System.out.println(kia2.produceCar("kia3"));
		System.out.println(kia2.produceCar("kia4"));
		System.out.println(kia2.produceCar("kia5"));
		System.out.println(kia2.produceCar("kia6"));
		System.out.println(kia2.produceCar("kia7"));
		System.out.println(kia2.produceCar("kia8"));
		System.out.println(kia2.produceCar("kia9"));
		System.out.println(kia2.produceCar("kia10"));
		System.out.println(kia2.produceCar("kia11"));
		
		
	}
}
