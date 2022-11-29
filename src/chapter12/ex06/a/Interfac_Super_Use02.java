package chapter12.ex06.a;

//자식 클래스 에서 인터페이스 메소드 호출:
	//default, static 메소드 호출 ㅡ<===인터페이스 내에서 기능이 구현된 메소드
interface A{	// 인터페이스 : 추상 메소드만 존재해야함 (예외 default, static 메소드)
	default void abc() {
		System.out.println("A 인터페이스의 default 메소드");
	}
}
interface B{
	default void bcd() {
		System.out.println("B 인터페이스의 default 메소드");
	}
}
class C{	//추상클래스 : 추상메소드+ 일반메소드 + 일반필드
	C(){}
	
	void cde (){
		System.out.println("추상클래스의 일반 메소드");
	}
	
	
}
// 클래스 D 는 C 클래스를 상속하고 있고 A,B 인터페이스를 구현하고 있다.
class D extends C implements A,B{	
	//A 인터페이스와 B인터페이스의 메소드 이름 동일
	void hij() {
		super.cde(); 
	}
	void lmn() {
		A.super.abc();
		B.super.bcd();
	}
}

public class Interfac_Super_Use02 {

	public static void main(String[] args) {
		//객체 생성후 확인
		D d1 = new D();
		d1.hij();
		d1.lmn();

	}

}
