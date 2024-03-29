package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;

	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);

	}

	public void boire() {
		parler("Mmmmmm , un bon verre de " + boissonFavorite + " ! GLOUPS");
	}

	private int gagnerArgent(int gain) {
		return this.argent += gain;

	}

	public int perdreArgent(int perte) {
		return this.argent -= perte;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}

	public void acheter(String bien, int prix) {
		if (this.argent > prix) {
			parler("J'ai " + argent + " sous en poche " + " je vais pouvoir m'offrire " + bien + " à " + prix
					+ " sous");

		} else {
			parler("Je n'ai plus que " + argent + " sous en poche.Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + " sous");

		}
	}
}
