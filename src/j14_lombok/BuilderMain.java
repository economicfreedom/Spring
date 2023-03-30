package j14_lombok;

public class BuilderMain {
	public static void main(String[] args) {
		Builder builder = new Builder();
		
		Car car = builder.builder().company("기아").model("k5").color("화이트").bulid();
		
		System.out.println(car);
	}
}
