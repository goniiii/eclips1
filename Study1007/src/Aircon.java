
public class Aircon extends ElcApp { // 구형에어컨
	 int windLevel;	//바람세기
	 String ventEx; //실외기 
	                                                      
	public Aircon(String kind, String name, int volt) {	// 부모생성자를 먼저 부르고 자식생성자가 호출됨
		super(kind, name, volt);
		windLevel =0;
		ventEx = "캐리어 실외기";
	}
	
	public String toString() {
		return String.format("종류:%s 이름:%s 전압:%d 바람세기:%d 실외기:%s", kind, name, volt,windLevel,ventEx);
	}

}
