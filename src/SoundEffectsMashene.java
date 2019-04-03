import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffectsMashene implements ActionListener {
	int bob;

	public void showButton() {
		bob = new Random().nextInt(3);

		JFrame frame = new JFrame();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

	}

	public void actionPerformed(ActionEvent e) {
		if (bob == 0) {
			playSound("shiny-objects.wav");
		} else if (bob == 1) {
			playSound("Cool.wav");
		} else {
			playSound("llama.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public void SoundEffectMashene() {

	}

}
