package pertemuan11;

import java.util.Scanner;

public class OperasiDuaMatrik {

	static void PenjumlahanMatrik(MatriksInt1 C, MatriksInt1 A, MatriksInt1 B) {
		int x;
		System.out.println("Tampil Isi matrik ke layar");
		for (int i = 0; i < A.N; i++) {
			for (int j = 0; j < A.M; j++) {
				x = A.GetElement(i, j) + B.GetElement(i, j);
				C.SetElement(i, j, x);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MatriksInt1 A = new MatriksInt1();
		MatriksInt1 B = new MatriksInt1();
		MatriksInt1 C = new MatriksInt1();

		A.IsiMatriks();
		A.TulisMatriks();
		B.IsiMatriks();
		B.TulisMatriks();
		PenjumlahanMatrik(C, A, B);
	}
}
