package HomeTraning;

public class Home2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += 1;
			i++;
		}while(i <= 100);
		System.out.println("1~ " + (i - 1) + " 합 : " + sum);
		
		
	for(i = 0; i < 10; i++) {
		if(i % 2 == 0) {
			continue;
		}System.out.println(i);
	}
	}

}
