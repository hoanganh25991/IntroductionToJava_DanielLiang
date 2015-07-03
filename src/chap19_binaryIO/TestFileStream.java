package chap19_binaryIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("temp.dat");

		for (int i = 0; i < 10; i++) {
			output.write(i);
		}
		output.close();

		int value;
		FileInputStream input = new FileInputStream("temp.dat");
		while ((value = input.read()) != -1) {
			System.out.print(value + " ");
		}
		input.close();
	}
}
