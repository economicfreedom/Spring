package j05_입력;

import java.util.Scanner;

public class Input2Home {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 입력
		 * 
		 * 이름 : 홍길동			next()			변수명 : name
	     * 나이 : 18				nextInt()				age
	     * 주소 : 부산 진구 가야동		nexLIne()			address 
		 * 연락처 : 010-3300-4698		next()				phone
		 * 
		 * 출력
		 * 사용자의 이름은 홍길동이고 나이는 18세 입니다
		 * 주소는 부산 진구 가야동입니다.
		 * 연락처는 010-3300-4698 입니다.
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("주소 : ");
		address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
		System.out.println("주소는 " + address + "입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		
		
		
		
		
		
	}

}
