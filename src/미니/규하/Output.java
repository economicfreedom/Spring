package 미니.규하;

import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Output  {
	
	public String inputname;
	private String addres;
	private int age;
	private String select;
	private String gender;

}