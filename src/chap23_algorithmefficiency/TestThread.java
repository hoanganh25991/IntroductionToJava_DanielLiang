package chap23_algorithmefficiency;

public class TestThread {
	public static void main(String[] args) {
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);

		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class PrintChar implements Runnable {
	private char ch;
	private int times;

	public PrintChar(char c, int t) {
		this.ch = c;
		this.times = t;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(ch);
		}
	}
}

class PrintNum implements Runnable {
	private int num;

	public PrintNum(int n) {
		this.num = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.print(i);
		}
	}

}
