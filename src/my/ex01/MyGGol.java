package my.ex01;

import java.util.Arrays;

abstract class A {

	final int X = 4;

	A() {
	}

	abstract void Thard();

	abstract void Five();

	abstract void Fiveorsix();

	abstract void multi();
}

class B extends A {
	int[] arr1;

	B() {
	}

	@Override
	void Thard() {
		arr1 = new int[100 / 3];
		for (int i = 0; i < arr1.length;) {
			for (int j = 1; j <= 100; j++) {
				if (j % 3 == 0) {
					arr1[i] = j;
					System.out.print(arr1[i] + " ");
					i++;
				}
			}
		}

	}

	@Override
	void Five() {
		arr1 = new int[100 / 5];
		for (int i = 0; i < arr1.length;) {
			for (int j = 1; j <= 100; j++) {
				if (j % 5 == 0) {
					arr1[i] = j;
					System.out.print(arr1[i] + " ");
					i++;
				}
			}
		}

	}

	@Override
	void Fiveorsix() {
		arr1 = new int[33];
		for (int i = 0; i < 33;) {
			for (int j = 1; j <= 100; j++) {
				if (j % 5 == 0 || j % 6 == 0) {
					arr1[i] = j;
					System.out.print(arr1[i] + " ");
					i++;
				}
			}
		}

	}

	@Override
	void multi() {

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] * super.X;
		}
		System.out.println(Arrays.toString(arr1));
	}

}

public class MyGGol {

	public static void main(String[] args) {
		// 추상클래스로 A클래스 생성후
		// 자식 클래스 1개 생성
		// 값을 고정하는 정수 1개선언
		// 추상클래서의 생성자를 생성후
		// 그 및에 자식클래스1에 3의 배수 자식클래스2애 5의 배수 100
		// 3에 5와 6의 배수 를 출력한후 고정된 정수를 곱해서 출력 100
		A a1 = new B();
		a1.Thard();
		System.out.println();
		a1.multi();
		a1.Five();
		System.out.println();
		a1.multi();
		a1.Fiveorsix();
		final int aa = 4;
		System.out.println();
		a1.multi();

	}

}
