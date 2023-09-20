package music;

public class Genre {
	private Instrument[] instruments;
	private boolean danceable;
	private String name; 
	
	public Genre(String pName,boolean pDanceable, Instrument[] pInstruments ) {
		name = pName;
		danceable = pDanceable;
		instruments = pInstruments;
    }

}
