package j07_반복.랜덤;

import java.util.Random;

public class Random3Home {

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
		
		
		
		while(i < 50) {
		a = random.nextInt(50);
		b = random.nextInt(50);
		c = random.nextInt(50);
		if(a > max) {
			max = a;
		}else if(b > max) {
			max = b;
		}else if(c > max) {
			max = c;
		}
		
		i++;}
		System.out.println(max);
	}

}
