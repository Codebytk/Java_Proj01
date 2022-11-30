package chapter14.ex06;

//1. 예외 발생할때 각 매소드 내부에서 예외를 직접 처리함
class Aa{
	void abc() {	//bcd() 메소드 호출
		bcd ();
	}
	void bcd() {	// 메소드 블락 내에서 직접 예외 처리
		try {
		System.out.println(3/0);
		int []arr = new int [] {1,2,3,};
		System.out.println(arr[5]);
		}catch (NumberFormatException| ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println("오류발생");
		}
		try {
		Thread.sleep(1000); 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb{
	void abc() throws Exception{
		bcd();
	}
	void bcd() throws Exception  {
		System.out.println(3/0);
		int []arr = new int [] {1,2,3,};
		System.out.println(arr[5]);
		Thread.sleep(1000); 
	}
}

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("============예외를 클래스 내부에서 처리===================");
		Aa a = new Aa();
		a.abc();
		System.out.println("============예외를 전가해서 출력할떄 처리==================");
		Bb b = new Bb();
		try {
			b.abc();
		}catch(NumberFormatException| ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("오류발생2");
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	
		
	}

}
