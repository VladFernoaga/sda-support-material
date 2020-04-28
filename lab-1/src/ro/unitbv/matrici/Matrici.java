package ro.unitbv.matrici;

public class Matrici {

	public static void main(String[] args) {

	}

	
	// 1. Ce este o matrice
	// 2. Cum declaram o matrice
	// 3. Unde avem nevoie de siruri-multi dimenasionale
	// 4. algoritmi de baza

	// Sir de date bi-dimensional

	int mat1[]; // sir de date uni-dimensional
	int mat2[][] = new int[4][3]; // sir de date bi-dimensional
	int mat3[][][] = new int[4][4][3]; // sir tri-dimensional
	// ...
	int mat5[][][][][] = new int[3][4][5][3][3];
	
	
	// Use-cases
	// Liste - table
	
	// Imagini - Reprezentarea imaginilor in mod digital
	//
	// Sa reprezinti imagine alb-negru in digital
	// Valori de 0 - 255 intr-o matrice 
	//  
	//
	// - Proceasari de imagine: 
	//		- Functii de auto-correct - opertii/ algoritmi pe matrici 
	//      - Functia de filter din Instragram  - opertii/ algoritmi pe matrici 
	//      - Recunoastere de imagini/ face recognition - opertii/ algoritmi pe matrici
	//      - Recunoasterea de obiecte din imagie 
	// - OpenCV https://opencv.org/
	
	
	// Statisica - Big Data
	// - proprietati
	// Prezicerea pretului unei locuinte in functie de locatie si metri patrati
	// - Predictile se fac pe mai mult de 2 parametri 
	
	// Machine Learning/ Deep learning 
	// Algoritmi de regresie/ clustering ... date sunt reprezentate ca si tablouri multi dimensionale
	// Deep Learging - acealsi lucru 
	//	- Retele convolutionale ( retele specializate pe imagini) - imagini reprezentate ca si 
	//		matrici si operatii pe ele 
	
	
	// Algoritmi de baza
	// - inmultirea sirurilor bi dimensionale
	// - adunari
	// - parcurgeri partiale ( partrea superioara,inferioara - diagonalei prinicpale)
	// - parcurgeri si aplicari de filtre peste siruri bi-dimensionale 
}
