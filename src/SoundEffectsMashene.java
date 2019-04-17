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
		frame.setVisible(true);
		JButton button1 = new JButton();
		button1.addActionListener(this);
		frame.add(button1);
		frame.pack();
		
	}

	public void actionPerformed(ActionEvent e) {
		if (bob == 0) {
			playSound("shiny-objects.wav");
		} else if (bob == 1) {
			playSound("homer-woohoo.wav");
		} else {
			playSound("llama.wav");
		}
		bob = new Random().nextInt(3);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public void SoundEffectMashene() {

	}

}
