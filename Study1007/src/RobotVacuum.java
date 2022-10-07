
public class RobotVacuum extends ElcApp{

	public RobotVacuum(String kind, String name, int volt) {
		super(kind, name, volt);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("종류:%s 이름:%s 전압:%d ", kind, name, volt);
	}
}
