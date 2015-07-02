package JavaTestOnline;

import java.io.IOException;

import Utils.MainUtils;

public class AlmostPrime {

	public static int countAlmostPrimeNumbers(int from, int to) {
		/*
		 * A prime number is a natural number that has exactly two distinct natural number divisors, which are 1 and the prime number itself. The first prime
		 * numbers are: 2, 3, 5, 7, 11, 13.
		 * 
		 * Almost prime numbers are the non-prime numbers which are divisible by only a single prime number.
		 * 
		 * Please implement this method to return the number of almost prime numbers within the given range (inclusively).
		 */
		int count = 0;
		int start = (int) (Math.sqrt(from));
		int end = (int) (Math.sqrt(to));

		if (Math.pow(start, 2) == from) {
			count = end - start + 1;
		} else {
			count = end - (start + 1) + 1;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		int from = MainUtils.getNumber("enter start num");
		int to = MainUtils.getNumber("enter end num");
		System.out.printf("there are %d almost prime nums", countAlmostPrimeNumbers(from, to));
	}
}
