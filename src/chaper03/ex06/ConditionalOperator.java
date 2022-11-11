package chaper03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자
			// 형식:(조건)? 참:거짓 ;   (조건) 참이면 ?뒤의 <<참>>을 실행 ,(조건) 거짓이면 ?뒤에 <거짓>
		
		int value1 = (3>5) ? 6:9;  //(조건) 이 false 이므로 9가 value1에 들어감
		
		System.out.println(value1);  //9
		
		int value2 = (3<5) ? 6:9; // 조건이 참이므로 6이 value2에 들어감
		System.out.println(value2); //6
		
		
		//<문제> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수 이면 "홀수 라고 출력하고
		//		//인풋받은 값이 짝수 이면 짝수라고 출력
		
		
		
		
	}

}
