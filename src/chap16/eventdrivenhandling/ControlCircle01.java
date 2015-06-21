package chap16.eventdrivenhandling;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlCircle01 extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new ControlCircle01();
		frame.setTitle("ControlCircle01");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}

class CirclePanel extends JPanel {
	private int radius = 5; // default circle radius

	/** Repaint the circle */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
}
