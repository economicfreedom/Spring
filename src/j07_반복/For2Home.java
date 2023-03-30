package j07_반복;

public class For2Home {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 2단
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 3단
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * 
		 * ...
		 * 9단
		 * ...
		 * 9 x 9 = 81
		 * 
		 * 
		 */
		
	for(int i = 0; i < 8; i++) {
		int dan = i + 2;
		System.out.println(dan + "단");
		for(int j = 0; j < 9; j++) {
			int num = 1 + j;
			System.out.println(dan + " x " + num + " = " + (dan * num));
			}
		}
	}

}
