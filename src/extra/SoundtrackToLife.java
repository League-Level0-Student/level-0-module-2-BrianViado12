//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your mood right now?", "Your Mood", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Stressed", "Sad", "Mad", "Playful","Wierd","Calm","Crazy","Spooky"}, null);
				
		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood); 
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if (userMood == 1) {
			playVideo("https://www.youtube.com/watch?v=pXRviuL6vMY");
		}
		if (userMood == 2) {
			playVideo("https://www.youtube.com/watch?v=FGGo8LFmbjs");
		}
		if (userMood == 0) {
			playVideo("https://www.youtube.com/watch?v=mdaCDsN1FJ0");
		}
		
		if (userMood == 3) {
			playVideo("https://www.youtube.com/watch?v=V5M2WZiAy6k");
		}
		if (userMood == 4) {
			String input= JOptionPane.showInputDialog("which one?");
			if (input.equals("1")) {
			playVideo("https://www.youtube.com/watch?v=jhq6gxQwv6Y");
			}
			if (input.equals("2")) {
			playVideo("https://www.youtube.com/watch?v=aOyNMMLDJeo");
			}
			if (input.equals("3")) {
			playVideo("https://www.youtube.com/watch?v=COuffL6UjQ4");
			}
			
		}
		
		if (userMood == 5) {
			playVideo("https://www.youtube.com/watch?v=t9tagkM-d8I");
		}
		
		if (userMood == 6) {
			playVideo("https://www.youtube.com/watch?v=995bHqTO9qQ");

		}
		
		if (userMood == 7) {
			playVideo("https://www.youtube.com/watch?v=InEYzMi1fFQ");

		}
		
		if (userMood == 8) {
			playVideo("https://www.youtube.com/watch?v=YQTMAv5fYo0");

		}
		
		
		// 4. Play different songs for other moods.
		
/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



