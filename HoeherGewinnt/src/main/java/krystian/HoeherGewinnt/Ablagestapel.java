package krystian.HoeherGewinnt;

import java.util.List;

public class Ablagestapel {
	
	String test;
	private List<Karte> abgelegteKarten;

	
	public Ablagestapel(List<Karte> abgelegteKarten) {
		super();
		this.abgelegteKarten = abgelegteKarten;
	}
	
	

	public List<Karte> getAbgelegteKarten() {
		return abgelegteKarten;
	}

	public void setAbgelegteKarten(List<Karte> abgelegteKarten) {
		this.abgelegteKarten = abgelegteKarten;
	}
	
	
	

}
