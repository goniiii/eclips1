import java.util.ArrayList;
import java.util.List;

public class SmartHomeMachine {
	// 스마트홈 메인 제어하는 기기 (서버)
	List<SmartConnectable> smartMachines = new ArrayList<SmartConnectable>();

	public void addMachine(SmartConnectable machine) {
		smartMachines.add(machine);
	}

	public void runMachine() {
		// 자기가 제어하는 스마트 기기들을 모두 연동해서 작동시킴.

		// 연결 -> 수행
		// (연결이 성공적으로 잘되면) -> 작동
		//

//		smartMachines.get(0) 이렇게 각각 접근 가능하지만 반복문으로 
//		smartMachines.get(1)
//		smartMachines.get(2)

		// 방법 1
//		for (int i = 0; i < smartMachines.size(); i++) {
//			SmartConnectable sc = smartMachines.get(i);
//			if (sc.connect() == SmartConnectable.SMART_CONNECTED) {
//				sc.run(); // 수행
//			}
//		}

		// 방법2
		for (SmartConnectable sc : smartMachines)
//			윗줄이 담는것까지 된 상태를 의미 
//			for(int i=0; i<smartMachines.size(); i++) {
//				SmartConnectable sc = smartMachines.get(i);
		{
//			if (sc instanceof SmartConnectable) {
				// 안전하게 instanceof로 한번 비교하고 한 경우도 있었는데 이미 SmartConnectable 애들을 담아놓은 거기때문에 
				// int가 int인지 확인하는것과 같다 그래서 효과 없음 
				if (sc.connect() == SmartConnectable.SMART_CONNECTED) {
					sc.run();
				}

			}
//		 }
		
		
		// 이렇게해도 결과는 같음
//		for (SmartConnectable sc : smartMachines) {
//			sc.connect();
//			sc.run();

		// 내가푼것
//		if(sc.connect()==sc.SMART_CONNECTED) {
//		sc.run();
//		}

	}
}
