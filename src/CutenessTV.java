import java.net.URI;
import java.util.Random;

public class CutenessTV {
	public void showButton() {
		Random bob = new Random();
		int sound = bob.nextInt(3);
		if(sound == 0) {
			showDucks();
		}
		else if(sound == 1) {
			showFrog();
		}
		else {
		showFluffyUnicorns();	
		}
}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	
}
