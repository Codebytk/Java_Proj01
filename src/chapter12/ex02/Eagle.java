package chapter12.ex02;

public class Eagle implements Animal{
	@Override
	public void cry() {
		System.out.println("끼이옹옹");
		
	}
	@Override
	public void run() {
		System.out.println("독수리는 날아다닙니다.");
		
	}

}
