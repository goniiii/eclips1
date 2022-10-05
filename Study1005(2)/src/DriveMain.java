
public class DriveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();  // vehicle 자체가 넘어온경우 
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(vehicle);
	}
}

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
//	public void startMeter() {
//		System.out.println("기본은 미터기가 없습니다.");  // 여기 함수추가해주면 빨간줄은 안뜬다 
//	}
}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {
			Bus tempBus = (Bus)vehicle;
			tempBus.tagCard();
		}
		if(vehicle instanceof Taxi) {
			Taxi tempTaxi = (Taxi)vehicle;
			tempTaxi.startMeter();
		}
//		Taxi tempTaxi = (Taxi)vehicle;
//		((Taxi)vehicle).startMeter();
//		vehicle.startMeter();  // 여기서 startMeter를 부를 수 없다 vehicle안에 startMeter가 없어서
//		tempTaxi.startMeter();  //강제로 택시타입으로 바꾸려니까 수행이 안됨
	}
	
	//택시가 넘어오면 startMeter를 하고싶고 버스가 넘어오면 tagCard가 하고싶다. 
	
}    


class Bus extends Vehicle{
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void tagCard() {
		System.out.println("교통카드 찍었습니다.");
	}
}

class Taxi extends Vehicle{
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	public void startMeter() {
		System.out.println("요금 미터기 시작합니다.");
	}
}




