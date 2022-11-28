package chapter4.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 완료시간 13:20
		// if문을 사용해서
		// 스케너를 사용해서 가지고 있는 돈을 입금받습니다.
		// 0~3000 : 걸어서 다닙니다.
		// 3000~30000 : 지하철을 타고 다닙니다.
		// 30000~100000 : 택시를 타고 다닙니다.
		// 100000 ~ : 비행기를 타고 다닙니다.

		Scanner sc = new Scanner(System.in);

		int mony;
		System.out.println("현재 가지고 있는 돈을 입력해 주세요");
		mony = sc.nextInt();
		if (mony > 100000) {
			System.out.println("비행기를 타고 다닙니다.");
		} else if (30000 <= mony && mony <= 100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else if (3000 <= mony && mony <= 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		} else {
			System.out.println("걸어서 다닙니다.");
		}

	}

}
