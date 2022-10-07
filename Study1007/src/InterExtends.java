
public class InterExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls1 c1 = new Cls1(); // c1 이라는 객체 생성
		c1.funcA();
		c1.funcB();

		Cls2 c2 = new Cls2();
		c2.funcA();
		c2.funcC();

		itfA i1 = new Cls1();
		i1.funcA();
//		i1.funcB(); 호출안됨

		itfA i2 = new Cls2();
		i2.funcA();

		itfB i3 = new Cls1();  // new Cls2(); 는 안됨 itfB 를 구현했는지를 보면됨 
		i3.funcB();
		
		itfB i4 = new Cls1();
		i4.funcB();
		
		i4 = new Cls2();
		i4.funcB();
		
		
		itfC i5 = new Cls2();
		i5.funcA();
		i5.funcC();
		
//		 안되는거 찾기
//		 1. itfA a1 = new Cls1(); 
//		 2. itfB a2 = new Cls1();
//		 3. itfC a3 = new Cls1();
//		 4. itfA a4 = new Cls2();
//		 5. itfB a5 = new Cls2();
//		 6. itfC a6 = new Cls2();
//		 7. Cls1 a7 = new Cls1();
//		 8. Cls2 a8 = new Cls2();
//		 9. Cls1 a9 = new Cls2();
//		 10. Cls2 a10 = new Cls1();
		
		  itfA a1 = new Cls1();  
		  itfB a2 = new Cls1();
//		  itfC a3 = new Cls1();     //Cls1에 구현이 되어있는지를 봐야함 
		 
		  itfA a4 = new Cls2();
		  itfB a5 = new Cls2();
		  itfC a6 = new Cls2();
		  
		  Cls1 a7 = new Cls1();
		  Cls2 a8 = new Cls2();
		  
//		  Cls1 a9 = new Cls2();		//인터페이스가 겹칠뿐 둘은 별개의 클래스라서 불가능 
//		  Cls2 a10 = new Cls1();
		  
	}
}

interface itfA {
	public void funcA();
}

interface itfB {
	public void funcB();
}

interface itfC extends itfA,itfB { // 상속 => 부모인터페이스 기능도 가지고 있다는 의미 . public void funcA(); 도 나에게 존재한다고 보는것
	public void funcC();
}

class Cls1 implements itfA, itfB {

	@Override
	public void funcA() { // 무조건 구현 해야함
		System.out.println("funcA in Cls1");

	}

	@Override
	public void funcB() { // 무조건 구현 해야함
		System.out.println("funcB in Cls1");

	}

}

class Cls2 implements itfC { // Cls2에 빨간줄 떠서 add 하면 두개가 모두 뜬다

	@Override
	public void funcA() {
		System.out.println("funcA in Cls2");

	}

	@Override
	public void funcC() {
		System.out.println("funcC in Cls2");

	}
	
	@Override
	public void funcB() { // 무조건 구현 해야함
		System.out.println("funcB in Cls2");

	}

}
                       
//class Mother{
//	
//}
//
//class Father{
//	
//}

// class Child extends Mother, Father{ // 상속은 하나만 가능 }
// class Child extends Mother implements Father{
//	
//}

//class Child implements Mother,Father{ 다중상속 가능 
//	
//}

