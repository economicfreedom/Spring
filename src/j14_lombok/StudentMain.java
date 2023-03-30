package j14_lombok;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student(2023001,"홍길동",2023,18);
		student.getName();
		
		Student st2 = Student.builder()
				.age(20)
				.studentCode(20230002)
				.studentYear(3)
				.name("최규하")
				.build();
		
			
		
//		이렇게 사용하면 장점이 변수명도 보여주고 순서를 마음대로 해도 된다.
//		자바 빌더 패턴의 장점 
//		필요한 데이터만 설정할 수 있고 유연성이 확보된다
//		가독성도 좋아지며 변경시 편리하다
		
	}
}
