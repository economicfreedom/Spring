package j15_스태틱;

import lombok.Data;

@Data // getter setter tostring등 기본(?)매소드 오버라이딩 하는 어노테이션
public class Student {
	public static int autocode = 20230000; //학생번호 자동증가
	
	private int studentCode; //학생번호
	private String name; //학생 이름
	
	public Student(String name) {
		studentCode = ++autocode; //증가 연산자로 1씩 늘림
		this.name=name; //this 사용해서 private로 된 name을 메인에서 접근하기 

	}
	
	
}
