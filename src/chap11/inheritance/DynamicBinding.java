package chap11.inheritance;

public class DynamicBinding {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person02());
		m(new Object());
	
	}
	
	public static void m(Object o){
		System.out.println(o.toString());
	}
}

class Person02{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "person";
	}
}

class Student extends Person02{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student";
	}
}

class GraduateStudent extends Student{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "gradute";
	}
}
