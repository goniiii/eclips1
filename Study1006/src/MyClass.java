
public class MyClass {
	
	RemoteControl rc = new Television();
	Searchable sa; // SmartTelevision() , Computer()
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){ 			// 넘어오면 turnOn과 setVolume을 하겠다 
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
//		rc = new Audio(); rc를 이렇게 만들면 ? methodA끝난뒤에 turnOn불르면 Audio가 불린다
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
