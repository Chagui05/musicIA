package ai;

public class LyricsGen {
	private String[] wordlist;
	private String lyrics;
	
	public LyricsGen(String[] pWordlist) {
		wordlist = pWordlist;
	}
	
	 public void generateLyrics() {
		System.out.println("generating lyrics");
		//lyrics = los lyrics que se generan con base en las palabras
	}

	public String[] getWordlist() {
		return wordlist;
	}

	public void setWordlist(String[] wordlist) {
		this.wordlist = wordlist;
	}

}
