package my.ex01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Today1114 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// <문제 > 2중 for 문을 사용해서  1단 ~19 단 까지 출력
		// 3의 배수단 출력
		
		
				for (int i=1; i<20; i++) {
			System.out.println(i+"단 출력");
			for (int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		// <문제 > : 2중 for 문을 사용해서 1단 ~ 9단 출력 print \t
				// 1단 
				// 1*1=1	1*2=2	1*3=3.....1*9=9
				// 2단
				// 2*1=2	2*2=4	2*3=6.....2*9=18]
				//......
				//9단 까지
		
		for(int i=1; i<10; i++) {
			System.out.println(i+"단 출력");
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+i*j+"\t");
				}
			System.out.println();
		}
		
		
		
		
		
		//<문제> do while 문으로 무한루프를 돌립니다.
				//스케너에서 1을 넣으면 1. 평균출력  출력
				//스케너에서 2을 넣으면 2. 합계출력  출력
				//스케너에서 3을 넣으면 3. 이름출력  출력
				//4번을 넣으면 do while 빠져나오기
		do {
		System.out.println("==========================");
		System.out.println("1. 평균 출력|2. 합계출력 |3.이름출력 | 4. 프로그램 종료");
		System.out.println("==========================");
		System.out.println("위 번호를 선택하세요>>");
		int a; //선택지
		a = sc.nextInt();
		if (a==1) {
			System.out.println("1. 평균출력");
		}else if(a==2) {
			System.out.println("2. 합계출력");
		}else if(a==3) {
			System.out.println("3. 이름출력");
		}else if(a==4) {
			System.out.println("프로그램 종료합니다.");
			break;
		}else {
			System.out.println("없는 선택지 입니다. 다시입력해주세요");
		}
		}while(true);
		
		// 스케너로 인풋받은 값을 선택시 해당내용을 이중 for 문을 사용해서 출력하세요.
		//4. 프로그램 종효시 까지 무한루프를 돌려서 작동시키세요
		//1~4번 외의 내용 선택시 "잘못된 입력입니다. 1~4까지만 넣어주세요
		do {
		System.out.println("==========================================================");
		System.out.println("1. 구구단 출력|2. 19단 출력 |3.19단중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("==========================================================");
		System.out.println("위 번호를 선택하세요>>");
		int a; // 스케너 출력값
		a= sc.nextInt();
		if (a==1) {
			System.out.println("1. 구구단 출력");
			for(int i=1; i<10; i++) {
				System.out.println(i+"단 출력");
				for(int j=1; j<10; i++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}else if (a==2) {
			System.out.println("2. 19단 출력");
			for(int i=1; i<20; i++) {
				System.out.println(i+"단 출력");
				for(int j=1; j<10; i++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}else if (a==1) {
			System.out.println("3. 7의 배수단 출력");
			for(int i=1; i<10; i++) {
				if (i%7==0) {
				System.out.println(i+"단 출력");
				for(int j=1; j<10; i++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				}
				System.out.println();
			}
		}else if (a==4) {
			System.out.println("4. 프로그램 종료");
			break;
			
		}else {
			System.out.println("없는 선택지 입니다. 다시입력해 주세요.");
		}
		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
