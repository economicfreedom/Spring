package Baekjoon;

public class Home33 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i ;
			
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
//		더하려는 output의 자료형이 String이기 때문에 <<i가 자동으로 String으로 형변환됩니다. 
//		>> ""는 반복해서 더해지는 것이 아닙니다
//		i가 int로 선언되었지만 String 취급받습니다. 
//
//		i=1 일때 output <= output(현재 "")+"1";
//		연산결과 output="1";
//		i=2 일때 output <= output( 현재 "1")+"2"; 
//		이런 식입니다
	}
}
