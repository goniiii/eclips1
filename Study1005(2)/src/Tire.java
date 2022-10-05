
public class Tire {

	public int maxRotation;				//최대회전수(최대수명)
	public int accumulatedRotation;		//누적회전수
	public String location;				//타이어위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;  // 1바퀴 더 굴렀다 라는 의미로 ++ 
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
