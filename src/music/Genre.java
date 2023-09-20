package music;

public abstract class Genre {
	private Instrument[] instruments;
	private boolean danceable;
	private String name; 
	
	public Genre(String pName,boolean pDanceable, Instrument[] pInstruments ) {
		name = pName;
		danceable = pDanceable;
		instruments = pInstruments;
    }

	public Instrument[] getInstruments() {
		return instruments;
	}

	public void setInstruments(Instrument[] instruments) {
		this.instruments = instruments;
	}
	

}
