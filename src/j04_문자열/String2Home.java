package j04_문자열;

public class String2Home {

	public static void main(String[] args) {

		
		/*
		 * 실습
		 * 011-3300-4698/011-1234-5678/011-1111-2222
		 * 
		 * rePhone 변수에 담아서 출력
		 */
		String phoneNumbers = "010/3300/4698, 010/1234/5678, 010/1111/2222";
		
		
		String rePhone = phoneNumbers.replaceAll("010", "011")
						.replace('/', '-')
						.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		
			}

}
