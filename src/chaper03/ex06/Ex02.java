package chaper03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 스케너로 3,6,9의 배수이면 "3,6,9의 배수입니다."
			//그렇지 않으면 3,6,9의 배수가 아닙니다.
		
		Scanner sc =new Scanner(System.in);
		int a;
		System.out.println("3,6,9의 배수중 하나를 입력해주시요");
		a=sc.nextInt();
		String b = ((a%3)==0) ? "3,6,9의 배수입니다" : "3,6,9의 배수가 아닙니다.";
		System.out.println(b);
		

	}

}
