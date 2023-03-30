package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 랜덤으로 0 ~ 9 까지의 수를 10개뽑고 그 수 중 가장 큰 값을 출력
		 * 
		 *  
		 */
		
		Random random = new Random();
		
		int ct = 0;
		int max = 0;
		int rNum = 0;
		while (ct < 10) {
			rNum = random.nextInt(10);
			
			if(ct == 0) {
				max = rNum;
			}else {
				if(max < rNum) {
					max = rNum;
				}
			}
			System.out.println("새로 생성된 값 : " + rNum);
			System.out.println("기준값 : " + max);
		
			ct++;
					
		}
		System.out.println("최대값 : " + max);
		
	}

}
