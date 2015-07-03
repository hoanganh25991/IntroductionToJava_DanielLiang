package JavaTestOnline;

public class Point {
	public static int getClosestToZero(int[] a) {
		/*
		 * Please implement this method to return the number in the array that is closest to zero. If there are two equally close to zero elements like 2 and -2
		 * - consider the positive element to be "closer" to zero.
		 */
		int closestPointIndex = 0;
		int distance = distane(a[closestPointIndex]);
		for (int i = 1; i < a.length; i++) {
			if (distane(a[i]) == distance) {
				if (a[i] > a[closestPointIndex]) {
					closestPointIndex = i;
					distance = distane(a[i]);
				}
			} else if (distane(a[i]) < distance) {
				closestPointIndex = i;
				distance = distane(a[i]);
			}
		}

		return a[closestPointIndex];
	}

	private static int distane(int x) {
		return x * x;
	}
}
