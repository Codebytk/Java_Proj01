package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스케너로 배열의 방번호를 인풋 받습니다.
		//배열 변수 : arr1, 2의 배수를 저장후 출력 ,enhanced for 문을 사용해서 출력
		//배열 변수 : arr2, 3의 배수를 인풋받아서 출력, for 문을 사용해서 출력
		//arr1.length
		
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr1, arr2;
		
		int a; //할당받는 방번호
		System.out.println("방 번호를 입력해주세요");
		a=sc.nextInt();
		arr1=new int[a];
		for( int i = 0,j=1; i<a; i++, j++) {
			arr1[i]=j*2;
		}
		arr2=new int[a];
		for(int i=0,j=1; i<a; i++,j++) {
			arr2 [i]=j*3;
		}
		for(int k:arr1) {
			System.out.print(k+ " ");
		}
		System.out.println();
		for(int k:arr2) {
			System.out.print(k+" ");
		}
		
		
	}
	
		

	}


