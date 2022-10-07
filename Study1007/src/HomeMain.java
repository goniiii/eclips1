
public class HomeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home myHome = new Home("대흥동 306번지", "홍길동");

//		Aircon air = new Aircon("거실가전","에어컨",220) 변수에 담았다가 하느냐 아니냐만 다르고 같다 
//		myHome.addElcApp(air);		

		myHome.addElcApp(new Aircon("거실가전", "에어컨", 220));
		myHome.addElcApp(new BluetoothSpeaker("소형가전", "브리츠", 220));
		myHome.addElcApp(new RobotVacuum("스마트가전", "둥글이", 220));

		myHome.showElcAppList(); // 이 집에 있는 가전 리스트를 보고싶다. myHome 안에 구현해보기
		

		SmartAircon smAir = new SmartAircon("거실가전", "에어컨", 220);
		SmartBluetoothSpeaker smBs = new SmartBluetoothSpeaker("소형가전", "브리츠", 220);
		SmartRobotVacuum smRv = new SmartRobotVacuum("스마트가전", "둥글이", 220);
		
		myHome.shMachine.addMachine(smAir);
		myHome.shMachine.addMachine(smBs);
		myHome.shMachine.addMachine(smRv);
		
		myHome.shMachine.runMachine();
			
		
	}

}
