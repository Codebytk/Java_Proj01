package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성, 메소드 호출 : main method 에서 호출
		
		// sum1,sum2 객체 생성 없이 바로 호출: static 메소드
		int ab = sum1(11,22,33);
		System.out.println(ab);
		
		System.out.println(sum2(11.0,22.0,33.0));
		
		Ex01 e1=new Ex01() ;
		String cd=e1.prod ("제품 이름, ","제품 수량, ", "제품가격");
		System.out.println(cd);

	}
	
	//정수값 3개르 인풋받아 더한값으로 리턴하는 메소드(static)
	public static int sum1 (int a,int b,int c) {
		return a+b+c;
	}
	//실수 3개를 인풋받아 더한값으로 리턴하는 메소드(스테틱)
	public static double sum2(double aa, double bb, double cc) {
		return aa+bb+cc;
	}
	
	
	//문자열을 연결해서 출력하는 메소드(인스턴스 메소드 static 을 사용하지 않는 메소드
	//"제품이름 ", "제품수량", "제품 가격"
	// 객체를 생성해서
	
	public String prod(String aaa, String bbb, String ccc) {
		return aaa+bbb+ccc;
		
	}
	
	
	

}
