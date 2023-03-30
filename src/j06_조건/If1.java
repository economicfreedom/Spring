package j06_조건;

public class If1 {

	public static void main(String[] args) {
		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라
		boolean money = true;
		
		if(money) {
			System.out.println("택시를 타고 가라");
		}
		
		if(!money) {
			System.out.println("걸어가라");
		}
		
		
		boolean money2 = false;
		if(money2) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");
		}
		//ctr+shift+f
		
		/*
		 * if문의 기본구조
		 * if(조건문) {
		 * 		<수행할 문장1>;
		 * 		<수행할 문장2>;
		 * 		...
		 * } else {
		 * 		<수행할 문장a>;
		 * 		<수행할 문장b>;
		 * 		...
		 * }
		 * 
		 * 
		 */
		
		boolean money3 = false;
		if(money3) System.out.println("택시를 타고가라");//명령문이 하나이면 중괄호 생략가능
						System.out.println("잔돈을 받아라");
		
	}

}
