package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다
		// 변수 이름 지정 하기
		// - 변수명은 소문자로 시작(권고), 클래스 이름은 대문자로 시작 (필수)
		// - 변수명으로 한글을 사용할 수 있다.(권장하진 않는다)
		// - 변수명으로 특수문자는 _,$ 만 사용가능
		// - 변수는 숫자로 사용가능하다
		// - 변수명으로 자바에서 사용하는 예약어(package, class, public....)
		
		
		//자료형 변수명
		boolean aBcD;   // boolean : TRUE, FALSE 에 넣을 수 있다
		aBcD = true;
		aBcD = false;
	//  aBcD = 10;    오류발생
		byte 가나다라;  //1bite 의 데이터만 저장가능
		short _abcd;   //_,$를 사용할 수 있다.+
	//	boolean %_abcd  //
	//	boolean %abcde;  //_,$이외의 특수문자는 변수로 사용 불가능
		char a3bcd;       //
		long abcd3;
		// double int ;     // 자바에서 사용되는 예약어는 사용할수 없다.
		// int my work;    // 변수명으로 공백은 채울수 없다
		int myWork;       // 변수명은 처음자는 소문자, 이어서 여러단어를 적용할때 첫자 소문자 그다음 단어 대문자로 작성
		String myClassName;   //권장 사항
		
		// 상수 : 값을 넣으면 그 값을 변화 하지 못하도록 설정
		    // 변수자료형 앞에 final 키가 붙으면 상수
		   // - 상수명은 전체를 대문자로 지정 (권장사항)
		
		double PI = 3.141592 ;		// 변수 :PI변수의 값을 변화시킬수 있다.
		System.out.println(PI); //3.141592
		PI = 123.456;
		System.out.println(PI); //123.456
		
		
		final double PI2 = 3.141592;   //상수 :값을 넣으면 수정불가능
		System.out.println(PI2);
		// PI2 =123.456;    //상수이므로 다른 값을 넣을수 없다.
		
		final int MY_DATE = 10;
		final float my_Date;    // 권고사항 위배
		
		
		
		
	}

}
