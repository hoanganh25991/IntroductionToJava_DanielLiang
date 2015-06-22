package chap16.eventdrivenhandling;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import Utils.StillClock;

public class ClockAnimation extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7465912787242156030L;
	private StillClock clock = new StillClock();

	public ClockAnimation() {
		add(clock);
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			clock.setCurrentTime();
			clock.repaint();
		}
	}

	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new ClockAnimation();
		frame.setTitle("ClockAnimation");
		frame.setSize(200, 200);
		Toolkit tk = Toolkit.getDefaultToolkit();
		int screenWidth = tk.getScreenSize().width;
		int setX = (int) (screenWidth * 0.85);
		frame.setLocation(setX, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
