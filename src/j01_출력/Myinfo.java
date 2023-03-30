package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		/*
		 * 자동완성 단축키 -> sysout ctr + space
		 * 
		 */
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		// ctr + art + 아랫방향키
		
		int age = 18;
		String address = "부산 진구 범천동";
		
//		System.out.print("이름 : ");
//		System.out.println("홍길동");
		
		System.out.print("이름 : ");
		System.out.println("홍길동");
		System.out.print("나이 : ");
		System.out.println(18);
		System.out.print("주소 : ");
		System.out.println("부산 진구 범천동");
		
		System.out.print("이름 : ");
		System.out.println("" + name1 + name2 + name3);//"" + 뒤에꺼를 문자열로 보여줌(기준 왼쪽)
		//System.out.println(name1 + name2 + name3 + "");
		System.out.print("나이 : ");
		System.out.println(age);
		System.out.print("주소 : ");
		System.out.println(address);
		
		
		
		
	}

}
