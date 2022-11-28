package chapter10.ex09;

class Car {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;

	Car() {
	}

	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	// getter

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본생성자, 인풋을 받는 생성자,
		// 2. getter, setter 생성
		// 3. toString() 재정의: 전체의 메모리 내용 출력

		// 4. 생성자를 통해서 값을 할당후 메모리의 전체 내용 출력
		// 5. setter 를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력
		// getter 를 사용해서 각필드의 내용을 출력
		System.out.println("===============================생성자를 통해서 값 할당====================");
		Car cc = new Car("키아", "흰색", 180, "k5");
		System.out.println(cc);
		System.out.println("================================타고싶은 차============================");
		Car cc1 = new Car();

		cc1.setCarName("현대자동차");
		cc1.setCarColor("검정색");
		cc1.setCarModel("그랜다이져");
		cc1.setMaxSpeed(180);

		System.out.println(cc1);
		System.out.println("====================================================================");

	}

}
