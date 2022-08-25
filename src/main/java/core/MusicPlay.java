package core;

import org.springframework.stereotype.Component;

@Component(value="mp")
public class MusicPlay {
	
	public void playing() {
		System.out.println("This is music player");
	}

}
