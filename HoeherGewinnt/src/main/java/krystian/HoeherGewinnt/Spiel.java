package krystian.HoeherGewinnt;

import java.util.List;

public class Spiel {
	
	private Ablagestapel ablagestapel;
	private List<Spieler> spieler;
	
	
	public Spiel(Ablagestapel ablagestapel, List<Spieler> spieler) {
		super();
		this.ablagestapel = ablagestapel;
		this.spieler = spieler;
	}


	public Ablagestapel getAblagestapel() {
		return ablagestapel;
	}


	public void setAblagestapel(Ablagestapel ablagestapel) {
		this.ablagestapel = ablagestapel;
	}


	public List<Spieler> getSpieler() {
		return spieler;
	}


	public void setSpieler(List<Spieler> spieler) {
		this.spieler = spieler;
	}
	
	
	
	

}
