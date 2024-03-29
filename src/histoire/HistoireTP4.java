package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "kombucha", 54);
		humain.direBonjour();
		humain.parler("j'ai" + humain.getArgent() + " sous en poche Je vais pouvoir m'offrire une boisson à "
				+ humain.acheter(12) + " sous");
		humain.boire();
		humain.parler("j'ai " + humain.perdreArgent(humain.acheter(12))
				+ " sous en poche.Je vais pouvoir m'offrire un jeu à " + humain.acheter(2) + " sous");
		humain.parler("Je n'ai plus que" + humain.perdreArgent(humain.acheter(2))
				+ "sous en poche.Je ne peux pas m'offrire un kimono à 50 sous");

	}

}
