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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public Genre[] getGenre() {
		return genre;
	}
	public void setGenre(Genre[] genre) {
		this.genre = genre;
	}
	
	

}
