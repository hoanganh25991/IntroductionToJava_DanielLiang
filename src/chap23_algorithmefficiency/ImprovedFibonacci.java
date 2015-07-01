package chap23_algorithmefficiency;

import java.util.Scanner;

public class ImprovedFibonacci {
	private static Scanner sInput;

	public static void main(String[] args) {
		while (true) {
			sInput = new Scanner(System.in);
			System.out.println("index n");
			int index = sInput.nextInt();
			System.out.println("fibonaaci number at index " + index + " is " + fib(index));
		}
	}

	public static int fib(int n) {
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;

		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else if (n == 2) {
			return f2;
		}

		for (int i = 3; i <= n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}

		return f2;
	}
}
