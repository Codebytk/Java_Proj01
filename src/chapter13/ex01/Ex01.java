package chapter13.ex01;

import chapter13.ex01.C.D;

class C{
	int a=5;
	int b=4;
	
	int add(int a, int b) {
		return a+b;
	}
	int diff(int a, int b) {
		return a-b;
	}
	int mul ( int a , int b) {
		return a*b;
	}
	double div ( int a , int b ) {
		return(double)a / (double)b;
	}
	
	//이너클래스 : Outer 클래스의 메소드를 활용해서 기능을 구현
	class D{
		void abc () {
			System.out.println("두수의 합은 : "+ add(a,b));
			System.out.println("두수의 뺄셈는 : "+ diff(a,b));
			System.out.println("두수의 곱셈은 : "+ mul(a,b));
			System.out.println("두수의 나누기 값은 : "+ div(a,b));
		}
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 외부객체 생성
		C c = new C();
		
		
		
		//2. 이너클래스 객체 생성
		C.D d = c.new D();
		
		
		
		d.abc();

	}

}
