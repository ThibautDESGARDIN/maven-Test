package fr.formation.inti.exceptions;

import java.util.Scanner;

// Réaliser une classe EntNat permettant de 
// manipuler des entiers naturels (positifs ou nuls). 
// Pour l’instant, cette classe disposera simplement : 
//	 1_ d’un constructeur à un argument de type int qui générera 
//	 une exception de typeErrConst (type classe à définir) 
//	 lorsque la valeur reçue ne conviendra pas, 
//	
//	 2_ d’une méthode getN fournissant sous forme d’un int, 
//	 la valeur encapsulée dans un objet de type EntNat.
//	
// Écrire un petit programme d’utilisation qui traite l’exception ErrConst 
// en affichant un message et en interrompant l’exécution.

public class EntNat {

	
	private int N;
	public EntNat(int N) throws ErrConst {
		
			if (N < 0) {
				throw new ErrConst(N);
			} 
				this.N=N;
			}
		
		
	
	
	public int getN() {
		return N;
	}

}

