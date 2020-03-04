package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Scanner scanner = new Scanner(System.in);
		
		// afiseaza mesajul in consola
		System.out.println("Introdu nr 1: ");
		int nr1 = scanner.nextInt();
		System.out.println("Introdu nr 2: ");
		int nr2= scanner.nextInt();
		
		
		System.out.println("Suma: "+nr1+nr2);
		System.out.println("Suma: "+String.valueOf(nr1)+String.valueOf(nr2));

		System.out.println("Suma: "+ (nr1+nr2));
		
		double impartie = (double)nr1 /nr2;
		int impartieInt = nr1 /nr2;
		System.out.println("Impartie: "+ impartie);
		System.out.println("ImpartieInt: "+ impartieInt);
		// afisam output-ul
		System.out.println("numarul citit este: "+nr1);
	
	}

}
