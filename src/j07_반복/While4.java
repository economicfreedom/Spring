package j07_반복;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		// 구구단
		int dan = 2;
		int num = 0;
		
		System.out.println(dan + " x " + num + " = " + (dan * num));
		
		
		/*
		 * 실습
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 
		 */
		
		
		
		
		
		int i = 0;
		
		while (i < 9) {
			num = num + 1;
			System.out.println(dan + " x " + num + " = " + (dan * num));
			i++;
		}
		
//		
//		int i = 0;
//		while(num < 9 ) {
//			num = i + 1;
//			System.out.println(dan + " x " + num + " = " + (dan * num));
//			i++;
//		}
		
		
	}

}
