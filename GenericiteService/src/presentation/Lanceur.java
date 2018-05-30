package presentation;

import domaine.Personne;
import service.PersonneImpl;

public class Lanceur {

	public static void main(String[] args) {
		
		Personne p = new Personne(1, "zec", "union",19);
		PersonneImpl<Personne> pi = new PersonneImpl();
		pi.ajouter(p);

		pi.affiche(pi.listerTout());
	}

}
