package j04_문자열;

import java.util.Random;

public class 랜덤 {
	public static void main(String[] args) {
		
		/*
		 * 실습
		 * a,b,c 값을 비교
		 * 반복은 총 20회 일어나고 a,b,c,의 범위는 50이다.
		 */
		
		Random random = new Random();
		int i = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int max = 0;
		String point = null;
		
		
		
		while(i<20) {
			a=random.nextInt(50);
			b=random.nextInt(50);
			c=random.nextInt(50);
			if(a>b) {
				if(a>max) {
					max = a;
				}
			}else {
				if(b > max) {
					max = b;
					
				}
			}
			if(c > max) {
				max = c;
			}
			
			i++;
		}
		
		System.out.println("최대값은"+max);
		System.out.println("생성된 곳은? "+point);
	
		
		
	}
}
