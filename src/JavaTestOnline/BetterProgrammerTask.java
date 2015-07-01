package JavaTestOnline;

public class BetterProgrammerTask {

	public static int countWords(String s) {
		/*
		 * Please implement this method to return the word count in a given String. Assume that the parameter String can only contain spaces and alphanumeric
		 * characters.
		 */
		int count = 0;
		char[] charArray = s.toCharArray();
		System.out.println(s.length());
		int current = 0;
		int length = charArray.length;
		boolean isPrevious = false;
		while (current < length) {
			if (!isSpace(charArray[current])) {
				System.out.println("not space," + current);
				isPrevious = true;
				if (current == length - 1) {
					count++;
					System.out.println(count);
					break;
				}
				if (!isSpace(charArray[++current])) {
					System.out.println("not space," + current);
					current++;
				} else {
					System.out.println("is space," + current);
					current++;
					count++;
					System.out.println(count);
				}
			} else {
				System.out.println("is space," + current);
				current++;
				if (isPrevious) {
					count++;
					isPrevious = false;
					System.out.println(count);
				}

			}
		}
		return count;
	}

	private static boolean isSpace(char ch) {

		return ch == ' ';
	}

	 public static void main(String[] args) {
	 System.out.println("word count " + countWords("  le hoang     anh saf sfsadf "));
	 }
}
