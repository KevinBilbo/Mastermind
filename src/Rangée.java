import java.awt.Color;

public class Rang�e {
	
	Color[] jetons;
	int indiceJeton;
	int[] resultat = new int[2];
	

	public Rang�e() {
		Modele modl = new Modele();
		
		this.jetons = new Color[modl.DIFFICULTE];

	public Rang�e(int diff) {

		
		this.jetons = new Color[diff];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
