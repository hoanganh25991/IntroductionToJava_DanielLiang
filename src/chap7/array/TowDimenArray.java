package chap7.array;

public class TowDimenArray {
	int[][] dimenArray;
	int maxRow;
	int indexOfMaxRow;

	public TowDimenArray(int column, int row) {
		dimenArray = new int[column][row];
	}

	public void maxRowIndex() {
		TotalRow0();
		int totalOfThisRow = 0;
		for (int i = 1; i < dimenArray.length; i++) {
			for (int j = 0; j < dimenArray[i].length; j++) {
				totalOfThisRow += dimenArray[i][j];
			}

			if (totalOfThisRow > maxRow) {
				maxRow = totalOfThisRow;
				indexOfMaxRow = i;
			}
		}
	}

	private void TotalRow0() {
		indexOfMaxRow = 0;
		for (int i = 0; i < dimenArray[0].length; i++) {
			maxRow += dimenArray[0][i];
		}

	}

	public void ShufflingElements() {
		for (int i = 0; i < dimenArray.length; i++) {
			for (int j = 0; i < dimenArray[i].length; j++) {
				int iSwap = (int) (Math.random() * dimenArray.length);
				int jSwap = (int) (Math.random() * dimenArray[i].length);
				int temp = dimenArray[iSwap][jSwap];
				dimenArray[iSwap][jSwap] = dimenArray[i][j];
				dimenArray[i][j] = temp;
			}
		}
	}
}
