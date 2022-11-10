package chaper03.ex03;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 연산 vs 등가 비교 연산자
		
		//1. 크기비교 연산(<,>,<=,>=)===>true, false
		System.out.println(5>2); //true
		System.out.println(5<2); //false
		
		System.out.println(5 >= 5); //true
		System.out.println(5 <= 5); //true
		System.out.println("==========");
		
		//2. 등가 비교 연산자( == , !=) ==> true or false
			// == : 값이 같을 때 true 값이다를때 false
			// != : 값이 다를때 True 값이 같을때 false
			// 값이 같은지 다른지를 비교하는 연산자
			//stack 메모리의 값을 비교
			//stack 에 값이 저장되는 것은 기본 자료형
		int a=5;
		int b=2;
		int c=5;
		
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		System.out.println(a == c); //true
		System.out.println(a != c); //false
		
		System.out.println();
		
		//참조 자료형일때 (Heap 여역에 값이 저장, stack 영역에는 Heap에 번지수가 들어있다.
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println( str1 == str2 );
		//참조영역에서 값을 비교할때? .equals () 를 사용해서 값을 비교함
			//Heap 영역의 값을비뵤할때는 .equals() 를 사용해야한다.
		//객체 변수1 .euqals(객체변수2) :Heap영역을 비교할때
		System.out.println(str1.equals(str2));
		
		

	}

}
