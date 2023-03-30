package J03_연산자;

public class Operation5Home {

	public static void main(String[] args) {

		
		/*
		 * 실습!
		 * 
		 * 89점보다 크면 (A학점)
		 * 79점보다 크면 (B학점)
		 * 69점보다 크면 (C학점)
		 * 59점보다 크면 (D학점)
		 * 나머지는 F 학점
		 * *점수가 0보다 작거나 100보다 크면 '계산불가'
		 * 
		 * 학점 : B학점
		 */
		
		
		int result = 80;
		String score = result < 0 || result > 100 ? "계산불가"
				: result > 89 ? "A학점"
				: result > 79 ? "B학점"
				: result > 69 ? "C학점"
				: result > 59 ? "D학점"
				: "F학점";
		System.out.println(score);
		
	}

}
