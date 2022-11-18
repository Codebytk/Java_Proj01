package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 2차 정방형 배열
		
		//
		int [][] arr1 = new int [5][100];		//5는 행의 갯수 //100은 열의 갯수
		
		System.out.println(arr1.length);     //행의 갯수
		System.out.println(arr1[0].length);	 // 0번 행의 열의 갯수 
		
		//2차원 배열의 값넣기 2중 for 문 사용
		
		int a=0;
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; a++) {
				arr1[i][j]=a+1;
				j++;
			}
		
		}
		
	//인풋된 배열의 값을 출력
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}System.out.println("=========================");
		//enhertfaad for 문을 사용해서 출력
		for (int[] k :arr1) { //arr1의 루프를 돌면서 행을꺼내와서 k변수에 할당.
			for(int b:k) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		//Arrays.toStrring() 일차원 배열
			//arr1 이차원 배열
		for (int []k : arr1) {
			System.out.println(Arrays.toString(k));
		}
	
	
	
	
	}

}
