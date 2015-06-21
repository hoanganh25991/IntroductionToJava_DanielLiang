package chap11.inheritance;

public class Faculty extends Employee{
	public static void main(String[] args) {
		new Faculty();
	}
	public Faculty(){
		System.out.println("(3) third generation");
	}

}

class Person{
	public Person(){
		System.out.println("(1) first generation");
	}
}
class Employee extends Person{
	public Employee(){
		System.out.println("(2) second generation");
	}
}