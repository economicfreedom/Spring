package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		//final상수(대문자,스네이크표기라고 표시를 해줌
		
		int number = 10;
		
		
		number = 30;
		// (위) 변수의 선언은 한번만 이루어져야 한다.
		
//		maxNumber = 70;
		//(위) 상수는 값의 수정이 안됨.
		
		
		
		
		
		System.out.println("최댓값 : " + MAX_NUMBER);
		System.out.println("최솟값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + number);
	}

}
