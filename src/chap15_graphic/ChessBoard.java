package chap15_graphic;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5412531229129861401L;

	/** Main method */
	public static void main(String[] args) {
		ChessBoard c = new ChessBoard();
		c.setTitle("ChessBoard");
		c.setSize(300, 200);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}

	/* Constructor */
	public ChessBoard() {
		add(new CellPanel());
	}

	private class CellPanel extends JPanel {
		int cellWidth;
		int cellHeight;
		Graphics graphic;
		boolean isFilled = false;

		/**
		 * 
		 */
		private static final long serialVersionUID = 6375633799783177454L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			cellWidth = getWidth() / 8;
			cellHeight = getHeight() / 8;
			graphic = g;
			// g.fillRect(0, 0, cellWidth, cellHeight);
			for (int column = 0; column < 8; column++) {
				int x = cellWidth * column;
				for (int row = 0; row < 8; row++) {
					int y = cellHeight * row;
					drawCell(x, y);
					toggleIsFilled();
				}
				toggleIsFilled();
			}

		}

		private void drawCell(int x, int y) {
			graphic.drawRect(x, y, cellWidth, cellHeight);
			if (isFilled) {
				graphic.fillRect(x, y, cellWidth, cellHeight);
			}
		}

		private void toggleIsFilled() {
			isFilled = !isFilled; // note that we have to deny on isFilled itself

		}
	}
}
