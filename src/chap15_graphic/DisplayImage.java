package chap15_graphic;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4632540656149256372L;

	public DisplayImage() {
		ImagePanel i = new ImagePanel();
		add(i);
	}

	private class ImagePanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -8585257136181035065L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image image1 = new ImageIcon("image/us.jpg").getImage();
			g.drawImage(image1, 0, 0, null);
		}
	}
	
	public static void main(String[] args) {
		DisplayImage d = new DisplayImage();
		d.setTitle("DisplayImage");
		d.setSize(400, 320);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setLocationRelativeTo(null);
		d.setVisible(true);
	}
}
