package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		double rNum = Math.random();//0~1사이 난수를 랜덤으로 추출
		System.out.println(rNum);
		
//		int i = 0;
//		while(i < 10) {
//			double rNum2 = Math.random();
//			System.out.println(rNum2);
//			i++;
//		}
		

		int i = 0;
		while(i < 10) {
			double rNum2 = Math.random();
			System.out.println((int)(rNum2 * 10));
			i++;
		}
	}

}
