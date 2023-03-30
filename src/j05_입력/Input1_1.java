package j05_입력;

import java.util.Scanner;

public class Input1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		String address = null;
		int phone = 0;
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();//띄어쓰기 받음
		
		System.out.print("주소지를 입력하세요 : ");
		address = scanner.nextLine();
		
		System.out.print("핸드폰 번호를 입력하세요(010 제외) : ");
		phone = scanner.nextInt(); //숫자만 담음
		
		System.out.println("이름 : " + name);
		System.out.println("주소지 : " + address);
		System.out.println("연락처 : " + phone);
		
		
		
		
	}

}
