package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "kombucha", 54);
		humain.direBonjour();
		humain.acheter("boisson", 12);
		humain.perdreArgent(12);
		humain.boire();
		humain.acheter("jeu", 2);
		humain.perdreArgent(2);
		humain.acheter("kimono", 50);
	}

}
