package chapter13.ex09;

interface Car{
	void run();
	void stop();
	void start();
}

class Carplay{
	void abc(Car c1) {
		c1.run();
		c1.stop();
		c1.start();
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 메소드 호출하기 위한 객체 생성
		Carplay c2= new Carplay();
		
		//2. 메소드 호출시 Car 인터페이스의 메소드를 구현해서 매개변수로 인풋
		c2.abc(new Car(){
			@Override
			public void run() {
				System.out.println("엑셀을 밟습니다.");
			}
			@Override
			public void start() {
				System.out.println("차에 시동을 걸어줍니다.");
				
			}
			@Override
			public void stop() {
				System.out.println("브레이크를 밟습니다.");
				
			}
		});
			
		
		

	}

}
