public class ObjectGrouping {
	public static void main(String[] args) {
// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };

// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
		}
	}
}

//상속, 인터페이스
//is-a,has-a
//공통분모가 있는 애들을 만들기
//특정 기능을 수행할 수 있는 애들인가 

// 여기서는 셋 다 날 수 있다는 기준

//abstrac class로 결과가 똑같이 나오게 바꿔보기 
abstract class Flyable{

	public abstract void fly();
	
}

class Bird extends Flyable{

	@Override
	public void fly() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
		
	}
	
}

class Helicopter extends Flyable{
	@Override
	public void fly() {
		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
		
	}
}

class Rocket extends Flyable{
	@Override
	public void fly() {
		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
		
	}
}

//원래 문제 인터페이스기반

//interface Flyable {
//	public void fly();
//}
//
//class Bird implements Flyable {
//
//	@Override
//	public void fly() {
//
//		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
//
//	}
//
//}
//
//class Helicopter implements Flyable {
//
//	@Override
//	public void fly() {
//
//		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
//	}
//
//}
//
//class Rocket implements Flyable {
//
//	@Override
//	public void fly() {
//
//		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
//	}
//
//}