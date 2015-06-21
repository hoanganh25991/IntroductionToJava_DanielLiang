package chap23.multithreading;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class EventDispatcher extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8254983096534613684L;

	public EventDispatcher() {
		add(new JLabel("Hi, it runs from an evetn dispatch thread"));
	}

	/** Main method */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new JFrame("EventDispatcher Thread");
				frame.add(new EventDispatcher());
				frame.setSize(200, 200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
