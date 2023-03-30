package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
	private int studentCode;
	private	String name;
	private	int studentYear;
	private	int age;

	
	
}
