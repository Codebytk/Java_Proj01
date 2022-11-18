package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {
	
	public static void main(String[] args) {
		//문제
		/*
		 2차원 배열 변수 : arr1
		 arr1[0] <===2의 배수만 저장
		 arr1[1] <===5의 배수만 저장
		 arr1[2] <===3의 배수와 8의배수를 저장
		 arr1[3] <===1부터 시작해서 1씩증가하는데 7의 배수는 저장하지 도록 저장
		 
		 행의 갯수 : 4
		 열의 갯수 : 100
		 1. for 문으로 출력 2. Enhanced for, 3. Arrays.to String()
		 */
		
		int [][] arr1=new int [4][100];
		for(int i=0; i<arr1.length; i++) {
			if(i==0) {
				for(int j=0, k=1; j<arr1[i].length; k++) {
					if(k%2==0) {	
					arr1[i][j]=k;
						j++;
					}
				}
			}else if(i==1) {
				for(int j=0,k=1; j<arr1[i].length; k++) {
					if(k%5==0) {
					arr1[i][j]=k;
						j++;
					
					}
				}
			}else if(i==2) {
				for(int j=0, k=1; j<arr1[i].length ; k++) {
					if(k%3==0 || k%8==0) {
						arr1[i][j]=k;
						j++;
					}else {
						continue;
					}
				}
			}else if(i==3) {
				for(int j=0, k=1; j<arr1[i].length ; k++) {
					if(k%7!=0) {
						arr1[i][j]=k;
						j++;
					}else {
						continue;
					}
				}
			}
		
	
}
		
		//for 문으로 출력
		System.out.println("====for 문으로 출력====");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			
			}
			System.out.println();
		}
		System.out.println("상향된 fot 문=====");
		for(int[] arr2:arr1) {
			for(int k:arr2) {	
			System.out.print(k+" ");
			}
			System.out.println();
		}
	
		System.out.println("Arrays.toString()======");
		
		for (int [] arr3:arr1) {
		
		System.out.print(Arrays.toString(arr3));
		}
		System.out.println();
	
	
	}
}	
		
	



