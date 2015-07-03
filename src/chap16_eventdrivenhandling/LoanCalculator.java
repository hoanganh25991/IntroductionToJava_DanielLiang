package chap16_eventdrivenhandling;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class LoanCalculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4268641583585479658L;
	private JTextField jtfAnnualInterestRate = new JTextField();
	private JTextField jtfNumberOfYear = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();
	private JTextField jtfTotalPayment = new JTextField();

	// create a compute payment button
	private JButton jbtComputeLoan = new JButton("Compute Payment");

	public LoanCalculator() {
		// panel p1 to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(5, 2));
		p1.add(new JLabel("Annual Interest Rate"));
		p1.add(jtfAnnualInterestRate);
		p1.add(new JLabel("Number of Years"));
		p1.add(jtfNumberOfYear);
		p1.add(new JLabel("Loan Amount"));
		p1.add(jtfLoanAmount);
		p1.add(new JLabel("Monthly Payment"));
		p1.add(jtfMonthlyPayment);
		p1.add(new JLabel("Total Payment"));
		p1.add(jtfTotalPayment);
		p1.setBorder(new TitledBorder("Enter loan amoount, interest rate, and year"));

		// panel p2 to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtComputeLoan);

		// add the panels to the frame
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);

		// register listener
		jbtComputeLoan.addActionListener(new ButtonListener());

	}

	/** Handle the Compute Payment button */
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// get value from text fields
			double interest = Double.parseDouble(jtfAnnualInterestRate.getText());
			int year = Integer.parseInt(jtfNumberOfYear.getText());
			double loanAmount = Double.parseDouble(jtfLoanAmount.getText());

			// create a loan object
			Loan loan = new Loan(interest, year, loanAmount);

			jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
		}
	}

	public static void main(String[] args) {
		LoanCalculator frame = new LoanCalculator();
		frame.pack();
		frame.setTitle("LoanCalculator");
		frame.setLocationRelativeTo(null); // center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class Loan {
	double interest;
	int year;
	double loanAmount;

	public Loan(double interest, int year, double loanAmount) {
		super();
		this.interest = interest;
		this.year = year;
		this.loanAmount = loanAmount;
	}

	public float getMonthlyPayment() {
		float x = 0;

		return x;
	}

	public float getTotalPayment() {
		float y = 0;
		return y;
	}
}
