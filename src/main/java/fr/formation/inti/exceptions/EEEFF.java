package fr.formation.inti.exceptions;

import java.util.Scanner;

public class EEEFF {

	public static void main(String[] args) throws ErrConst {


		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
		int i=0;
		System.out.println("Entrez un entier positif ou nul");
		try {
			for (i = 5; i > -4; i--) {
//				int m = sc.nextInt();
				EntNat a = new EntNat(i);
				System.out.println("La valeur entrée est " + a.getN());
			}
		} catch (ErrConst e) {
			System.out.println(e.getErrSaisie());
			System.out.println("Fin programme");
			
		} finally {
			System.out.println("   -T"+i);
		}
		sc.close();
	}

}
