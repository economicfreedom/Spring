package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LGFactory lgFactory = new LGFactory(1);

		/*
		 * 배열을 통해 삼성공장 3개
		 * 엘지 공장 3개 만들기
		 * 공장번호는 1, 2, 3
		 * 
		 */


		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		LGFactory[] lgFactories = new LGFactory[3];


		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);

		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);

		System.out.println("삼성 공장 가동");
		for(int i = 0; i < 3; i++) {
			samsungFactories[i].start();
		}
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < 3; i++) {
			samsungFactories[i].stop();
			System.out.println("엘지 공장 가동");
			}
		for(int i = 0; i < 3; i++) {
			lgFactories[i].start();
			}
		System.out.println("엘지 공장 중지");
		for(int i = 0; i < 3; i++) {
			lgFactories[i].stop();




		}
	}	

}