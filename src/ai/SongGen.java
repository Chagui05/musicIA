package ai;

import music.Genre;
import music.Song;

public class SongGen {
	private Song song;
	private Genre genre;
	private String lyrics;
	
	public SongGen(Genre pGenres,String pLyrics) {
		genre = pGenres;
		lyrics = pLyrics;
	}
	
	public void generateSong(String name) {
		System.out.println("generating song");
		 song = new Song(name,lyrics,genre);
	}
	
	public void addGenres(Genre pGenre) {
		System.out.println("adding genres to the song");
		 song.setGenre(pGenre);
	}
	
}
