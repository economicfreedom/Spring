package j03_연산자;

public class Oparation2 {
	public static void main(String[] args) {
		//비교 연산할때 기준은 왼쪽
		
		int a = 5;
		System.out.println(7<a);
		System.out.println(a<7);
		
		boolean result1 = true; 
		boolean result2 = false; 
		
		int b = 7;
		int c = 8;
		System.out.println(a<b);
		System.out.println(a<c);

		System.out.println(b>a);
		System.out.println(c>a);
		
		System.out.println();
		
		System.out.println(a+b);
		/*
		 * 논리 연산: boolean 끼리 연산 하는 것
		 * AND연산(&&)-곱
		 * true &&true =>true
		 * true &&false =>false
		 * false &&false =>false
		 * 
		 * OR연산(||) - 합
		 * true || true => true
		 * ture || false +>true
		 * false || false => false
		 * 
		 * 
		 * NOT 연산 (!) - 부정
		 * !true => false
		 * !false => true
		 * 
		 * !(true && false) => true
		 * 
		 */
		
		System.out.println((2000%4==0 ||2000%100 ==1)&&2000%2 !=0);
		
	}
	
	
}
