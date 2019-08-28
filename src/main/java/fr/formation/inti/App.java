package fr.formation.inti;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("entrez nom :");
        String nom = sc.nextLine();
        System.out.println("entrez age: ");
        int age2 = sc.nextInt();
        System.out.println("fin ");
    }
}
