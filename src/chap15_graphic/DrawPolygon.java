package chap15_graphic;
import java.awt.Graphics;

import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolygon extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1811239747364016723L;

	public DrawPolygon() {
		add(new PolygonPanel());
	}

	private class PolygonPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1711249027553243022L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Polygon p = new Polygon();
			p.addPoint(0, 50);
			p.addPoint(10, 0);
			p.addPoint(50, 10);
			p.addPoint(70, 0);
			p.addPoint(70, 70);
			p.addPoint(0, 70);
			
			g.drawPolygon(p);
		}
	}
	
	
	/** main method*/
	public static void main(String[] args) {
		DrawPolygon d = new DrawPolygon();
		d.setTitle("DrawPolygon");
		d.setSize(200, 200);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setLocationRelativeTo(null);
		d.setVisible(true);
	}
}
