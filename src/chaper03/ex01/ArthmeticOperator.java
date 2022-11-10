package chaper03.ex01;

public class ArthmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자와 세가지 경우의 증감염산자
		
		//1. 산술연산자
		System.out.println(2+3);  //5  + : 산술연산
		System.out.println(2+"3"); //  + : 연결 연산자
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2);
		System.out.println(8%5);  //3  %:나머지 값만 출력
		System.out.println(8%9);  //8
		System.out.println("================");
		
		
		//2. 중간연산자(case1)
		int value1=3;
		value1++; //++ :1씩 증가
		System.out.println(value1);
		int value2 =3;
		++value2;
		System.out.println(value2);
		System.out.println("================");
		
		//3. 증감 연산자(case2) <<중요함>>
		int value3=3;
		int value4=++value3;  //++를 앞에두면 value3,4에 1이추가된 값이나옴 뒤에두면 value3만 증가
		
		System.out.println(value3); //4
		System.out.println(value4); //3
		
		System.out.println("================");
		
		int value5= 3;
		int value6= ++value5;
		System.out.println(value5);
		System.out.println(value6);
		
		System.out.println("================");
		
		//4. 증감연산자의 사용 (case3)
		int value7 = 3;
		int value8= 4;
		int value9= 2+ value7--+ ++value8; // 2+3+5
				
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		int value10 = 30;
		int value11 =40;
		int value12 = 50;
		int value13=7+ --value10+ ++value11+value12--;
		                    
		
		System.out.println(value10);
		
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		

	}

}
