package chapter07.ex04;

// 생성자 로버 로딩 : 생성자 호출시 시그니처에 따라서 다른 생성자를 호출
	// 시그니쳐(매개변수의 갯수, 데이터 타입)

class Ab{
	//필드 : 인스턴스 필드 : 객체를 생성후 호출
	int m;
	int n;
	int l;
	int k;
	
	//생성자 :
	Ab(){
		System.out.println(" 매개변수 정수0개인생성자 "+ m+ " " + n +" "+l );
	}		//기본생성지
	
	Ab(int m){		//매게변수 정수 1
		this.m=m;
		System.out.println(" 매개변수 정수배개변수 정수가 1개인  "+this.m+" "+n+" " +l);
	}
	Ab(int m, int n ){
		this.m=m;
		this.n=n;
		System.out.println(" 매개변수 정수배개변수 정수가 1개인  "+this.m+" "+this.n+" "+l);
	}
	Ab(int m, int n , int l){
		this.m=m;
		this.n=n;
		this.l=l;
		System.out.println(" 매개변수 정수배개변수 정수가 1개인  "+this.m+" "+this.n+" "+ this.l);
}
}
public class Connstrucktor {

	public static void main(String[] args) {
		// 1. 기본생성자 호출
		Ab ab=new Ab();
		
		//2. 매게변수 1개인 생성자 호출
		Ab ab1=new Ab(5);
		
		Ab ab2=new Ab(5,6);
		
	
	}
}
