import java.awt.Color;
import java.util.Random;

public class Brouillon {
	
	public Color[] choixCode(int nbTrous, int nbCoul) {
		Random rand = new Random();
		Color[] codeSecret = new Color[nbTrous];
		for (int i=0; i<nbTrous; i++) {
			int iCouleur = rand.nextInt(nbCoul);
			codeSecret[i]=this.modl.COULEUR[iCouleur];
		}
		return codeSecret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	}
	
	

}
