package j09_클래스.접근지정자;

import javax.print.attribute.SetOfIntegerSyntax;

import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;
import j09_클래스.접근지정자.b.TestB_2;

public class AccessModifierMain {

	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2();
		testA_2.testA2();
		
		TestB testB = new TestB();
		System.out.println(testB.getTb());
//접근지정자(public)를 지정하지 않으면 
//디폴트처리(디폴트는 동일 패키지 까지만 허용)
		/*
		 * private - 같은 클래스가 아니기 떄문에 주소참조로 값을 넣을수 없다.
		 * 따라서 생성자 또는 메소드를 통해 값을 주입.
		 *  
		 */
	}

}
