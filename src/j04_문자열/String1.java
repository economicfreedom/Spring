package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
		//System.out.println("날씨" + "\t" + "따뜻");
		System.out.println("날씨\t\t따뜻");
		
		String address = "부산시 진구 가야동";
		
		int index1 = address.indexOf("시");//값을 뽑아냄(인덱싱)
		System.out.println(index1);
		//index 순서 첫번째 자리 무조건 0(띄어쓰기 포함)
		
		int index2 = address.indexOf("구");
		System.out.println(index2);
		
		String subAddress = address.substring(0, 5);//문자열 잘라내기 *뒤에숫자 전까지 출력 (슬라이싱)
		System.out.println(subAddress);
		
		
		String address2 = "부산광역시 서구 부민동";
		int index3 = address2.indexOf("부");
		System.out.println(index3);
		int index4 = address2.lastIndexOf("부");//뒤에서부터
		System.out.println(index4);
		
		int index5 = address2.indexOf("부", 1);//1번 index이후부터 찾음
		System.out.println(index5);
		
		// indexOf, lastIndexOf 활용해서 : "부산광역시 서구" 출력
		String subAddress2 = address2.substring(index3, index4 - 1);
		System.out.println(subAddress2);
		
		
		String address3 = address2.replace(' ', '-');
		System.out.println(address3);
		//문자를 바꿈
		String address4 = address2.replaceAll("서구", "북구");
		System.out.println(address4);
		//문자열을 바꿈
		
	}

}
