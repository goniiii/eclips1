
public class ElcApp {	// 가전제품
	String kind;	//종류
	String name;	//이름
	int volt;     	//전압
	
	public ElcApp(String kind, String name, int volt){
		this.kind = kind;
		this.name = name;
		this.volt = volt;
	}
	
	public String toString() {	//toString 불렀을때 가전 정보 가져올 수 있음 
		return String.format("종류:%s 이름:%s 전압:%d", kind, name, volt);
	}
}
