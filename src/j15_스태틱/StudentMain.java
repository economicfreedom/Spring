package j15_스태틱;


import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		/*
		 * 실습!
		 * 학생 10명이 들어가는 배열 만들기
		 * 반복문을 통해 
		 * 학생 10명을 생성
		 * 생성할 때 이름은
		 * 홍길동1
		 * 홍길동2
		 * ...
		 * 홍길동10
		 * 으로 줘서 생성
		 * 
		 * 10명의 학생객체를 반복문을 통해 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사람 수 입력");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		String name;
		
		for (int i = 0; i < students.length; i++) {
			students[i]= new Student("홍길동"+(i+1));
			System.out.println("student["+i+"]: "+students[i]);
		}
		

		
	}
	
	
	
}
