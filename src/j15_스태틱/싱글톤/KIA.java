package j15_스태틱.싱글톤;

/*
 * 싱글톤(Singleton)
 * 유일한 객체를 만들어서 공유하는 생성패턴
 * 1. 생성자는 접근지정자가 private이다.
 */

public class KIA {
	
	private static KIA instance;//싱글톤 변수(?) 유일한 객체
	
	private Car[] carArray; //주차공간
	private int autoCode; //자동차 번호
	
	private KIA() {
		carArray = new Car[10]; //주차공간
		autoCode = 20230000;//자동차 번호의 초기값
	}
	public static KIA getInstance() { //외부에서 접근 못하게 막아둔 instance 를 사용하기 위한 매소드
		if (instance==null) {//instance의 값이 없으면 true
			instance = new KIA();//instance에 KIA 생서자객체를 저장
		}
		return instance; //instance를 리턴 해주는데 사실상 KIA 생성자를 리턴해줌 
						 //이걸 받은 참조 변수는 KIA에 메소드들을 사용 할 수 있게됨
	}
	
	public Car produceCar(String model) {//차량 종류를 받았을때
		int carNumber = ++autoCode; // 이 메소드가 한 번 실행 될때마다 carNumber에 autocCode가 1증가 된 값이 들어감
		String company = getClass().getSimpleName();//클래스의 이름을 얻기 위함
		
//		Car car = new Car(carNumber,company,model);
//		실습! 빌더 사용하여 car 객체 생성
		//builder는 build로 끝나야함 build가 최종적으로 객체를 리턴해줌
		Car car = Car.builder()//Car 클래스에 어노테이션으로 만들어진 Bulider 클래스를 사용
				.company(company)//company 인스턴스 변수에 prduceCar메소드 내에서 만든 company를 넣어줌
				.model(model)//prduceCar메소드 매개변수를 넣어줌
				.carNumber(carNumber)//prduceCar메소드에서 만들어진 carNumber를 carNumber필드에 저장
				.build();		//빌더 닫기
			if (addCar(car)) {//addCar는 아래에서 작성된 메소드이다 addCar가 트루라면 car참조변수를 리턴 해주고 
				//아니라면 null를 리턴해줌
			return car;
			
		}
		return null;
		
	}
	private boolean addCar(Car car) { //리턴타입이 boolean인 매소드 
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {//만약 carArray[i]번째 인덱스에 값이 null이라면
				carArray[i]= car; //car를 넣어줌 car의 매개변수는 위 prduceCar메소드에서 받음
				System.out.println("배열에 차량 추가 완료");//저장 완료
				return true;//트루를 리턴해줌
			}
		}
		System.out.println("배열에 공간이 없습니다.");//그렇지 않을경우 배열에 공간이 없습니다가 출력되고 
		return false;//false를 리턴해줌
	}
}
