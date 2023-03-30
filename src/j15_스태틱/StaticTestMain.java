package j15_스태틱;

import java.util.jar.Attributes.Name;

public class StaticTestMain {
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		staticTest.name = "홍길동";
		
		System.out.println(staticTest.name);
		
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest2.name);
		
//		static은 각 객체의 번지를 공유하기 떄문에 하나만 객체의 필드값 하나만 바꿔줘도
//		같은 필드에 변수들이 바뀐다
		
		staticTest2.name = "이순신";
		System.out.println(staticTest2.name);
		System.out.println(staticTest.name);
		
		StaticTest.name="최연호";
		StaticTest staticTest3 = new StaticTest();
		System.out.println(staticTest3.name);
		
		System.out.println(staticTest2.name);
	}
}
