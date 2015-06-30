package chap23_algorithmefficiency;

import java.util.Scanner;

public class GCD1 {
	private static Scanner sInput;

	public static void main(String[] args) {
		while (true) {
			sInput = new Scanner(System.in);
			System.out.println("enter first num");
			int m = sInput.nextInt();
			System.out.println("enter second num");
			int n = sInput.nextInt();
			System.out.printf("gcd of [%d, %d] = %d", m, n, gcd(m, n));
			System.out.println();
		}
	}

	public static int gcd(int m, int n) {
		int gcd = 1;
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0)
			return n;
		for (int k = m / 2; k >= 1; k--) {
			if (m % k == 0 && n % k == 0) {
				gcd = k;
				break;
			}
		}
		return gcd;
	}
}
