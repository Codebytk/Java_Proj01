package chapter05.ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 문제 배열 변수 :arr1, 배열의 방의 개수 : 500 개
		//배열 방에 3의 배수 또는 5의 배수를 저장
		// 출력 :1. for, 2. Enhanced For, 3. Arrats.toString()을 사용해서 출력
		
		//14:45
		int [] arr1=new int[500];
		int i=0;
		for (int a=0; a<3000; a++) {
			if(a%3==0||a%5==0) {
				arr1[i]=a;
				i++;
			}
			for( i = 0; i<100; i++) {
				System.out.print(arr1[i]+" ");
			}
			
		}
	
		
	}

}
