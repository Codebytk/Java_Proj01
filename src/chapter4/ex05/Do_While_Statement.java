package chapter4.ex05;

public class Do_While_Statement {

	public static void main(String[] args) {
		// do~while문:실행문을 조건과 상관없이 1번은 실행 시킨후 조건에 따라 반복
		// while 문: 조건에 만족해야지만 실행 블락을 실행한다.
		
		/* while문:
		   초기식;
		   while(조건){
		   	실행블락;
		   	증감식;
		   	}
		 */
		/*
		  초기식;
		  do{
		  	실행블락;
		  	증감식;
		  }while (조건);
		 */

		//1. while 문
		System.out.println("===while문 =========");
		int a=0;
		while (a<0) {
			System.out.println(a+" ");
		}
		
		//2. do while 문
		System.out.println("===do while 문===");
		a=0;
		do {
			System.out.println(a+" ");		// 조건과 상관없이 실행문을 반드시 1변은 실행됨
			a++;
		}while (a<0);
		
		
		//3.반복 횟수가 10번인 경우 while문과 do while 문 비교
		System.out.println("==while 문을 사용해서 10번 출력");
		a=0;
		while (a<10) {
			System.out.print(a+ " ");
			a ++;
		}
		System.out.println();
		
		System.out.println("====do while 문을 사용해서 10번 출력");
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
			}while(a<10);
		System.out.println();
		
		
		
		
	}

}
