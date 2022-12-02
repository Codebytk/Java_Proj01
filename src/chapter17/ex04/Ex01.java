package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개 정도 생성해서 ArrayList 에 저장후 객체를 출력시 필드의 값을 출력하도록 함.
//for , Enhanced For , 컬렉션 객체자체를 출력

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(String company,String carModel, String color,int maxSpeed){
		this.company=company;
		this.carModel=carModel;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}



public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Car> a1 = new ArrayList();
		Car c1 = new Car("현대","그랜져","흰색",190);
		Car c2 = new Car("KIA","K9","검은색",190);
		Car c3 = new Car("쌍용","쏘렌토","회색",150);
		Car c4 = new Car("르노삼성","sm7","검은색",170);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		System.out.println("==========for 문으로 출력===========");
		for(int i=0; i<a1.size(); i++) {
			Car cc1 = a1.get(i);
			System.out.println(cc1);
		}
		
		System.out.println("======Enhanced fro 문으로 출력=====");
		for(Car k : a1) {
			System.out.println(k);
		}
		
		System.out.println("=========있는 그대로 출력 ===========");
		System.out.println(a1);
	}

}
