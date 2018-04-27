import Botteghini.Botteghino;
import Eccezioni.PrenotazioniException;

public class GestoreBotteghino {

	public static void main(String[] args) {

		Botteghino botteghino = new Botteghino();

		try {
			for (int index = 1; index <= 1; index++) {
				botteghino.prenota();
				System.out.println("Prenotato posto n° " + index);
			}

			
		} catch (PrenotazioniException exc) {
			System.out.println(exc);
		} finally {
			System.out.println("Posti rimasti: " + botteghino.getPostiLiberi());
		}
	}

}
