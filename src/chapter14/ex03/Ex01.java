package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		//3 개의 예외를 하나의 try ~Catch 블락에 넣고 
			//각각 예외에 대해서 catch
			// 3개의 예외를 한꺼번에 처리
		
		
		
		
		try {
		System.out.println(3/0);
		
		int []arr = new int [] {1,2,3};
		System.out.println(arr[5]);
		
		int num = Integer.parseInt("20A");
		
		}catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방개수 부족");
		}catch(ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌수 없습니다.");
		}finally {
			System.out.println("각각의 catch 생성 후 출력");
		}
		
		
		System.out.println("==================================");
		
		
		try {
			System.out.println(3/0);
			
			int []arr = new int [] {1,2,3};
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("3개 오류 발생");
			System.out.println(); 		//예외의 간단한 정보를 출력
		}finally {
			System.out.println("한개의 try 한개의 catch 로 출력");
		}
	System.out.println("=======각각의 try 블락에서 처리==========");
	
	
	
	
	
	
	
	}
	

}
