public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;


	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}


	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("TV를 켭니다.");
	}


	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");	
	}


	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
			if (volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨: " + this.volume);
		}


	@Override
	public void showId() {
		// TODO Auto-generated method stub
		
	}
		
	}
	