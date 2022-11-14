package chapter4.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//<문제> do while 문으로 무한루프를 돌립니다.
		//스케너에서 1을 넣으면 1. 평균출력  출력
		//스케너에서 2을 넣으면 2. 합계출력  출력
		//스케너에서 3을 넣으면 3. 이름출력  출력
		//4번을 넣으면 do while 빠져나오기
		Scanner sc=new Scanner(System.in);
		
		int a, q, kor,math,eng,sum,evg;
		String aName, bName;  
		do {
		System.out.println("==========================");
		System.out.println("1. 평균 출력|2. 합계출력 |3.이름출력 | 4. 프로그램 종료");
		System.out.println("==========================");
		System.out.println("위 번호를 선택하세요>>");
		a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("1평균갑 출력");
			System.out.println("국어점수 입력");
			kor=sc.nextInt();
			System.out.println("수학점수 입력");
			math=sc.nextInt();
			System.out.println("영어점수 입력");
			eng=sc.nextInt();
			evg=(kor+math+eng)/3;
			System.out.printf("당신의 평균은 %d 입니다.", evg);
			break;
		case 2:
			System.out.println("2. 합계출력");
			System.out.println("국어점수 입력");
			kor=sc.nextInt();
			System.out.println("수학점수 입력");
			math=sc.nextInt();
			System.out.println("영어점수 입력");
			eng=sc.nextInt();
			sum=kor+math+eng;
			System.out.println("당신의 점수의 합계는"+sum+" 입니다.");
			break;
		case 3:
			System.out.println("3.이름출력 ");
			aName=sc.next();
			System.out.println("한번더 입력해주세요");
			bName=sc.next();
			System.out.println(aName.equals(bName) ? "같은 이름입니다.": "다른이름입니다.");
			break;
		case 4:
			System.out.println("프로그램 이 종료됩니다.");
			System.out.println("다시합번 눌러주세요");
			a=sc.nextInt();
			break;
		default :
			System.out.println("없는 선택지입니다.");
			break;
		} }while (a!=4);
	
		
		
		
		
		
		
		
		
		
		
	}

}
