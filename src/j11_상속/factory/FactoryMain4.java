package j11_상속.factory;

import java.nio.file.attribute.AclEntryFlag;

public class FactoryMain4 {

	public static void main(String[] args) {
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		Factory fsf = new SamsungFactory(1);
		SamsungFactory sf = new SamsungFactory(1);
		SamsungFactory ssf = (SamsungFactory)fsf;
		ssf.produceSmartPhone();
		
		//다운캐스팅
		//incetenceof : 객체의 원래 형태를 비교
		System.out.println(factories[0] instanceof SamsungFactory);
		
		for(int i = 0; i < factories.length; i++) {
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory) factories[i];
				samsungFactory.produceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory)factories[i];
				lgFactory.produceSmartTv();
			}else {
				System.out.println("형변환 불가");
			}
		}
		
	}

}
