package j03_연산자;

public class Opertion4 {
	public static void main(String[] args) {
		/*
		 * 윤년
		 * :해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수일 때
		 */
		
		
		int year = 1990;
//		처음 조건 연산자에서에서 내리고
		String result =year % 4 == 0 
				&&(year % 100 != 0 || year % 4 == 0)? "윤년" //true까지 적고 false를 아래로 내림
						:"윤년아님" ;
		System.out.println(result);
		System.out.println(year > 2000 ? "2000보다 큼"
								: year > 1000? "1000보다 큼"
								: year > 500? "500보다 큼"
								:"500이하"); //코드는 우 하향을 향하면 안됨
		
		
		
		
	}
}
