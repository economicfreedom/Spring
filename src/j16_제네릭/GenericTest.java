package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<T,E> {
	//클래스엔 E를 자주 쓰고 T는 타입에 자주쓰인다
	private E number;
//	private String data;
	private T data;

}
