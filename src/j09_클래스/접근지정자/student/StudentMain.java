package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student(null, 0, 0, null, null);
		
		Student student2 = new Student();
		student2.setName("홍길동");//입력값대입set
		System.out.println(student2.getName());//입력값출력get
	}

}
