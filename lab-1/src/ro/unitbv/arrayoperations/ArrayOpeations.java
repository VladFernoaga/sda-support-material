package ro.unitbv.arrayoperations;

public class ArrayOpeations {

	public static void main(String[] args) {
		search();
		modifications();
	}
	
	
	private static void search() {
		
		int[] numbers = {1,5,7,8,32, 64, 57, 21 ,56 ,75, 12};
		
		// Sa se gaseasca numarul cu valoare 7
		// getObjectBy(...)
		// find(criteria)
		
		// 1. Mod iterativ in O(n)
		// Best case si Worst case O(n)
		
		for(int nr : numbers) {
			if(nr == 7) // compararea sa fie una time-consuming
			{ 
				System.out.println("Valoare a fa fost gasita");
			}
		}
		
		// 2. Mod iterativ cu iesire imediata
		// - este de ajuns sa gasim primul element care respecta conditia
		// Best case O(1) si Worst case O(n)
		for(int nr : numbers) {
			if(nr == 7) // compararea sa fie una time-consuming
			{ 
//				return nr;
				System.out.println("Valoare a fa fost gasita");
				break;
			}
		}
		
		// 3. Cautarea binara
		// - Pleaca de la premisa ca sirul este ordonat crescator.
		// - Incepe cautarea de la mijloc si se intreba daca valoare cautata este mai mare sau mai 
		//   mica decat mijlocul.
		// - Daca valoare este mai mica, atunci cautarea va continua doar in sub sirul din stanga
		// - Daca valoare este mai mare decat mijlocul, atunci cautarea va continua doar in sub sirul din dreapta.
		
		
		
		// 4. Caturarea bazata pe index
		// Pentru a obtine perormanta si scalabilite ( sa mearga la bine si pentru 10 elemente dar si pentru 1000)
		// conteaza structura de data pe care o alegeti 
		
		// Daca folositi o lista inlantuita complexitatea de cautare pe index va fi O(n)
		
	}

	private static void modifications() {
		// 1. adugarea intr-un element intr-o lista bazata pe un unmutable list ( siruri in zona continue de memorie)
		// ArrayList-ul
		// a. crearea unui noi liste cu o capacitate mai mare
		// b. copiem toate elementele vechi in array-ul nou
		// c. adaugam elementul nou
		
		// In ArrayList modificarile su nt scumpe
		
		// 2. Listesle inlantuite 
		// LinkedList
		// Adaugare, stergerea si in general orice modificare este ieftina 
	}
}
