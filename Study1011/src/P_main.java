import java.util.ArrayList;

public class P_main {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
//	P1 p1 = new P1();
//	
//	System.out.println(p1.getSum(5, 3));	// 정수2개 매개변수를 갖는 getSum이 실행됨
//	System.out.println(p1.getSum(2, 3, 4));
//	System.out.println(p1.getSum(3.14f, 1.72f));	// 실수 뒤에 f 붙여야 에러안남 
//	System.out.println(p1.getSum(5, 1.44));			정수와 실수를 매개변수로 받는 getSum  없어서 에러
	
//	int  i = 10;
//	int j= 5;
	
	P2 px = new P2();
//	px.a=10;	// 인스턴스 안의 변수에 집어넣음
	px.setA(10); 	// 이렇게만 접근가능 
//	px.b=5;			// 객체지향에서 이렇게 값을 직접적으로 넣는건 피해야함. 모든건 메소드를 통해서 
	px.setB(5);
	
	

	
	System.out.println(px.Plus());		// 변수에 집어 넣었기 때문에 메소드() 안에 매개변수 필요x
	System.out.println(px.Minus());
	System.out.println(px.Multi());
	System.out.println(px.Divide());
	
	System.out.println("a="+px.getA());
	System.out.println("b="+px.getB());
//	System.out.println(i+j);	이전 방식
//	System.out.println(i-j);
//	System.out.println(i*j);
//	System.out.println(i/j);
	
//	P1 p1 = new P1();
	
	// 객체지향 - 사칙연산하는 클래스를 만들어서 불러서 씀
//	System.out.println(p1.Plus(i,j));	
//	System.out.println(p1.Minus(i,j));
//	System.out.println(p1.Multi(i,j));
//	System.out.println(p1.Divide(i,j));
	
	
	

	}
}

