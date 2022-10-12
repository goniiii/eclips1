
public class P2 {
	//필드변수
	private int a;	// private 붙이면 자기안에서만 접근 가능 ,main에서는 안보인다는 오류생김 
	private int b;
	
//	public void setAlpha(int x) {	// 변수가 private이라 main에서 접근안되니 메소드를 public으로 return 없으니 void 
//		this.a=x;					// main에서는 이 메소드를 통해서만 값에 접근
//	}
//	
//	public void setBeta(int x) {	//값을 쓰는 메소드, 값을 세팅하는 메소드 setter 
//		this.b=x;	//여기 x는 이 메소드 안에서만 
//	}
//	
//	public int getAlpha() {
//		return this.a;
//	}
//	
//	public int getBeta() {		//값을 읽어가는 메소드 , 하나의 필드변수당 2개의 메소드밖에 없다 ? 
//		return this.b;			//밖에서 이 멤버변수의 값을 가져가게 하는 메소드 getter
//	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	//메소드
//	int Plus(int a, int b) {	//이렇게 해도 되지만 
//		return a+b;
//	}
	int Plus() {
		return this.a + this.b;	// this 멤버변수를 가리키는 대명사 this. 붙이면 무조건 멤버변수가리킴
	}
	
	int Minus() {
		return a-b;
	}
	int Multi() {
		return a*b;
	}
	float Divide() {
		return a/b;
	}
}
