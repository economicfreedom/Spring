package j12_다형성.company;

public abstract class Work {
	public void coffe() {
		System.out.println("커피를 채워야함");
	}
	
	public void trash() {
		System.out.println("쓰레기통을 비워야함");
	}
	//abstarct ->메모한다
	public abstract void workA();

	public abstract void workB();
	
	public abstract void workC();
	
}
