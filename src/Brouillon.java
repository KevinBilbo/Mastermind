import java.awt.Color;
import java.util.Random;

public class Brouillon {
	
	public Color[] choixCode(int nbTrous, int nbCoul) {
		Random rand = new Random();
		Color[] codeSecret = new Color[nbTrous];
		for (int i=0; i<nbTrous; i++) {
			int iCouleur = rand.nextInt(nbCoul);
			codeSecret[i]=Modele.COULEURS[iCouleur];
		}
		return codeSecret;
	}
	
	public int[] evaluerProposition(Color[] P, Color[] S, int nbCoul) {
		int nb=P.length;
		int noir=0;
		
		for (int i=0; i<nb; i++) {
			if (P[i]==S[i]) {
				noir++;
			}
		}
		
		int blanc = -noir;
		
		for (int i=0; i<nbCoul; i++) {
			int n=0;
			int m=0;
			for (int j=0; j<nb; j++) {
				if (S[j]==this.COULEUR[i]) {
					n+=1;
				}
				if (P[j]==this.COULEUR[i]) {
					m+=1;
				}
			}
			if (n<m) {
				blanc+=n;
			} else {
				blanc+=m;
			}
		}
		
		int[] result = {noir, blanc};
		
		return result;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	}
	
	

}
