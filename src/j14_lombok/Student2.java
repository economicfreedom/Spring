package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


// @RequiredArgsConstructor 논 널이나 파이널이 있으면 이 어노테이션을 달아줘야한다
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Student2 {
	private final String name;
	private int age;
	@NonNull
	private String code;
	
}
