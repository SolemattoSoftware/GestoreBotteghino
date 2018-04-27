package Eccezioni;

public class PrenotazioniException extends Exception {



	public PrenotazioniException() {
		super("Errore nella prenotazione");
	}
	
	@Override
	public String toString() {
		return this.getMessage() + ": posti esauriti!";
	}
}
