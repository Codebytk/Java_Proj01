package chapter01.ex03;

public class DateTypeJava {

	public static void main(String[] args) {
		// 변수를 생성후 출력하기
		// 변수를 선언전에 변수에 어떤 데이터 형식을 저장할지 선언
		int a ;    // 변수선언, int 정수를 담는 변수
		a = 10;
		
		System.out.println(a);  //10
		a = 20;
		System.out.println(a);  //20
		
		//a = 10.5;  //실수는 담을 수 없다.
		
		float b ; //float : 실수를 저장할수 있는 변수
		b = 10;
		System.out.println(b);
		
		double c ;
		c = 10.5;
		System.out.println(c);

	}

}
