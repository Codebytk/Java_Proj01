package chapter07.ex02;

import java.util.Arrays;

import chapter07.ex01.InernalCallMethod;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매게변수로 배열을 Argument로 인풋
		
		// 1~100 까지 3의 배수의 배열을 생성후 메소드 호출,정수 5호출
		int a =5;
		int []arr1=new int [100];
		int k,i;
		for (i=1,k=0; i<arr1.length; i++) {
			if(i%3==0) {
				arr1[k]=i;
				k++;
			}
			
		}
		
		printArray(a,arr1);
		//1~ 100까지 7의 배수 배열 생성후 , 정수 2
		int c=2;
		int []arr2=new int [100];
		for (int l=1,j=0; l<arr2.length; l++) {
			if(l%7==0) {
				arr2[j]=l;
				j++;
			}
		}
		
		printArray(c,arr2);
		
		
		System.out.println("1부터 200 까지 9의 배수만 저장후 출력");
		int [] f=MultiArray(200,9);
		System.out.println("===200까지 9의배수 출력");
		for (int h=0, y=1; h<f.length; h++) {
			
		}
		
		
	}
	
	//메소드: static , 매개변수로 정수 1, 배열 1개를 인풋받아서 
	//각방의 배열의 값을 인풋받은 정수로 곱해서 출력 하는 배열
	public static void printArray(int a,int []arr){
		for (int i=0; i<arr.length; i++) {
			System.out.print(a*arr[i]+" ");
		}
		System.out.println();
	}

		//방의 갯수에 따라 배수를 저장하는 배열을 리턴 시켜주는 매소드
		//maxcount : 100까지
		//multi : 배수를 저장하는 변수
		public static int[] MultiArray(int maxCount, int multi) {
			int [] z=new int[maxCount/multi];
			for (int i=0, j=1; i<z.length; j++) {  //j 배수를 저장하는 변수
				if(j%multi==0) {
					z[i]=j;
					i++;
				}
			}
			return z;
		}
		
	
	
	
}
