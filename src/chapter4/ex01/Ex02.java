package chapter4.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//<<<스케너에서 번호를 입력받아서 아래 내용을 작동시키는 프로그램을 작성해주세요
		// IF 문을 사용
		//<<완료시간:3시20분까지 작성>>
		Scanner sc=new Scanner(System.in);
		int select,a,b,eng,kor,math;   //프로그램을 선택

		String aName,bName;
		String c,d;
		
		
		System.out.println("=========================================");
		System.out.println("1.학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름식별 ");
		System.out.println("=========================================");
		System.out.println("위의 번호를 선택하세요.>>>");
		a=sc.nextInt();
		if (a==1) {
			System.out.println("1.학점의 합계/평균");
			System.out.println("국어점수를 입력해주세요.");
			kor = sc.nextInt();
			System.out.println("수학점수를 입력해세요.");
			math = sc.nextInt();
			System.out.println("영어점수를 입력해 주세요.");
			eng = sc.nextInt();
			System.out.println("당신의 점수 합계입니다.");
			int sum = (kor+eng+math);
			System.out.println(sum);
			System.out.println("당신의 평균 점수입니다");
			double avg = sum/3.0;
			System.out.println(avg);
		}else if (a==2) {
			System.out.println("홀수와 짝수를 구분해 드립니다.\n 아무숫자 하나를 입력하세요");
			b= sc.nextInt();
			c= ((b%2)==0) ? "짝수입니다." : "홀수입니다." ;
			System.out.println("당신이 고른 숫자는"+c);
		}else if (a==3) {
			System.out.println("3. 같은 이름 식별\n 생각나는 이름 하나를 적어주세요");
			aName=sc.next();
			System.out.println("다음 이름을 작성해 주세요");
			bName=sc.next();
			d= (aName.equals(bName)) ? "같은 이름입니다":"다른 이름입니다.";
			System.out.println(d);
			
		}
				
		
		
		

	}

}
