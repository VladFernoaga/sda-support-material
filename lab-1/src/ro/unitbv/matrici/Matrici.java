package ro.unitbv.matrici;

public class Matrici {

	public static void main(String[] args) {
		imultireMatrici();
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
	// - Functii de auto-correct - opertii/ algoritmi pe matrici
	// - Functia de filter din Instragram - opertii/ algoritmi pe matrici
	// - Recunoastere de imagini/ face recognition - opertii/ algoritmi pe matrici
	// - Recunoasterea de obiecte din imagie
	// - OpenCV https://opencv.org/

	// Statisica - Big Data
	// - proprietati
	// Prezicerea pretului unei locuinte in functie de locatie si metri patrati
	// - Predictile se fac pe mai mult de 2 parametri

	// Machine Learning/ Deep learning
	// Algoritmi de regresie/ clustering ... date sunt reprezentate ca si tablouri
	// multi dimensionale
	// Deep Learging - acealsi lucru
	// - Retele convolutionale ( retele specializate pe imagini) - imagini
	// reprezentate ca si
	// matrici si operatii pe ele

	// Algoritmi de baza
	// - inmultirea sirurilor bi dimensionale
	// - adunari
	// - parcurgeri partiale ( partrea superioara,inferioara - diagonalei
	// prinicpale)
	// - parcurgeri si aplicari de filtre peste siruri bi-dimensionale

	static void imultireMatrici() {

		int mat1Row = 3;
		int mat1Col = 2;

		int mat2Row = 2;
		int mat2Col = 4;

		double[][] mat1 = { new double[] { 1d, 5d }, new double[] { 2d, 3d }, new double[] { 1d, 7d } };
		double[][] mat2 = { new double[] { 1d, 2d, 3d, 7d }, new double[] { 5d, 2d, 8d, 1d } };
		double rezulatat[][] = new double[mat1Row][mat2Col];

		for (int i = 0; i < mat1Row; i++) {
			for (int j = 0; j < mat2Col; j++) {
				double res = 0;

				for (int ii = 0; ii < mat2.length; i++) {
					res += mat1[i][ii] * mat2[ii][j];
			    }
				rezulatat[i][j] = res;
			}
		}
		
		// tiparim
		displayMat(rezulatat);
		
	}
	

    public static void displayMat(double[][] product) {
        for(double[] row : product) {
            for (double column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

	static void parcurgeriMatrici() {

	}

}
