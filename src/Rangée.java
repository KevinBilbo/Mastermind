import java.awt.Color;

public class Rangée {
	
	Color[] jetons;
	int indiceJeton;
	int[] resultat = new int[2];
	

	public Rangée() {
		Modele modl = new Modele();
		
		this.jetons = new Color[modl.DIFFICULTE];

	public Rangée(int diff) {

		
		this.jetons = new Color[diff];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
