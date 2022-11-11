package chaper03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//<문제> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수 이면 "홀수 라고 출력하고
		//		//인풋받은 값이 짝수 이면 짝수라고 출력
			//3항연산자를 사용
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("숫자중 하나를 입력하시오");
		a=sc.nextInt();
		String b= ((a%2)==0) ? "짝수" : "홀수";
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
