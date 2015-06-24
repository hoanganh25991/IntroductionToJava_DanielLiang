package chap15.graphic;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8522457020654206690L;

	public DrawArcs() {
		add(new ArcPanel());
	}

	private class ArcPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -965738803324056577L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// g.drawArc(0, 0, 160, 160, 30, 45);
			int xCenter = getWidth() / 2;
			int yCenter = getHeight() / 2;
			int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

			int x = xCenter - radius;
			int y = yCenter - radius;
			g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30); // radius chinh la ban kinh
			g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);// 2*radius la duong kinh
			g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);// chieu dai duong kinh <=> khung bao ngoai
			g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
		}
	}

	/** Main method */
	public static void main(String[] args) {
		DrawArcs d = new DrawArcs();
		d.setTitle("DrawArcs");
		d.setSize(300,300);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setLocationRelativeTo(null);
		d.setVisible(true);
	}
}
