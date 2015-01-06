import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*Cilj je da racunar pogodi zamisljeni broj, tako sto klikom
 *na buttone "V"- vece, "M"-manje, "T"-tacno navodimo na broj. 
 */
public class GuessNumber {
	private static JButton button1 = new JButton("M");
	static JButton button2 = new JButton("T");
	static JButton button3 = new JButton("V");
	static JLabel label = new JLabel("0");

	public static void main(String[] args) {
		JFrame window = new JFrame("GUESS!");
		window.setSize(300, 300);
		JPanel panel = new JPanel();
		window.setContentPane(panel);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		ButtonHandler listener = new ButtonHandler();
		button1.addActionListener(new ButtonHandler());
		button2.addActionListener(listener);
		button3.addActionListener(listener);

		panel.add(label);
		window.setVisible(true);

	}
/**
 * Klasa implementira inetefejs koji koristimo kako bismo kreirali ActionEvent na buttone.
 * @author Selma
 *
 */
	public static class ButtonHandler implements ActionListener {
		int min = 1;
		int max = 10000;
		private static int start = 1;
		private static int end = 10000;
		private static int midd = (start + end) / 2;
/** 
 * Kreiramo novi button kojem dodjeljujemo vrijednost action eventa,
 * zatim ispitujemo na koji button je pozvan.
 */
		@Override
		public void actionPerformed(ActionEvent a) {
			JButton butt = (JButton) (a.getSource());
			if (butt == button1)
				end = midd;
			else if (butt == button3)
				start = midd;
			label.setText(String.valueOf(Binary(start,end)));
			if (butt == button2)
				new JOptionPane("Excellent!");
			System.out.println("ACTION");

		}
	/**
	 * Metoda nalazi sredinu parametara
	 * @param start
	 * @param end
	 * @return sredina
	 */
		private static int Binary(int start, int end) {
			return (start + end) / 2;

		}

	}

}
