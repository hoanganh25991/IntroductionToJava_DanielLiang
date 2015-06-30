package chap23_algorithmefficiency;

public class Extends_Implement extends ExtendClass implements ImplementClass {

	Extends_Implement() {
	}

	Extends_Implement(int i) {
		super(i);
	}

	@Override
	void caculate() {
		for (int i = 0; i < getAge(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Extends_Implement ob = new Extends_Implement();
		ob.draw();
		ob.draw(5);
		ob.caculate();
		ob.syso();
	}

	@Override
	public void draw() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("|x|");
			}
			System.out.println();
		}
		for (int i = 9; i > -1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("|x|");
			}
			System.out.println();
		}
	}

	@Override
	public void draw(int radius) {
		for (int i = 0; i < ImplementClass.radius; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("|x|");
			}
			System.out.println();
		}
		for (int i = radius; i > -1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("|x|");
			}
			System.out.println();
		}
	}
}

// first class with abstract method, MainClass extends/implements this class
// ?
abstract class ExtendClass {
	private int age;

	public ExtendClass() {
		this.age = 25;
	}

	ExtendClass(int i) {
		this.age = i;
	}

	void syso() {
		System.out.println("age: " + age);
	}

	int getAge() {
		return age;
	}

	abstract void caculate();
}

interface ImplementClass {
	int radius = 15;

	abstract void draw(int radius);

	abstract void draw();
}