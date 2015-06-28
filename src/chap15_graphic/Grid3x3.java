package chap15_graphic;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid3x3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4337235474022503830L;

	/** Main method */
	public static void main(String[] args) {
		Grid3x3 g = new Grid3x3();
		g.setTitle("Grid3x3");
		g.setSize(300, 200);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setLocationRelativeTo(null);
		g.setVisible(true);
	}

	/* Constructor */
	public Grid3x3() {
		add(new LinePanel());
	}

	private class LinePanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -3358738189325253232L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int xCoordinate = getWidth();
			int yCoordinate = getHeight();

			int xFirstLine = xCoordinate / 3;
			int xSecondLine = xCoordinate * 2 / 3;

			int yThirdLine = yCoordinate / 3;
			int yFourthLine = yCoordinate * 2 / 3;
			
			g.drawLine(xFirstLine, 0, xFirstLine, yCoordinate);
			g.drawLine(xSecondLine, 0, xSecondLine, yCoordinate);
			g.drawLine(0, yThirdLine, xCoordinate, yThirdLine);
			g.drawLine(0, yFourthLine, xCoordinate, yFourthLine);
		
		}

	}
}
