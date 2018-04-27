package Botteghini;

import Eccezioni.PrenotazioniException;

public class Botteghino {
	
	private int postiLiberi;
	
	public Botteghino() {
		this.postiLiberi = 100;
	}

	public void prenota() throws PrenotazioniException{
		if(this.postiLiberi == 0) {
			throw new PrenotazioniException();
		}
		
		this.postiLiberi--;
	}
	
	
	public int getPostiLiberi() {
		return this.postiLiberi;
	}
}
