package j12_다형성.Factory;

public class FactoryMain {
	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory saFactory = new SamsungFactory(2);
		LGFactory lgFactory = new LgFactory(1);
		
		//코드를 짤때는 결합성은 낮추고 응집도는 높혀야한다.
		
		saFactory.start();
		FactoryService factoryService = new FactoryService(lgFactory);
		
		factoryService.factoryStart();
		factoryService.factoryStop();
		
		
	}
}
