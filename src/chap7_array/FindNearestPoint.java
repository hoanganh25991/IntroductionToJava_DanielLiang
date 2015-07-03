package chap7_array;

import java.util.Scanner;

public class FindNearestPoint {
	double[][] mPointStore;
	Scanner input;
	int indexOfPoint1, indexOfPoint2;

	public FindNearestPoint(int numberOfPoints) {
		mPointStore = new double[numberOfPoints][2];
		input = new Scanner(System.in);
	}

	public void addElements() {
		for (int i = 0; i < mPointStore.length; i++) {
			System.out.println("enter coordinate of point " + i);
			mPointStore[i][0] = input.nextDouble();
			mPointStore[i][1] = input.nextDouble();
		}
	}

	public void findNearestPoint() {
		indexOfPoint1 = 0;
		indexOfPoint2 = 1;
		double distance = distanceOfTwoPoint(0, 1);
		double newDistance;
		for (int i = 0; i < mPointStore.length; i++) {
			for (int j = i + 1; j < mPointStore.length; j++) {
				newDistance = distanceOfTwoPoint(i, j);
				if (newDistance < distance) {
					distance = newDistance;
					indexOfPoint1 = i;
					indexOfPoint2 = j;
				}
			}
		}
		System.out.printf("closed pair: p[%d,%d], p[%d,%d]", mPointStore[indexOfPoint1][0], mPointStore[indexOfPoint1][1], mPointStore[indexOfPoint2][0], mPointStore[indexOfPoint2][1]);
		System.out.println("distance: " + distance);
	}

	public double distanceOfTwoPoint(int point1, int point2) {
		return Math.sqrt(Math.pow(mPointStore[point1][0]
				- mPointStore[point2][0], 2)
				+ Math.pow(mPointStore[point1][1] - mPointStore[point2][1], 2));
	}
	
	public static void main(String[] args) {
		FindNearestPoint f = new FindNearestPoint(5);
		f.addElements();
		f.findNearestPoint();
	}

}
