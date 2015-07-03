package chap16_eventdrivenhandling;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlCircle02 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 293312626491454928L;
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public ControlCircle02() {
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);

		this.add(canvas, BorderLayout.CENTER);// add canvas to center
		this.add(panel, BorderLayout.SOUTH);// add panel to the frame
		jbtEnlarge.addActionListener(new EnlargeListener());
	}

	public static void main(String[] args) {
		JFrame frame = new ControlCircle02();
		frame.setTitle("ControlCircle02");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);

	}

	// inner class
	class EnlargeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			canvas.enlarge();

		}
	}

	class CirclePanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4359048980213004763L;
		private int radius = 5;

		void enlarge() {
			radius++;
			repaint();
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
		}
	}
}
