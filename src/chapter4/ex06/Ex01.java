package chapter4.ex06;

import java.util.Scanner;

public class Ex01 {
				
	public static void main(String[] args) {
		// 스케너로 인풋받은 값을 선택시 해당내용을 이중 for 문을 사용해서 출력하세요.
		//4. 프로그램 종효시 까지 무한루프를 돌려서 작동시키세요
		//1~4번 외의 내용 선택시 "잘못된 입력입니다. 1~4까지만 넣어주세요
		Scanner sc=new Scanner(System.in);
		int a; //스케너를 입력받는 변수
		do{
		System.out.println("==========================================================");
		System.out.println("1. 구구단 출력|2. 19단 출력 |3.19단중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("==========================================================");
		System.out.println("위 번호를 선택하세요>>");
		a=sc.nextInt();
		
		if(a==1) {
			System.out.println("1. 구구단 출력");
			for(int i=1; i<10; i++) {
				System.out.println(i + "단 출력");
				for (int j=1; j<10; j++) {
				System.out.print(i+" × "+j+" = "+i*j+"\t");
				}
				System.out.println();
			}
		}else if (a == 2){
			for(int i=1; i<20; i++) {
				System.out.println(i + "단 출력");
				for (int j=1; j<10; j++) {
				System.out.print(i+" × "+j+" = "+i*j+"\t");
				}
				System.out.println();
			}
		}else if (a==3) {
			for(int i=1; i<20; i++) {
				if(i%7==0) {
					System.out.println(i + "단 출력");
					for (int j=1; j<10; j++) {
					System.out.print(i+" × "+j+" = "+i*j+"\t");
					}
					System.out.println();
				}
				
			}
		}else if(a==4) {
			System.out.println("4. 프로그램 종료");
			break;
		}else {
			System.out.println("잘못된 입력입니다. 다시입력해주세요");
		}
		System.out.println();
		}while (true);
	}

}
