package chapter4.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램 하세요.
		//	스케너로 정수 1을 인풋받으면 "금매달입니다"출력
		//			  2를 인풋받으면 "은매달입니다"출력
		//			  3을 인풋받으면 "동매달 입니다."출력
		//				그외 값을 인풋받으면 "매달이없습니다."
		//<문제2>
		// 스케너로 문자열 gold 를 인풋받으면 "금매달입니다"
		// 스케너로 문자열 silver 를 인풋받으면 "은매달입니다"
		// 스케너로 문자열 bronze 를 인풋받으면 "동매달입니다"
		//                       그외에 "매달이 없습니다."
		
		int medal;
		Scanner a=new Scanner(System.in);
		
		System.out.println("당신의 순위를 적어 주세요.");
		medal =a.nextInt();
		switch (medal) {
		case 1:
		System.out.println("금매달입니다");
		break;
		case 2:
			System.out.println("은매달입니다");
		break;
		case 3:
			System.out.println("동매달입니다.");
		break;
		default:
			System.out.println("매달이 없습니다.");
		}
		System.out.println("==================");
		String medal2;
		
		System.out.println("매달의 색을gold, silver, bronz중하나를 적어주세요");
		medal2=a.next();
		switch (medal2) {
		case "gold": case "Gold": case "GOLD":
			System.out.println("금매달 입니다.");
			break;
		case "silver":
			System.out.println("은매달 입니다.");
			break;
		case "bronz":
			System.out.println("동매달 입니다.");
			break;
		default:
			System.out.println("매달이 없습니다.");
			
			
		}
		a.close();
		
		
		
		
		

	}

}
