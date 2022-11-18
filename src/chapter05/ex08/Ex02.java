package chapter05.ex08;

public class Ex02 {

	public static void main(String[] args) {
		// main method 의 배열변수 args 로 실수 값을 넣어 계산하기
		// args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
			//문자열로 실수를 실수형을 변환
		String s=args[0];
		int i=1;
		double sum=0;
		for (i=1; i<args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		
		System.out.printf("합계는 : %4.2f", sum);
	}

}
