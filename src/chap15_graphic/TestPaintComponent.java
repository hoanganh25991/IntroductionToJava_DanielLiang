package chap15_graphic;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestPaintComponent extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestPaintComponent() {
		add(new NewPanel());
		add(new TestDraw());
	}

	private class NewPanel extends JPanel {
		private static final long serialVersionUID = -538632295878788692L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(0, 0, 50, 50);
			g.drawString("Banner", 0, 10);
		}
	}

	private class TestDraw extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -3921390892531503039L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// g.drawRoundRect(0, 0, 160, 160, 160, 160);
			g.draw3DRect(50, 50, 100, 80, false);
		}

	}

	/** Main method */
	public static void main(String[] args) {
		TestPaintComponent t = new TestPaintComponent();
		t.setTitle("TestPaintComponent");
		t.setSize(200, 200);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setLocationRelativeTo(null);
		t.setVisible(true);
	}
}
