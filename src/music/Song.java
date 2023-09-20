package music;

public class Song {
	private String name;
	private String lyrics;
	private Genre[] genre;
	
	public Song(String pName,String pLyrics, Genre[] pGenre) {
		name = pName;
		lyrics = pLyrics;
		genre = pGenre;
	}
	public void playSong() {
		System.out.println("playing");
	}

}
