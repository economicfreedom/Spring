package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "김병철님, 김보현님, 김연경님, 문보배님";
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println(stringBuilder);
		/*
		 * 김병철/김보현/김연경/문보배
		 * 
		 */
		//stringBuilder.append(namex.substring(0, 3));
		//stringBuilder.append("/");
		//stringBuilder.append(namex.substring(6, 9));
		//stringBuilder.append("/");
		//stringBuilder.append(namex.substring(12, 15));
		//stringBuilder.append("/");
		//stringBuilder.append(namex.substring(18, 21));
		//System.out.println(stringBuilder);
		
		int index = names.indexOf("님"); //index = 3
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index)); //0 ,3
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);//index = 9 선언
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		
		System.out.println(stringBuilder);
		
		
		
		
	}

}
