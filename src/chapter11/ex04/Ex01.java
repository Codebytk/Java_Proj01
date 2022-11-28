package chapter11.ex04;

abstract class Car{		//트럭 클래스 , 자가용 클래스, 굴삭기
	abstract void run();
	abstract void eat(); 
}
class Truck extends Car{
	@Override
	void eat() {
		System.out.println("화물 트럭에 휘발류를 주유 합니다.");
	}
	@Override
	void run() {
		System.out.println("화물 트럭의 최대 속도는 150 km/h 정도 됩니다.");
	}
}
class Sedan extends Car{
	@Override
	void eat() {
		System.out.println("벤츠에 고급유를 주유 합니다.");
	}
	@Override
	void run() {
		System.out.println("밴츠의 최대 속도는 220 km/h 정도 됩니다.");
}
}
class Excavators extends Car{
	@Override
	void eat() {
		System.out.println("굴삭기에 경유를 주유 합니다.");
	}
	@Override
	void run() {
		System.out.println("굴삭기의 최대 속도는 60 km/h 정도 됩니다.");

		}
	
	}


public class Ex01 {

	public static void main(String[] args) {
		Car c1=new Truck();
		c1.run();
		c1.eat();
		
		Car c2 = new Sedan();
		c2.run();
		c2.eat();
		Car c3 = new Excavators();
		c3.run();
		c3.eat();

		}

	}

