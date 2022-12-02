package chapter16.ex08;
//제네릭 메소드의 타입제한

class A{
	//Number : boolean, charter 를 제외한 정수, 실수를 처리하는
		//Byte , Short, Integer, Long, Float, Double
	
	public <T extends Number> void method1(T t) {
		//Object 클래스의 메소드 외의 number의 메소드를 사용 가능함
		System.out.println(t.intValue());	//intValue() : Number 의 메소드
	}
}
//인터 페이스
interface MyInterface{
	void print();		//public abstract
}
class B{
	
	//T : MyInterface 하위의 구현 클래스가 올 수 있다, 주의 : 타입을 제한할떄는 extends 를 사용.
	public <T extends MyInterface>void method1(T t){
		t.print();
	}
}




public class BoundedtypeOfGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.<Double>method1(10.5); 	//<Double >생략
		a.method1(10.5);
		
		
		B b = new B();
		
		
		b.<MyInterface>method1(new MyInterface() {	//<MyInterface> 생략 가능
			
			@Override
			public void print() {
				System.out.println("print() 구현됨");
				
			}
		});
		
		
		
		
		
		
		
	}

}
