package music;

public class MixedGenre extends Genre{
	private Genre[] genres;

	public MixedGenre(String pName, boolean pDanceable, Genre[] genres) {
		Instrument pInstruments[]; 
		for (Instrument instruments[] : genres) {
			pInstruments+= instruments;
		} 
		super(pName, pDanceable, pInstruments);
	}
}
