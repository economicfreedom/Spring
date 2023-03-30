package j15_스태틱.싱글톤;



public class SingletonMain {
	public static void main(String[] args) {
		/*
		 * KIA에 있는 getInstance 매소드를 사용해서 kia라는 참조 변수가
		 * kia 클래스에 있는 모든 매소드들을 접근 가능하게함
		 */
		KIA kia = KIA.getInstance();
		// j15_스태틱.싱글톤.KIA@5aaa6d82 이게 출력이 되는데 kia엔 toString이 재정의 되지 않았기 때문
		System.out.println(kia);
		
		//kia와 똑같이 getInstance로 kia2를 KIA클래스 안에 있는 모든 매소드들의 접근을 허용하게함
		KIA kia2 = KIA.getInstance();
		
		
	
		
		System.out.println(kia2);//여전히 객체 번지가 출력
		//produceCar 매소드를 통해서 Car에 접근해서 toString으로 값들을 출력
		System.out.println(kia.produceCar("k3"));
		/*출력 내용
		 * 배열에 차량 추가 완료
			Car(carNumber=20230001, company=KIA, model=k3)

			autocode가 1 증가 되고 KIA라는 이름과 produceCar에서 던져준 매개변수인 k3가 저장됨 
			이 출력문이 KIA클래스에서 출력된게 아닌가 싶지만 사실은 Car클래스에서 model 변수와 autoCode carNumber를 
			KIA 크랠스에 produceCar 매소드를 통해서 받아가지고  
			재정의된 toString을 통해서 출력됨
		 */

		System.out.println();
		System.out.println(kia.produceCar("k1"));
		System.out.println(kia.produceCar("k2"));
		System.out.println(kia.produceCar("k3"));
		System.out.println(kia.produceCar("k4"));
		System.out.println(kia.produceCar("k5"));
		System.out.println(kia.produceCar("k6"));
		System.out.println(kia.produceCar("k7"));
		System.out.println(kia.produceCar("k8"));
		System.out.println(kia.produceCar("k9"));
		System.out.println(kia.produceCar("k10"));
		System.out.println(kia.produceCar("k11"));



	}
}
