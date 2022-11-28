package chapter12.ex01;

abstract class Calc{	// 사칙연산을 계산하는 계산기 클래스
	abstract int add(int a, int b); //더하기
	abstract int diff(int a, int b); 	//뺴기
	abstract int mul(int a, int b);		// 곱하기 
	abstract double div(int a, int b);	// 나누기
}

class Calc_Impl extends Calc{	//calc 를 구현한 클래스
	@Override
	int add(int a, int b) {
		return a+b;
	}
	@Override
	int diff(int a, int b) {
		return a-b;
	}
	@Override
	double div(int a, int b) {
		return a/(double)b;
	}
	@Override
	int mul(int a, int b) {
		return a*b;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("==============================");

		int a = 5 ;
		int b = 4 ;
		Calc c1= new Calc_Impl();
		System.out.println("더하기 값 출력 : "+c1.add(a, b));
		System.out.println("빼기 값 출력 : "+c1.diff(a, b));
		System.out.println("나누기 값 출력 : "+c1.div(a, b));
		System.out.println("곱하기 값 출력 : "+c1.mul(a, b));
		
		System.out.println("===============================");
		
		Calc c2 = new Calc() {
			@Override
			int add(int a, int b) {
				System.out.println("더하기 값 출력"+(a+b));
				return a+b;
			}
			@Override
			int diff(int a, int b) {
				System.out.println("빼기 값 출력 : "+(a-b));
				return a-b;
			}
			@Override
			double div(int a, int b) {
				System.out.println("나누기 값 출력 : "+(a/(double)b));
				return a/(double)b;
			}
			@Override
			int mul(int a, int b) {
				System.out.println("곱하기 값 출력 : "+(a*b));
				return a*b;
			}
		};
		c2.add(a, b);
		c2.diff(a, b);
		c2.div(a, b);
		c2.mul(a, b);
		
		
		// 1. 구현한 클래스의 메소드 호출후 출력
		// 2. 익명 클래스로 메소드 호출후 출력
	}
}


