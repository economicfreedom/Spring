package j07_반복;

public class DoubleWhile3 {
	public static void main(String[] args) {
		
		/*
		 * 중첩반복 실습
		 * 1교시 
		 *     1분
		 *     2분
		 *     ...
		 *     50분
		 *     10분쉬는시간
		 *     1분
		 *     ...
		 *     10분
		 * 4교시 까지 반복
		 */

		int a = 0;

		while(a<4) {			
			System.out.println((a+1)+"교시");
		
			int b = 0;
		while(b<60) {
			int time = 0;	
			if(b<50) {
				time = b + 1;
				System.out.println("\t"+time + "분");
			}else {
				if(b==50) {
					System.out.println("\t10분 쉬는 시간");
				}
				time = b - 50 + 1;
				System.out.println("\t"+time +"분");
			}
			b++;
			
		}
		a++;
		}
		
	}
	
	
		
	
}
//			
//			
//			b++;
//			System.out.println("수업 시간"+(b)+"분");
//			int c = 10;
//			if(b<60) {
//				System.out.println(c+"분 쉬는 시간");
//				c--;
//				}
//				

