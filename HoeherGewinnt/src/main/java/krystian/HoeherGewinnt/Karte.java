package krystian.HoeherGewinnt;

public class Karte {

	
	private Farbe farbe;
	private Symbol symbol;
	
	
	public Karte(Farbe farbe, Symbol symbol) {
		super();
		this.farbe = farbe;
		this.symbol = symbol;
	}


	public Farbe getFarbe() {
		return farbe;
	}


	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}


	public Symbol getSymbol() {
		return symbol;
	}


	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
	
	
	

}
