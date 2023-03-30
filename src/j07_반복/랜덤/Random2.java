package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		Random random = new Random();//random클래스
		
		int rNum = random.nextInt(10); //0 ~ 9 까지의 수를 랜덤하게 보여줌
		System.out.println(rNum);
		
		/*
		 * 
		 * 1 ~ 45
		 * 6개
		 */
		
		int i = 0;
		while(i < 6) {
			int rNum2 = random.nextInt(46);
			System.out.println(rNum2);
			i++;
		}
		
		
	}

}
