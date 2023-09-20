package ai;

import music.Genre;
import music.Song;

public class SongGen {
	private Song song;
	private Genre[] genres;
	private String lyrics;
	
	public SongGen(Genre[] pGenres,String pLyrics) {
		genres = pGenres;
		lyrics = pLyrics;
	}
	
	public void generateSong(String name) {
		System.out.println("generating song");
		 song = new Song(name,lyrics,genres);
	}
	
}
