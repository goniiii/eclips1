
public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();

		Parent parent = child;  

		parent.method1();

		parent.method2();

//		parent.method3(); ( 호출 불가능 )
		child.method3(); 
		
		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2(); // Parent에 정의된 method2 가 불린다 

	}

}

class Parent {
	void method1() {
		System.out.println("Parent-method1()");
	}

	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	
	@Override
	
	void method2() {							// 재정의 
		System.out.println("Child-method2()");
	}

	void method3() {
		System.out.println("Child-method3()");
	}
}


