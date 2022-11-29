package chapter13.ex05.a;
//1. 인터페이스를 구현한 클래스를 생성후 출력

interface A{
	void cry();
	void fly();
}
class B{
	
	
	A a= new C();
	void abc() {
		a.cry();
		a.fly();
	}
	class C implements A{
		
		@Override
		public void cry() {
			System.out.println("interface A 의 cry 메소드");
		}
		
		@Override
		public void fly() {
			System.out.println("interface A 의 fly 메소드");
			}
		}
		
	
}
//4시 40 분 까지 완료
//A 클래스의 abc () 메소드 호출시 C 클래스의 구현된 메소드 출력

public class Anonimous_Class01 {

	public static void main(String[] args) {
		B bb = new B();
		bb.abc();

	}

}
