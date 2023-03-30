package j07_반복;

public class DoubleWhile2Home {

	public static void main(String[] args) {
		/*
		 * 중첩반복 실습
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 *		50분
		 *		10분쉬는시간
		 *		1분
		 *		...
		 *		10분
		 *		1분
		 *		...
		 *		10분
		 * 2교시
		 * 		1분
		 * 		2분
		 * 		...
		 *		50분
		 *		10분쉬는시간
		 *		1분
		 *		...
		 *		10분
		 *		1분
		 *		...
		 *		10분
		 * 3교시
		 * 		1분
		 * 		2분
		 * 		...
		 *		50분
		 *		10분쉬는시간
		 *		1분
		 *		...
		 *		10분
		 *		1분
		 *		...
		 *		10분
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 *		50분
		 *		10분쉬는시간
		 *		1분
		 *		...
		 *		10분
		 *		1분
		 *		...
		 *		10분
		 * 
		 * 1. 교시에 관해서 반복(4번)
		 * 2. 시간에 관해서 반복(60번)
		 * 3. 조건문 사용하여 60번 반복을 구간나눠서 작성
		 * 
		 * 
		 */
		
		int i = 0;
		
		while (i < 4) {
			System.out.println((i + 1) + "교시");
			
			int j = 0;
			while(j < 60) {
				 
				int time = 0;
				if(j < 50 ) {
					time = j + 1;
					System.out.println("\t" + time + "분"); 
				}else {
					if(j == 50) {
						System.out.println("\t" + "10분 쉬는시간");
					}
					time = j - 50 + 1;
					System.out.println("\t" + time + "분");
				}
				j++;
			}i++;
		}
		
		
		
	}

}
