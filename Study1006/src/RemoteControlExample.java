
public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc = new Audio();
		rc.turnOn();
		
		rc = new SmartTelevision();
		Searchable searchable = new SmartTelevision(); // smartTelevision에 implement해서 둘다 들어가있으니까 두 타입에 다 담을 수 있다 
		
		//MyClassExample.java 안에 있는 main 코드는 
		
		//이 밑에... main 하나만...
		
		System.out.println();
		
		System.out.println("1)--------------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)--------------------------");
		
		MyClass myClass2 = new MyClass(new Audio()); // 생성자를 아무것도 없는걸로 부르면 시작 기본값 Television이 되고 
												     // 매개변수로 Audio가 왔다하면 아무것도 없는애가 불리는게 아니라 매개변수 하나 있는 MyClass(RemoteControl)애가 불린다
													 // Audio가 저장된채로 turnOn과 setVolume이 불리면  ? 
		
		myClass2.rc.showId(); // 원래 기본값도 텔레비전인데 굳이 rc에 텔리비전을 넣어야하나 ? 필요함 -> 다른텔레비전일수있어서 
		Television myTv = new Television();
		myTv.id = 30;
		// 어떤 텔레비전이 들어올 지 모르니까 new Televison하면 새로운 텔레비전이고 별도의 객체 같은 텔레비전이라도 
		
		
		System.out.println("3)--------------------------");
		
		MyClass myClass3 = new MyClass(); //설정안하면 Television이 기본값으로 들어가있음
		myClass3.methodA();
		myClass3.rc.turnOn(); //TV를 켭니다가 출력 rc에 Television이 담겨있어서 
		
		
		System.out.println("4)--------------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());		// 얘도 매개변수가 있는 애가 불렸을건데 단지 매개변수가 텔레비전인것 그렇다고 같은 텔레비전은 아님!? ?? 
//		myClass4.methodB(new Audio()); audio객체를 새로 만들어서 출력해도 가능 
		
		
		
	
		
		
	}

}









	                     


