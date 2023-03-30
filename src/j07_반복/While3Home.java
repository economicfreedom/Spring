package j07_반복;

import java.util.Scanner;

public class While3Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * n값을 입력하세요 : 3
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * 
		 * i = 3
		 * i = 2
		 * i = 1
		 * 
		 * 
		 * 
		 * n값을 입력하세요 : 7
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * 
		 * i = 7
		 * i = 6
		 * i = 5
		 * i = 4
		 * i = 3
		 * i = 2
		 * i = 1
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("n값을 입력하세요 : ");
		n = scanner.nextInt();
		int i = 0;
		int j = 0;
		while( i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		System.out.println();
		while( j < n) {
			System.out.println("i = " + (n - j));
			j++;
		}
		
	}

}
