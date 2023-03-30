package j09_클래스;

public class Car {
	
	
	String company;
	String model;
	String color;
	
	public Car() {
		/*
		 * 기본생성자는 생략이 가능하다.
		 * 생성자는 무조건 주소값을 리턴한다.
		 * 생성자는 무조건 클레스와 이름이 동일하다.
		 */
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println();
	}
	
	void colorChange(int num) {
		if(num == 1) {
			color = "오렌지";
		}else if(num == 2) {
			color = "블루";
		}else if(num == 3) {
			color = "레드";
		}else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	
}
