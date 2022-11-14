package chapter4.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// for 문 :조건이 true 동안
		//
		// for (초기값, 조건, 증간값){
		//		실행블럭}:조건이 트루일때만 반복하고 false 면 빠져나옴
		
		//1. for 문의 기본 구조 println
		int a;
		for (a=0; a<3; a++) {
			System.out.println(a);
		}			//0 1 2
		
		System.out.println("==============================");
				//변수를 블록박스에 선언
		
		for(int b=0; b<=100; b+=2) { //변수b 지역변수 블록 내에서만 사용 가능
			System.out.print(b + " ");
		}
		System.out.println("\n==============================");
		//int a 전역 변수라서 다시 사용불가
		for (a=0; a<20; a+=3) { //a는 전역변수 라서 int a로 다시 쓸수없다.
			System.out.print(a+" ");
		}System.out.println("\n==============================");
		
		for (int b=0; b<20; b+=4) {//위에 쓴 b 는 지역변수라서 다시쓸수 있다.
			System.out.print(b+ " ");  
		}
		System.out.println("\n==============================");
		
		for (int i=100; i>0; i-=3) {
			System.out.print(i +" ");
		}
		System.out.println("\n==============================");
		for (int i=1000; i>0; i -= 30) {
			System.out.print(i + " ");
			System.out.println();
		}
		for (int i = 0, j=0; i<100; i++, j++) {
			System.out.print(i + ","+ j+" ");
		}
		System.out.println("\n=======for문을 사용해서 1단 출력================");
		//문제 : i * j = 1단출력 
		//		1*1=1
		//		....
		//		1*9=9
		
		for(int i = 1, j = 1; j<10; j++) {
			System.out.println(i+"*"+j+"="+ i*j);
		}
		
		System.out.println("for 문을 사용해서 2단 출력");
		
		for(int i = 2, j = 1; j<10; j++) {
		System.out.println(i+"*"+j+"="+ i*j);
		}
		
	}

}
