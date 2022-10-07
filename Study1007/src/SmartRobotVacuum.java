
public class SmartRobotVacuum extends RobotVacuum implements SmartConnectable {
	public SmartRobotVacuum(String kind, String name, int volt) {
		super(kind, name, volt);
		// TODO Auto-generated constructor stub
	}

	boolean isConnected;

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		isConnected = SmartConnectable.SMART_CONNECTED;
		return isConnected;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스마트 로봇 청소기 작동");
	}

}
