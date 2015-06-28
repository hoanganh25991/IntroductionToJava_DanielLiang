package chap11_inheritance;

import java.util.ArrayList;

public class ArrayListFunction {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("London");
		cityList.add("Vietnam");
		System.out.println(cityList.contains("Vietnam"));
		System.out.println(cityList.size());
		cityList.remove(1);
		System.out.println("index of " + cityList.indexOf("London"));
		cityList.add("Lao");
		cityList.add("Campuchia");
		System.out.println(cityList.toString());

	}

}
