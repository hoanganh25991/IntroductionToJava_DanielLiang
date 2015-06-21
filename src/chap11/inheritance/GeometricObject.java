package chap11.inheritance;

public class GeometricObject {
	@Override
	public String toString() {
		return "geometric here";
	}
	
	public static void main(String[] args) {
		Object o = new GeometricObject();
		System.out.println(o.toString());
	}
}


