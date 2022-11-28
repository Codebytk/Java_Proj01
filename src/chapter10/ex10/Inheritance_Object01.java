package chapter10.ex10;

//java.lang import 없이 사용이 가능

class A{
	int m = 3;
	int n = 4;
	
	String name;
	//toString() : object 클래스의 메소드
	//객체를 출력시 toString() 메소드사 작동이되었고,기본적으로 패키지 이름, 클래스 이름 @hashcode()
	//객체의 자체를 출력시 객테의 필드의 값을 출력하도록 재정의 해서 사용
	
	
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
	
	
	
}


public class Inheritance_Object01 {

	public static void main(String[] args) {
		A a = new A();
		
		//객체 자체를 출력시 Object 클래스의 toString()
		//패키지 이름, 클래스 이름 @hashcode()
		//hashcode ==> 참조주소 : 객체에 저장된 Heap 메모리 주소
		
		System.out.println(a);
		System.out.println(a.toString());
		
		//String 클래스는 toString () 가 제정의 되어져 있다.
		String s1 = new String("안녕");
		System.out.println(s1);

	}

}
