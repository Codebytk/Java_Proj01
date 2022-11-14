package my.ex02;

import java.util.Scanner;

public class My02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("1.2진법 변환 |2. 8진법 변환 |3. 16진법변환 ");
		System.out.println("====================================");
		System.out.println("이중 하나를 선택해서 10진법 숫자로 입력해주세요");
		int c, a, d, e;
		c=sc.nextInt();
		if(c==1) {
			System.out.println("2진법으로 변환해 드립니다.\n 아무숫자난 입력해주세요");
		a = sc.nextInt();
		String b=Integer.toBinaryString(a);
		System.out.println(b);
		}else if (c==2) {
			System.out.println("8진법으로 변환해 드립니다.\n 아무숫자나 입력해주세요");
			d=sc.nextInt();
			String u=Integer.toOctalString(d);
			System.out.println(u);
		}else if(c==3) {
			System.out.println("16진법으로 변환해 드립니다.\n 아무 숫자나 입력해 주세요");
			e=sc.nextInt();
			String f=Integer.toHexString(e);
			System.out.println(f);
		}

		System.out.println("==================================");
		System.out.println("비밀번호를 입력 해주세요");
		System.out.println("==================================");
		String b, v;
		b=sc.next();
		System.out.println("다시 한번 더 입력해주세요");
		v=sc.next();
		System.out.println(b.equals(v) ? "맞습니다.":"다시 입력해주세요" );
	
	 
	
	
	
	
	}

}
