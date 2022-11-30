package chapter14.ex03;

public class Multi_Catch01 {

	public static void main(String[] args) {
		// 여러 예외가 동시에 발생 된 경우 처리
		
		
		
		
		
		try {
			System.out.println(3/0);	//실행시 예외 발생 (Arithmetic Exception)
		}catch(ArithmeticException e){
			System.out.println("숫자 0으로 나눌수 없습니다.");
		}finally {
			System.out.println("첫번쨰 프로그램 실행 종료");
		}
		try {
			int num = Integer.parseInt("10a");	// 실행시 예외발생 (NumberFormatException)
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		}finally {
			System.out.println("두번째 프로그램 종료");
			System.out.println("========================");
		}
		
		
		System.out.println("==============두번째 방법========================");
		try {
			System.out.println(3/0);
			int num2 = Integer.parseInt("10a");
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로 나눌수 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		}finally {
			System.out.println("세번 째 프로그램 종료");
		}
		
		System.out.println("==============세번쨰 방법============================");
		//3 . 하나의 try - catch 에서 한번에 처리
		try {
		System.out.println(3/0);		//실행시 예외 발생 (Arithmetic Exception)
		int num2 = Integer.parseInt("10a");		// 실행시 예외발생 (NumberFormatException)
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("두개의 예외가 한꺼번에 발생되었습니다.");
		}finally {
			System.out.println("세번째 프로그램 종료");
		}
		

	}

}
