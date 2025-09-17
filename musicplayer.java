package music;

interface Media {
	void play();
	void stop();
	default void pause() {
		System.out.println("Media Paused");
		
	}
	static void about() {
		System.out.println("This is a media interface");
	}
}
interface AdvancedMedia extends Media{
	void nexttrack();
}
class Music implements AdvancedMedia{
	public void play() {
		System.out.println("Music Started");
		
	}
	public void pause() {
		System.out.println("Music Paused");
	}
	public void nextTrack() {
		System.out.println("Next Song");
	}

}
public class musicplayer {
	public static void main(String[] args) {
		Music music = new Music();
		music.play();
		music.nextTrack();
		music.pause();
		Media.about();
		music.stop();
		
	}
	

}
