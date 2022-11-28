package chapter12.ex01;

abstract class Calc2{
	abstract void add(int a , int b);
	abstract void diff(int a , int b);
	abstract void mul(int a , int b);
	abstract void div(int a , int b);
}
class Calc_Impl2 extends Calc2{
	@Override
	void add(int a, int b) {
		System.out.println("더하기 값 출력 : "+(a+b));
		
	}
	@Override
	void diff(int a, int b) {
		System.out.println("빼기값 출력 : "+(a-b));
		
	}
	@Override
	void mul(int a, int b) {
		System.out.println("곱하기 값 출력 : "+a*b);
		
	}
	@Override
	void div(int a, int b) {
		System.out.println("나누기 값 출력 : "+a/(double)b);
		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
	int a=5;
	int b=7;
	System.out.println("==========================");
	Calc2 c1 = new Calc_Impl2();
	c1.add(a, b);
	c1.diff(a, b);
	c1.mul(a, b);
	c1.div(a, b);
	System.out.println("============익명 클래스로 메소드 호출==============");
	
	Calc2 c2 = new Calc2() {
		@Override
		void add(int a, int b) {
			
			System.out.println("더하기값 출력: "+ (a+b));
		}
		@Override
		void diff(int a, int b) {
			System.out.println("빼기값 출력: "+(a-b));
		}
		@Override
		void mul(int a, int b) {
			System.out.println("곱하기값 출력: "+a*b);
			
		}
		@Override
		void div(int a, int b) {
			System.out.println("나누기값 출력: "+a/(double)b);
		}
	};
	c2.add(a, b);
	c2.diff(a, b);
	c2.div(a, b);
	c2.mul(a, b);
	
	}

}
