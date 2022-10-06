
public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");

		Animal animal = null;
		animal = new Dog();			
		animal.sound();
		System.out.println(animal.eat());
		animal.sleep();
		System.out.println();
		animal = new Cat();
		animal.sound();
		System.out.println(animal.eat());
		animal.sleep();
		System.out.println("--------");

//		Dog dog1 = new Dog(); 어디에 담았다가 사용하면 나중에 쓸 때 편하다 
//		animalSound(dog1());
		
		animalSound(new Dog());	// 일회성으로 쓸 때는 이렇게도 사용가능 
		animalSound(new Cat());
		 
		animalSleep(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void animalSleep(Animal animal) {
		animal.sleep();
	}

}

abstract class Animal {
	public String kind;

	public void breathe()

	{
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();		// abstract 메소드는 선언만함. 몸통이 없다. 

	public abstract void sleep();

	public abstract boolean eat();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void sleep() {						// 실제로 뭐가 없긴하지만 구현이 됐다라고 인식해서 빨간줄 사라짐 
		// TODO Auto-generated method stub
		System.out.println("4시간 잔다.");
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return true;
	}
	
	 
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("6시간 잔다.");
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return false;
	}
}
