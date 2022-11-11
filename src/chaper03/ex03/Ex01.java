package chaper03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <실습 문제><완료시간:6시10분 , p.jangwoo@gmail.com Ex01.java>
		// 정수 2개를  Scanner로 인풋 받고 두값이 같으면  true를 출력 다르면 false를 출력
		// 이름 2개를 Scanner로 인풋 받고 두 값이 같으면 true 다르면 false
			//등가 연산자 사용.
			//기본자료형 : ==
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
			//참조자료형 : aName.equals(bName)

		String aName, bName;
		
		
		System.out.println("자신이 생각하는 숫자>>");
		a =sc.nextInt();
		System.out.println("자신이 생각하는 숫자2>>");
		b = sc.nextInt();
		System.out.println(a==b);
		System.out.println("같다면 true 다르면 false");
		System.out.println("======================");
		System.out.println("자신이 생각하는 사람의 이름.>>");
		aName=sc.next();
		System.out.println("자신이 생각하는 사람의 이름2.>>");
		bName=sc.next();
		System.out.println(aName.equals(bName));
		System.out.println("같다면 true 다르면 false");
		
		int data=11;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println(Integer.toOctalString(data));
		
		
		
		
		
	}

}
