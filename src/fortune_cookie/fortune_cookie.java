package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();

	public void showButton() {

		frame.setVisible(true);

		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "Woohoo!");
		}
		int bob = new Random().nextInt(7);
		if (bob == 0) {
			JOptionPane.showMessageDialog(null, "You will die tomorrow, so sweet dreams");
		} else if (bob == 1) {
			JOptionPane.showMessageDialog(null, "You will bo very rich for 5 seconds in 2 years");
		} else if (bob == 2) {
			JOptionPane.showMessageDialog(null, "You will fail high school, and wont go to collage");
		} else if (bob == 3) {
			JOptionPane.showMessageDialog(null, "You will like cheese");
		} else if (bob == 4) {
			JOptionPane.showMessageDialog(null, "You will eat out tomorrow");
		} else if (bob == 5) {
			JOptionPane.showMessageDialog(null, "You will become Captan Marvel");
		} else {
			JOptionPane.showMessageDialog(null, "You wont get married");
		}
	}

}
