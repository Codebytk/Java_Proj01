package chapter4.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스케너로 1월~12월까지 월을 인풋받아서 해당원의 일수를 출력해주면 됩니다.
		// 출력 : 1 월은 31입니다. 
		// 2월은 28일입니다.
		//3 /31
		//4 /30
		//5 /31
		//6 /30
		//month 월은 day 일 입니다.
		//swith 문으로 작성: <<6:00>>
		int month;
		int day=30;
		Scanner sc= new Scanner(System.in);
		System.out.println("1월부터 12월 까지중 월을뺀 숫자 하나를 입력하세여");
		month=sc.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10:
			System.out.println(month + "월은"+ ++day +"입니다.");
			break;
		case 2:
			System.out.printf("2월은 %d입니다.\n", day-2);
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은"+ day +"입니다.");
			break;	
		default:
			System.out.println("없는 월입니다. 다시입력해주세요");
		
		
		}
		
		
		
		
	}

}
