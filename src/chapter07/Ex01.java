package chapter07;

class Calc{
	
	// 사칙 연산을 처리하는 메소드
	
	
	// 두 정수의 값을 받아서 더해서 값을 던저줌
	int add(int a, int b) {
		System.out.println(a+" + "+b+"="+a+b);
		return a+b;
	}
	//빼기(diff)
	int diff(int c, int d) {
		System.out.println(c+" - "+d+"="+(c-d));
		return c-d;
	}
	
	//곱하기 (mul)
	int mul(int e, int f) {
		System.out.println(e+" * "+f+"="+e*f);
		return e*f;
	}
	
	//나누기 (div): double
	double div( double g , double h) {
		System.out.println(g+" / "+h+"="+g/h);
		return g/h;
	}
	
	
	//0면적(rec) (가로 : x 세로 : y)
	double rec(double x, double y) {
		System.out.println(x+" * "+y+"="+x*y+" cm2");
		return x*y;
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc= new Calc();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.diff(50,22));
		System.out.println(calc.div(40, 50));
		System.out.println(calc.mul(100, 55));
		System.out.println(calc.rec(50.0, 40.0));
	}

}
