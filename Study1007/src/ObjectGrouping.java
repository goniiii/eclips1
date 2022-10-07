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
//			if(i == 2) {	// 조건 걸어주면 오류안남 
//				temp.bomb(); 부를 수 없다. 인식 못함 인터페이스에 들어있지 않음. 인터페이스에 넣으면 새도 헬기도 폭발함, 실제로 폭발해야하는 로켓한테만 넣은 것 
//				Rocket rk = (Rocket) temp; 
//				rk.bomb();
				// 이것도 문제의 소지 있음 배열에 2인덱스가 뭔지 아니까 가능한건데 2인덱스에 헬리콥터가 들어가면 오류가 남 헬리콥터를 로켓으로 변환할수 없다는 오류
				// 그래서 이럴때 쓰는게 instanceof 
//			}
			
			if(temp instanceof Rocket) {	// 이렇게 하면 알아서 구분 해준다. instance가 맞는지를 비교하는 것 
				Rocket rk = (Rocket)temp;
				rk.bomb();
			}

//			temp.bomb(); 
			// 불릴 수 없다 Flyable 타입으로 돼있어서 인식못함 > 로켓타입으로 바꿔서 부르면된다?>
			
//			Rocket rk = (Rocket) temp; // 로켓타입으로 강제변환
//			rk.bomb();// 빨간줄 안뜨지만 수행하면 오류 cannot be cast
		}
	}
}

//상속, 인터페이스
//is-a,has-a
//공통분모가 있는 애들을 만들기
//특정 기능을 수행할 수 있는 애들인가 

// 여기서는 셋 다 날 수 있다는 기준

//원래 문제 인터페이스기반

interface Flyable {
	public void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {

		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");

	}

}

class Helicopter implements Flyable {

	@Override
	public void fly() {

		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
	}

}

class Rocket implements Flyable {

	@Override
	public void fly() {

		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
	}

	public void bomb() {
		System.out.println("로켓이 폭발합니다.");
	}// 로켓인 경우 폭발까지 수행하고싶다

}

//abstract class로 결과가 똑같이 나오게 바꿔보기 
//abstract class Flyable{
//
//	public abstract void fly();
//	// 밑에 꼭  fly라는 메소드를 구현해야 오류 안남 
//	
//}
//
//class Bird extends Flyable{
//
//	@Override
//	public void fly() {
//		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
//		// 재정의
//	}
//	
//}
//
//class Helicopter extends Flyable{
//	@Override
//	public void fly() {
//		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
//		
//	}
//}
//
//class Rocket extends Flyable{
//	@Override
//	public void fly() {
//		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
//		
//	}
//}