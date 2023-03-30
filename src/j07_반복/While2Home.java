package j07_반복;

public class While2Home {

	public static void main(String[] args) {
		/*
		 * 실습
		 * while문을 활용하여 아래와 같이 출력이 되도록 하시오
		 * 홍길동1
		 * 홍길동2
		 * 홍길동3
		 * 홍길동4
		 * 홍길동5
		 * 홍길동6
		 * 
		 */
		
		int a = 0;
		while(a < 6) {
			System.out.println("홍길동" + (a+1));
			a++;
		}
	}

}
