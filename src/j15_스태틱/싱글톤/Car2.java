package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Car2 {
	private String company;
	private String model;
	private  int carNumber;
	
}
