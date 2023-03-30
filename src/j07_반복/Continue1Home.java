package j07_반복;

public class Continue1Home {

	public static void main(String[] args) {
		
		/*
		 * 실습! continue를 사용하여 1부터 100까지 수 중 홀수의 합을 구하시오
		 */
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			int j = i + 1;
			if(i % 2 == 0) {
				continue;
			}
			sum += j;
		}System.out.println(sum);
		
		
	}

}
