package chapter12.ex06;

interface A{
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨
	
	//추상메소드 
	//실행문이 없는 메소드
		//자식클래스에서는 선언된 메소드를 구현해야될 의무
	void abc();	//2000년에 구현된메소드
	void bcd();	//2005년에 구현된메소드
	
	//2022 년에 새로운 기능 추가됨
	//디폴트 메소드
	//인터페이스 내에서 실행 문이 있는 메소드
	 	//모든 자식 클래스에서 상속되어 내려감. 새로운 기능을 추가할때 자식클래스에서 오류없이 기능추가 
	public default void cde() {
		System.out.println("블루투스 기능 추가됨");
	}
}
class B implements A{
	@Override
	public void abc() {
		System.out.println("wifi 기능 1");
		
	}
	@Override
	public void bcd() {
		System.out.println("wifi 기능 2");
		
	}
	public void def () { //자식클래스 에서 인터페이스의 메소드 호출 : A.super. 메소드명
		//인터페이스릐 메소드를 호출시 :
		A.super.cde();		//인터페이스 A의 cde () 메소드 호출
//		super.cde();		//object 클래스의 cde 메소드 호출
		super.toString();
	}
	
}

public class Interface_Super_Use {

	public static void main(String[] args) {
		//자식클래스에서 인터페이스에 구현된 default 메소드 호출시:
		
		//1. 객체생성
		A a1 = new B();
		a1.abc();	//A 인터페이스에 존재함 // B()에서 오버라이딩 됨
		a1.bcd();	//A 인터페이스에 존재함 // B()에서 오버라이딩됨
		a1.cde();	//A 인터페이스에 존재함 // default 메소드
		
		System.out.println("==========================");
		
		//a1 을 B 타입으로 다운 캐스팅
		((B)a1).def();
		B b1 =(B)a1;
		b1.cde();
		b1.def();

	}

}
