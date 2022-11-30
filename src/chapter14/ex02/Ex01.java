package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 12:40
		//try catch - finallt 구문을 사용해서 예외 처리
		int [] arr = new int [] {1,2,3,4};
		
		
		//실행시 예외 발생 :
		
		try {
			
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행오류 발생");
		} finally {
			System.out.println("오류발생 상관없이 출력");
			System.out.println("프로그램 종료");
		}
		
		
	

	}

}
