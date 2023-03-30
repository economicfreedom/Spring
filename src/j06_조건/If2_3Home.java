package j06_조건;

import java.util.Scanner;

public class If2_3Home {

	public static void main(String[] args) {
		/*
		 * 입력
		 * 단어를 입력하세요 : 축구
		 * 농구
		 * 야구
		 * 골프
		 * 
		 * 
		 * 출력
		 * soccer
		 * basketball
		 * baseball
		 * golf
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		String sports = null;
		
		System.out.println("단어를 입력하세요 : ");
		sports = scanner.next();
		
		if(sports.equals("축구")) {
			System.out.println("soccer");
		}else if(sports.equals("농구")) {
			System.out.println("basketball");
		}else if(sports.equals("야구")) {
			System.out.println("baseball");
		}else if(sports.equals("골프")) {
			System.out.println("golf");
		}
	}

}
