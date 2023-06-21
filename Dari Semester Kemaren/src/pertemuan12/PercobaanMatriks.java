package pertemuan12;

import java.util.Scanner;

public class PercobaanMatriks {

	static void IsiMatriks(int[][] a, int b, int k) {// b = baris, k = kolom
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMembaca nilai input");
		for (int i = 1; i < b; i++) {
			for (int j = 1; j < k; j++) {
				System.out.print("Elemen ke [" + i + "," + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		int[][] Matriks;
	}

}
