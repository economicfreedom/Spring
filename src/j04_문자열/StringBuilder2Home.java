package j04_문자열;

public class StringBuilder2Home {

	public static void main(String[] args) {

		
		
		String names = "김병철님, 김보현님, 김연경님, 문보배님";
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println(stringBuilder);
		/*
		 * 김병철/김보현/김연경/문보배
		 * 
		 */
	
	
		int index = names.indexOf("님");
		System.out.println(index);
		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		System.out.println(stringBuilder);
		
		
	}

}
