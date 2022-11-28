package chapter12.ex03;

interface Animal1 {
	void cry();

}

interface Animal2 {
	void run();
}

interface Animal3 {
	void eat();
}

//interface extends interface 
//앞과 뒤의 타입이 동일할 때에는 extends
interface K extends Animal1, Animal2, Animal3 {
	//cry() run() eat()
}

class Aa {
	void abc() {
		System.out.println("Aa의 abd()");
	};
}

abstract class Bb {		//추상클래스 :추상메소드 가 1개라도 존재현
	abstract void bcd() ;
	
}

// extends 키 다음에는 1개의 클래스만올수 있다. // 클래스는 하나의 부모만 가진다.
	// 일반 클래스 , 추상클래스 
//implements 키 다음에는ㄴ 여러개의 인터페이스가 올수 있다.//인터페이스는 다중상속이 가능
class Cc extends Aa implements Animal1, Animal2, Animal3 {
	@Override
	void abc() {
	
		super.abc();
	}
	@Override
	public void cry() {}

	@Override
	public void run() {}

	@Override
	public void eat() {}
}

public class Interface_test02 {

	public static void main(String[] args) {

	}

}
