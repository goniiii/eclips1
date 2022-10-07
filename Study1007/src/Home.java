import java.util.ArrayList;
import java.util.List;

public class Home {
	// 집	
	// 내부 가구, 가전
	List<ElcApp> elcApps;
//	List<ElcApp> elcApps = new ArrayList<ElcApp>();       
	String address; // 집주소
	String owner; 	// 집주인이름
	
	// 가전 - 스마트홈 (중앙제어)
//	SmartHomeMachine shMachine = new SmartHomeMachine();
	SmartHomeMachine shMachine ;
	
	public Home(String address, String owner) {
		//홈생성자
		elcApps = new ArrayList<ElcApp>(); 
		this.address = address;
		this.owner = owner;
		shMachine = new SmartHomeMachine();
	}
	
	public void addElcApp(ElcApp elcApp) {
		elcApps.add(elcApp);
	}
	
	public void showElcAppList() {
		for(ElcApp ea : elcApps) {
			System.out.println(ea.toString());
		}
	}

	
}
