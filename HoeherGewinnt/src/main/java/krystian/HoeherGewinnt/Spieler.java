package krystian.HoeherGewinnt;

import java.util.List;

public class Spieler {
	
	private String name;
	private List<Karte> handkarten;
	private int punkte;
	
	
	


	public Spieler(String name, List<Karte> handkarten, int punkte) {
		super();
		this.name = name;
		this.handkarten = handkarten;
		this.punkte = punkte;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Karte> getHandkarten() {
		return handkarten;
	}


	public void setHandkarten(List<Karte> handkarten) {
		this.handkarten = handkarten;
	}


	public int getPunkte() {
		return punkte;
	}


	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}
	
	
	
	
	

}
