package j15_스태틱.싱글톤;

public class KIA2 {
	
	private static KIA2 instance;
	
	private  Car2[] carArray;
	private  int autoCode;
	
	private KIA2() {
		carArray = new Car2[10];
		autoCode = 20230000;
		
	}
	public static KIA2 getInstance() {
		if(instance==null) {
			instance=new KIA2();
			}
		return instance;
	}
	
	
	
	public Car2 produceCar(String model) {//차량 종류를 받았을때
		//회사 이름
		String company = KIA2.class.getSimpleName();
		//차량 번호
		int carNum = ++autoCode;
		
		Car2 car2 = Car2.builder()
				.company(company)
				.model(model)
				.carNumber(carNum)
				.build();
		if (addCar(car2)) {
			return car2;
			
		}
		return null;
		
		
	}
	
	
	public  boolean addCar(Car2 car) {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i]=car;
				System.out.println("주차 성공");
				return true;
			}		
		}
		System.out.println("주차 실패");
		return false;
	}
	
	}
