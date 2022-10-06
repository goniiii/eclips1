
public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("홍길동");
		Phone phone = smartPhone; // 새로 만들지는 못해도 이건 가능

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}

abstract class Phone {
	public String owner; // 추상클래스 최소한의 필요한 뼈대는 있고 이걸로 뭘 만들수 없다
	public String deviceId; // 추상클래스 안에 해두면 ? 최소한의 공통된 지점을 가지고 개발 할 수 있다

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}

class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("인터넷검색을 합니다.");
	}
}
