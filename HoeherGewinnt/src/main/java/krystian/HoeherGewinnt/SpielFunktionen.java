package krystian.HoeherGewinnt;

import java.util.List;

public interface SpielFunktionen {

	/**
	 * Diese Methode erstellt ein Kartendeck mit 52 Karten.
	 * @return Kartendeck (Liste mit 52 Karten).
	 */
	List<Karte> kartendeckErstellen();
	
	/**
	 * Diese Methode mischt ein Kartendeck.
	 * @param kartendeck
	 * @return gemischtes Kartendeck
	 */
	List<Karte> kartendeckMischen(List<Karte> kartendeck);
	
	
	/**
	 * Mit dieser Methode werden Karten an alle Spieler verteilt.
	 * @param spielerRunde Spieler an die verteilt werden soll.
	 */
	void kartenVerteilen(List<Spieler> spielerRunde);
	
	
	
	/**
	 * Mit dieser Methode wird die Karte ausgesucht die der Spieler legen moechte.
	 * @param handkarten Handkarten des Spielers.
	 * @return Zu legende Karte.
	 */
	Karte karteLegen(List<Karte> handkarten);
	
	
	/**
	 * Mit dieser Methode hebt der Gewinner der Runde die Karten auf.
	 * @param gewinnerHandkarten Handkarten des Spielers, der die hoechste Karte gelegt hat.
	 * @param ablagestapel Die gelegten Karten einer Runde.
	 */
	void kartenAufheben(List<Karte> gewinnerHandkarten,List<Karte> ablagestapel);
	
	
	/**
	 * Methode zur Feststellung, welche Karte gewonnen hat.
	 * @param ablagestapel
	 * @return hoechste Karte der Runde.
	 */
	Karte hoechsteKarteFeststellen(List<Karte> ablagestapel);
	
	
	/**
	 * Methode zur Durchfuehrung vom Stechen.
	 * @param spieler Spieler die am Stechen teilnehmen.
	 * @param ablagestapel
	 * @return Spieler, der das Stechen gewonnen gat.
	 */
	Spieler stechenDurchfuehren(List<Spieler> spieler, List<Karte> ablagestapel);
	
	
	
	/**
	 * Methode um zu checken ob der Spieler noch Karten auf der Hand haelt.
	 * @param handkarten
	 * @return True wenn Handkarten vorhanden/False wenn keine Handkarten vorhanden.
	 */
	boolean anzahlKartenChecken(List<Karte> handkarten);
	
	
	/**
	 * Methode zum rausschmeissen von Spielern, die keine Karten mehr auf der Hand haben.
	 * @param loser Spieler der keine Karten mehr auf der Hand haelt.
	 * @param spielerRunde Alle Spieler der Spielrunde.
	 */
	void spielerKicken(Spieler loser, List<Spieler> spielerRunde);
	
	
	/**
	 * Methode um zu checken ob ein Spieler die benoetigten Punkte um zu gewinnen, gesammelt hat.
	 * @param spielerRunde
	 * @return null wenn noch kein Gewinner vorhanden/ Spieler wenn Gewinner vorhanden.
	 */
	Spieler punkteChecken(List<Spieler> spielerRunde);
	
}
