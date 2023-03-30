package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		/*
		 * 실습
		 * a, b, c값을 비교
		 * 반복은 총 20회 일어나고 a, b, c 의 범위는 50이다.
		 * 
		 */
		
		Random random = new Random();
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);

			if (a > b) {
				if(max < a) {
					max = a;
				}
			}else {
				if(max < b) {
					max = b;
				}
			}
			if(max < c) {
				max = c;
			}
			i++;
		}
		System.out.println("최댓값 : " + max);
		
	}


}