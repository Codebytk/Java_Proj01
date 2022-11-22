package chapter07.ex3;

public class Ex01 {

	public static void main(String[] args) {
		// 가변길이 배열 문제
		/*
		 values [0] : 값이 정수 1~9이 들어왔을 떄에는 "파워레벨 1입니다." 
		 values [1] : 값이 정수 11~19이 들어 올떄 "스피드 레벨 1[9]입니다"
		 */
		arrayFlexable(7,15);

	}
	public static void arrayFlexable(int ... valeus) {
		if(0<valeus[0] && valeus[0]<10) {
			System.out.println("파워레벨 "+valeus[0]+ "입니다.");
		}else {
			System.out.println("잘못된 입력입니다.1~9까지의 숫자만 넣어주세요");
		}
		if(10<valeus[1] && valeus[1]<20) {
			System.out.println("스피드 레벨 "+(valeus[1]-10)+ "입니다.");
		}else {
			System.out.println("잘못된 입력입니다. 11~19 사이의 숫자를 넣어주세요");
		}
				
			
		
		
	

	}

}
