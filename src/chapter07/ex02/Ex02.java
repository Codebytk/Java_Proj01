package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <완료시간 : 3:45분 까지
		
		// 두 배열의 각방의 내용을 더해서 출력하는 메소드 생성
		int i;
		int k;
		// 배열 a: 4의 배수를 1 ~ 300까지
		int [] a=addArray(300,4);
		for(i=0, k=4; i<a.length; i++,k+=4) {
			a[i]=k;
		}
		// 배열 b: 5의 배수를 1~300 까지 저장 
		int [] b= addArray(300,5);
		for(i=0, k=5; i<b.length; i++,k+=5) {
			b[i]=k;
		}
		
		
		//두 배열의 각방의 값을 더해서 출력
		int [] c= addArray2(a,b);
		for(i=0; i<75; i++) {
			if(i>=60) {
				c[i]=0;
			}else if(i<60) {
			c[i]=a[i]+b[i];
			}
		}
		
		
		
	}
			//두개의 각방의 값을 더해서 출력
	// addArray(int[]a,int []b){
		
	// }
	public static int[] addArray(int a, int b){
		int [] c=new int [a/b];
		for (int i=0, j=1; i<c.length; j++) {  //j 배수를 저장하는 변수
			if(j%b==0) {
				c[i]=j;
				System.out.print(c[i]+" ");
				i++;
				}
			}
		System.out.println();
		return c;
			
	
	}
	public static int [] addArray2(int [] a ,int[] b) {
		int j;
		int i;
		int[] c=new int [75];
		for(i=0,j=0; i<75; i++,j++) {
			if(i>=60) {
				c[i]=0;
				System.out.print(c[i]+" ");
			}else if(i<60) {
			c[i]=a[j]+b[j];
			System.out.print(c[j]+" ");
			}
		}return c;
		
	}
	
}



