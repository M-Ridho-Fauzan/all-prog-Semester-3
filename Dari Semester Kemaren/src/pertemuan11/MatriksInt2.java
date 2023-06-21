package pertemuan11;

import java.util.Scanner;

public class MatriksInt2 {
	int N = 2;
	int M = 3;
	int[][] a = new int[N][M];

//===========================            INIT +++

	void InitMatriks() {
		System.out.println("Inisialisasi Matriks ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				a[i][j] = i;
			}
		}
	}

//============================            ISI +++

	void IsiMatriks() {
		System.out.println("Baca nilai dari keyboard");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.println("Element ke " + i + ": " + a[i]);
			}
		}
	}

//============================            TULIS +++

	void TulisMatriks() {
		System.out.println("Tampil isi Matrik kelayar");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.println(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

//===========================	          SUM_BARIS	+++

	void SumBaris() {
		int Sum;
		System.out.println("Tampil Isi matrik ke layar");
		for (int i = 0; i < N; i++) {
			Sum = 0;
			for (int j = 0; j < M; j++) {
				Sum = Sum + a[i][j];
			}
			System.out.println("Jumlah Di baris ke " + i + " =" + Sum);
		}
	}

//===========================              END  +++

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MatriksInt2 B = new MatriksInt2();
		B.InitMatriks();
		B.TulisMatriks();
		B.IsiMatriks();
		B.TulisMatriks();
	}
}
