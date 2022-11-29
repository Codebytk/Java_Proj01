package my.ex01;

import java.util.Scanner;

interface Fruit{
	void taist();
	void popular();
	void valueable();
	
}

class Fruit1{
	void abc(Fruit a) {
		a.taist();
		a.popular();
		a.valueable();
	}
}

public class Ex001 {

	public static void main(String[] args) {
		Fruit1 f1 = new Fruit1();
		
		Fruit f2 = new Fruit(){
			@Override
			public void taist() {
				System.out.println("사과는 맛있습니다.");
			}
			@Override
			public void popular() {
				System.out.println("사과는 대중적으로 널리 알려져 있습니다.");
			}
			@Override
			public void valueable() {
				System.out.println("사과는 사람에게 가치있는 음식입니다.");
			}
		};
	
		f1.abc(f2);
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("과일 종류중 하나를 적어주세요");
		System.out.println("종료라고 입력하시면 종료됩니다.");
		String aa;
		
		aa=sc.next();
		Fruit f3 = new Fruit(){
			@Override
			public void taist() {
				System.out.println(aa+"는 맛있습니다.");
			}
			@Override
			public void popular() {
				System.out.println(aa+ "는 대중적으로 널리 알려져 있습니다.");
			}
			@Override
			public void valueable() {
				System.out.println(aa+"는 사람에게 가치있는 음식입니다.");
			}
		};
		if(aa.equals("종료")) {
			break;
		}else {
			f1.abc(f3);
		}
		}while(true);
	}

}
