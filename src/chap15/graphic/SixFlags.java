package chap15.graphic;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Utils.ImageViewer;

public class SixFlags extends JFrame {
	private static int a;

	/**
	 * 
	 */
	private static final long serialVersionUID = -9059835584271997983L;

	public SixFlags() {
		Image image1 = new ImageIcon("image/us.jpg").getImage();
		Image image2 = new ImageIcon("image/ca.gif").getImage();
		Image image3 = new ImageIcon("image/india.gif").getImage();
		Image image4 = new ImageIcon("image/uk.jpg").getImage();
		Image image5 = new ImageIcon("image/china.jpg").getImage();
		Image image6 = new ImageIcon("image/norway.gif").getImage();

		setLayout(new GridLayout(2, 0, 5, 5));
		add(new ImageViewer(image1));
		add(new ImageViewer(image2));
		add(new ImageViewer(image3));
		add(new ImageViewer(image4));
		add(new ImageViewer(image5));
		// add(new JLabel(new ImageIcon("images/us.jpg")));
		add(new ImageViewer(image6));
	}

	public static void main(String[] args) {
		SixFlags s = new SixFlags();
		s.setTitle("SixFlags");
		s.setSize(400, 320);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setLocationRelativeTo(null);
		s.setVisible(true);
		System.out.println(new ImageViewer().getXCoordinate());
		System.out.println(a);
	}
}
