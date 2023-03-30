package j12_다형성.Factory;

public class FactoryService {
	private Factory factory;
	
	public FactoryService(Factory factory) {
		
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}

}
