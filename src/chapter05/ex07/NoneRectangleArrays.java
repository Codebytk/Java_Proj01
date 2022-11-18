package chapter05.ex07;

import java.net.MulticastSocket;

public class NoneRectangleArrays {

	public static void main(String[] args) {
		// 비 정방형 배열 횡에 대해서 열의 갯수가 각각 다른 출력
		// 정방형 배열	모든 횡에 대해서 동일한 열을 가지고 있는것

		
		//1. 비정방형 배열 선언 :초기배열 선언시 행의 개수만 정의하고 열의 갯수는 나중에 정의
		
		int [][]arr1=new int[2][]; // 행의 갯수 만 선언
		
		arr1[0]=new int [2];
			arr1[0][0]=1;
			arr1[0][1]=2;
		arr1[1] = new int [3];
		arr1[1][0]=2;
		arr1[1][1]=2;
		arr1[1][2]=2;
		//arr1[1][3]=2;	 없기때문에 오류
			
			
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
