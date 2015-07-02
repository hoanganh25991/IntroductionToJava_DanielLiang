package JavaTestOnline;

import java.io.IOException;

import Utils.MainUtils;

public class Word {
	/*
	 * Please implement this method to return the word count in a given String. Assume that the parameter String can only contain spaces and alphanumeric
	 * characters.
	 */
	public static int countWords(String s) {
		s = s.trim();
		char[] a = s.toCharArray();
		int count = 0;
		boolean isTracked = false;
		for (int i = 0; i < a.length; i++) {
			if (isLetter(a[i])) {
				isTracked = true;
			} else {
				if (isTracked) {
					count++;
				}
				isTracked = false;
			}
		}
		count++;// plus the last one
		return count;
	}

	private static boolean isLetter(char ch) {
		return ch != ' ';
	}

	public static void main(String[] args) throws IOException {
		while (true) {
			String s = MainUtils.getInput("enter string to count word");
			System.out.println("word count: " + countWords(s));
		}
	}
}
