package chap7_array;

import java.util.Scanner;

public class CheckSudokuSolution {
	boolean isBreakRule;
	int[][] sudokuTable;
	private Scanner input;

	/* Constructor */
	public CheckSudokuSolution() {
		isBreakRule = false;

	}

	/* Add elements into sudoku table to check */
	public void addSudokuTable() {
		sudokuTable = new int[9][9];
		input = new Scanner(System.in);
		System.out.println("enter whole sudoku table");
		for (int i = 0; i < 3; i++) {
			System.out.println("enter i " + i);
//			char[] ch = input.nextLine().toCharArray();
			for (int j = 0; j < 2; j++) {
				System.out.println("enter j" + j);
//				sudokuTable[i][j] = Integer.parseInt(ch[j] + "");
				sudokuTable[i][j] = input.nextInt();
			}
		}
	}

	/** Check Block first */
	public boolean checkBlock() {
		int[] NineNumArray = new int[9];
		for (int blockIndex = 0; blockIndex < 9; blockIndex++) {
			int elementIndex = -1;
			int rowOrder = blockIndex / 3;
			int columnOrder = blockIndex % 3;
			for (int k = 0; k < 3; k++) {
				for (int j = 0; j < 3; j++) {
					NineNumArray[++elementIndex] = sudokuTable[3 * rowOrder + k][3 * columnOrder + j];
				}
			}
			isBreakRule = checkOneToNine(NineNumArray);
			System.out.printf("Block[%d]: " + !isBreakRule, blockIndex);
			System.out.println("");
			printBlockOut(NineNumArray);
		}
		return isBreakRule;
	}

	/** Check Row */
	public boolean checkRow() {
		int[] NineNumArray = new int[9];
		for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
			int elementIndex = -1;
			for (int columnOrder = 0; columnOrder < 9; columnOrder++) {
				NineNumArray[++elementIndex] = sudokuTable[rowIndex][columnOrder];
			}
			isBreakRule = checkOneToNine(NineNumArray);
			System.out.printf("Row[%d] " + !isBreakRule, rowIndex);
			System.out.println("");
			printRow(NineNumArray);
		}
		return isBreakRule;
	}

	/** Check Column */
	public boolean checkColumn() {
		int[] NineNumArray = new int[9];
		for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
			int elementIndex = -1;
			for (int rownOrder = 0; rownOrder < 9; rownOrder++) {
				NineNumArray[++elementIndex] = sudokuTable[rownOrder][columnIndex];
			}
			isBreakRule = checkOneToNine(NineNumArray);
			System.out.printf("Column[%d] " + !isBreakRule, columnIndex);
			System.out.println("");
			printRow(NineNumArray);
		}
		return isBreakRule;
	}

	private boolean checkOneToNine(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public void printBlockOut(int[] nums) {
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|" + nums[3 * k + j]);
			}
			System.out.println("|");
		}
	}

	public void printRow(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print("|" + nums[i]);
		}
		System.out.println("|");
	}

	/** Main method */
	public static void main(String[] args) {
		CheckSudokuSolution c = new CheckSudokuSolution();
		c.addSudokuTable();
		c.checkBlock();
		c.checkRow();
		c.checkColumn();
	}

}
