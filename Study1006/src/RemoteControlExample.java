
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
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)--------------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)--------------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
		
	
		
		
	}

}









	                     


