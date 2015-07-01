package chap23_algorithmefficiency;

import java.util.Scanner;

public class GCD2 {
	private static Scanner sInput;

	public static int gcd(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}

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
}
