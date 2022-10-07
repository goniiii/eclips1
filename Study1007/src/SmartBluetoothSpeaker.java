
public class SmartBluetoothSpeaker extends BluetoothSpeaker implements SmartConnectable {
	boolean isConnected;

	public SmartBluetoothSpeaker(String kind, String name, int volt) {
		super(kind, name, volt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
//		isConnected = SmartConnectable.SMART_CONNECTED;
		isConnected = SmartConnectable.SMART_DISCONNECTED;
		return isConnected;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스마트 블루투스 스피커 작동");
	}

}
