package fr.formation.inti.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		


		
			Point a;
			Scanner sc = null;
			try {
				sc = new Scanner(System.in);
				System.out.println("Entrer x :");
				int x = sc.nextInt();
				System.out.println("Entrer y :");
				int y = sc.nextInt();
				
				a = new Point(x, y);
				a.affiche();
				a.deplace(-5, 5);
				a = new Point(-3, 5);
				a.affiche();
			} catch (ErrConstr e) {
				System.out.println("Erreur de construction "+e.x+","+e.y);
				
			} 
			catch (ErrDep e) {
				System.out.println(e.getMessage());
			}			
			finally {
				System.out.println(" scanner ferme ");
				sc.close();
			}
			
			
		
		System.out.println("fin programme");
	}

}
