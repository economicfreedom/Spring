package j10_배열;

public class Array2Home {

	public static void main(String[] args) {
//		numbers4 라는 배열 만들기(방은 1000개)
//		0번방부터 1씩 오름차순 대입
//		배열 모든값 출력
		
		
		int[] numbers4 = new int[1000];
		for(int i = 0; i < 1000; i++) {
			numbers4[i] = i + 1;
			System.out.println(numbers4[i]);
		}
	}

}
