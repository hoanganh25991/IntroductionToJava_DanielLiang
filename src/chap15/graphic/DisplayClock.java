package chap15.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import Utils.StillClock;

public class DisplayClock extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8881419124731421760L;

	public DisplayClock() {
		StillClock clock = new StillClock();
		MessagePanel message = new MessagePanel(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());

		message.setCentered(true);
		message.setForeground(Color.BLUE);
		message.setFont(new Font("Consolas", Font.BOLD, 16));

		add(clock);
		add(message, BorderLayout.SOUTH);

	}
	
	public static void main(String[] args) {
		DisplayClock d = new DisplayClock();
		d.setTitle("DisplayClock");
		d.setSize(300, 350);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setLocationRelativeTo(null);
		d.setVisible(true);
	}

}
