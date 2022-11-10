package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 완료시간 : <3시 45분>
		 //<문제> 스케너를 등록하고 , 
		// 어머님 이름, 아버님 이름, 형제이름, 자신이름   sc.next()
		// 어머니 나이, 아버지 나이, 형제나이, 자신 나이  sc.nextint()
		
		//콘솔에서 인풋받은 이름은 모두 
		// 나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner (System.in);
		
		String 어머니,아버지,동생,자신;
		int 어머니나이, 아버지나이, 동생나이, 자신나이;
		
		
		System.out.println("어머니 성함을 입력하시요>>>");
		어머니=sc.next();
		System.out.println("아버지 성함을 입력하시오>>>");
		아버지=sc.next();
		System.out.println("동생의 이름을 입력하시오>>>");
		동생=sc.next();
		System.out.println("자신의 이름을 입력하시오>>>");
		자신=sc.next();
		System.out.println("===================");
		System.out.println("아버지의 나이를 입력하시오>>>");
		아버지나이=sc.nextInt();
		System.out.println("어머니의 나이를 입력하시오>>>");
		어머니나이=sc.nextInt();
		System.out.println("동생의 나이를 입력하시오>>>");
		동생나이=sc.nextInt();
		System.out.println("자신의 나이를 입력하시오>>>");
		자신나이=sc.nextInt();
		
		int sum;
			sum= 아버지나이 + 어머니나이 + 동생나이 + 자신나이;
		double avg = sum/4.0;
		System.out.println("가족나이의 평균은 "+avg+"입니다");
		
		

	}

}
