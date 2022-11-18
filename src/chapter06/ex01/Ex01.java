package chapter06.ex01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Man{
	// 필드
	String name = "홍길동";
	int age = 30 ;
	String phone = "010-1111-1234";
	String Addr= "서울 종로구 인사동";
	double weight=70.5;
	
	//기본 생성자는 생략됨 a(){}
	
	
	//메소드:
	void add1() {
		//1~100 까지 2의 배수를 출력하고 더한 값을 출력
		System.out.println("1~100 까지 2의 배수를 출력하고 더한 값을 출력");
		int p = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
			System.out.print(i+" ");
			p+=i;
			}
		}System.out.println();
		System.out.println("더한값 : "+p);
	
	
	}
	void add2() {
		// 1~500까지 3의 배수와 4의 배수를 출력하고 더한값을 출력
		System.out.println("1~500까지 3의 배수와 4의 배수를 출력하고 더한값을 출력");
		int p=0;
		for (int i=1; i<=500; i++) {
			if(i%3==0||i%4==0) {
				p+=i;
				System.out.print(i+" ");
			}
		}System.out.println();
	System.out.println("더한값 : " + p);
	
	}
	void add3() {
		//1~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		System.out.println("1~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력");
		int p=0;
		for (int i=1; i<=1000; i++) {
			if(i%4!=0) {
				p+=i;
				System.out.print(i+" ");
				}
		}
		System.out.println();
		System.out.println("더한값 : "+p);
	
	}
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		Man aa = new Man();
		aa.add1();
		aa.add2();
		aa.add3();
		
		
		
		
		
		
		
		
		
		
		
	}
}
