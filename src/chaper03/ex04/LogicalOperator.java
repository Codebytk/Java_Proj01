package chaper03.ex04;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		//논리연산자 and (&&) or (||) xor(^^) not(!)
					//<<쇼트스킷 논리연산자and,or에서 발생>>
		//1-1
		//and & and
		//true&true (true)
		//true&false (false)
		//false & true (false)
		// false & false(false)
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println("====================");
		//1-2(or)
		//true|true (true)
		//true|false (true)
		//false|true (true)
		//false|false(false)
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println(false||(5<3));
		System.out.println(true||(5<3));
		System.out.println("====================");
		
		
		//1-3
		//Xor
		//두값이 같을때 false 다를때 true
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		System.out.println(false ^ 5<2); //두값이 같기 때문에 false
		System.out.println((10>20)^(30>20)); //두값이 다르기때문에 true
		System.out.println("====================");
		
		
		//1-4 not!
		//true 면 false
		//false 면 true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(5<3));  //원래값이 false이기 때문에 true 이다.
		System.out.println("====================");
		
		//2. 비트연산자(논리 연산가능)
		//  and (&)연산 or (|)연산 xor(^) not(~)
		System.out.println(true & true);
		System.out.println(true|false);
		System.out.println(true|(5<3));
		System.out.println(true^true);
		System.out.println(!true);
		//System.out.println(~ true); 논리연산에 not 비트연산사용불가
		System.out.println("====================");
		
		//3.쇼트 스킷: 논리연산자에서 앞에내용으로 뒤에 값을 
		System.out.println(true&&true);
		System.out.println(false && true);
			//and 연산자에서 처음자리에 false 가오게되면 뒤에 어떤값이 오더라도 false
		//or 연산 에서 앞에 true 가오면 쇼트서킷발생
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false); //앞에 false가 오기 때문에 쇼트서킷이 안일어남
		
		System.out.println("==================AND연산에서 숏트서킷발생 및 방지");
		int value1 =3;
		System.out.println(false && ++ value1 > 6); //쇼트서킷이 발생됨(논리연산자&&)
		System.out.println(value1); //3
		//쇼트서킷이 발생해 뒤에 값이 계산이 안되서 value1이 3이나옴
		
		int value2 =3;
		System.out.println(false & ++value2 > 6); //쇼트서킷이 발생 안됨(비트연산자&)
		System.out.println(value2); //4
		//비트연산자에서 쇼트서킷이 발생되지 않아 value2 에서 4가나옴
		
		System.out.println("==================OR연산에서 숏트서킷발생 및 방지");
		int value3 =3;
		System.out.println(true || ++ value3 > 6); //쇼트서킷이 발생됨(논리연산자&&)
		System.out.println(value3); //3
		//쇼트서킷이 발생해 뒤에 값이 계산이 안되서 value1이 3이나옴
		
		int value4 =3;
		System.out.println(true | ++value4 > 6); //쇼트서킷이 발생 안됨(비트연산자&)
		System.out.println(value4); //4
		//비트연산자에서 쇼트서킷이 발생되지 않아 value2 에서 4가나옴
		
		//  XOR (논리연산:^ 비트연산:^):논리연산, 비트연산 <===뒤의 값을 반드시 확인해야 결과를 알수있기 떄문에 쇼트서킷이 발생되지않음
		// 앞뒤가 같으면 false 다르면 true
		System.out.println(true^true); //false
		System.out.println(true^false); //ture
		//뒤에오는 값을 무조건 확인해야되기 때문에 숏트스킷 발생X
		
		
		
		
		
		
		
		
	}

}
