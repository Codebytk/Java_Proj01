package chapter09.ex03;

import java.net.MulticastSocket;

class D{
	int a;		//인스턴스 필드
	static int b; // 정적 필드
	
	static { //클라스가 jvm에 로드 될떄 작동, 객체 생성 전에 작동 \, <===생산자와 같은 역할
		b=5;
		System.out.println("클래스 a 가 ");
		
	}
	D(){
		a=10;
	}
	
	
	
	
}

public class Static_initial_block {

	public static void main(String[] args) {
		// static 필드에 초기값 셋팅 :static (초기값 할당) <==객체를 생성하기 전에 로드됨
		// 인스턴시 필드의 초기값셋팅 : 객체를 생성할때 1.생성자를 통해서, 2. setter를통해서 할당.
		
		System.out.println(D.b);
		D d=new D();
		
		
		
	}

}
