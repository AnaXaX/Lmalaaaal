import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Personne personne1 = new Personne("BOUDYACH", "Anas", 24); 
		//System.out.println(personne1.toString());
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nBonjour et bienvenu dans mon menu");
			System.out.println("1 - Jouer à ghomayda");
			System.out.println("2 - Equation deuxième degret");
			System.out.println("3 - Try to find the numer you have only 5 tries");
			System.out.println("0 - Exit/ Quitter");
		} while(sc.nextInt() != 0);
	}

}
