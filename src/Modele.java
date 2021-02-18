import java.awt.Color;

public class Modele {
	public static Color[] COULEURS = {Color.green, Color.blue, Color.yellow, Color.magenta, Color.black, Color.white, Color.red, Color.orange };
	
	public static int N_TENTATIVES;
	
	public static int DIFFICULTE;
	
	public enum Etats {EN_COURS, GAGNE, PERDU};
	
	public Etats etat = Etats.EN_COURS;

	public Rangée combinaison = new Rangée();
	
	public Rangée[] propositions = new Rangée[Modele.DIFFICULTE];
	
	public int tentative;
	
	public void jeu(Etats etat, Rangée combinaison, Rangée[] propositions, int tentative) {
		this.combinaison = combinaison;
		this.propositions = propositions;
		this.tentative = tentative;
	}
	


}
