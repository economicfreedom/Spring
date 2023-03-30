package j12_다형성.인터페이스;

/*
 * 1인터페이스 특징(상속이라고 하지 않고 구현이라고 한다)
 * // 추상매소드의 특징은 실행문이 없다 

2. 인터페이스도 생성을 할 수 없다
3. 일반 변수는 선언 할 수없다
4. 무조건 스태틱 상수를 사용한다.
5. 일반 메소드를 정의하기 위해 반환 자료형 앞에 default를 입력해야한다
6. 인터페이스는 다중구현이 가능하다
(ex. public default void disConnect();)
 * 
 */

public interface HDMI {
	
	//추상 매소드
	public void connect();
	public void disConnect();
	
//	public int number
	//기울어진 글자는 스태틱 상수(static)
	public int NUMBER = 10;
	
	
	
}
