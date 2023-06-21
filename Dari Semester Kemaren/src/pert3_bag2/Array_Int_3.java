package pert3_bag2;

import java.util.Scanner;

public class Array_Int_3 {
	
	int N = 5;
	int [] a = new int[N];
	
	Scanner sc = new Scanner(System.in);

	void InitArray() {
		System.out.println("Inisialisasi Array");
		for (int i = 0; i < N; i++) {
			a[i] = i;	
		}
	}
	
	void IsiArray() {
		System.out.println("\nMembaca nilai input");
		for (int i = 0; i < N; i++) {
			System.out.print("Elemen ke " + i + ": ");
			a[i] = sc.nextInt();
		}
	}
	
  void TampilArray() {
		System.out.println("\nTampil Array");
		for (int i = 0; i < N; i++) {
			System.out.println("Elemen ke " + i + ": " + a[i]);	
		}
	}
	
  //Prosedur
	void MencariRataRata() {
		System.out.println("\nMencari Rata-Rata");
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < N; i++) {
			sum += a[i];
		}
		avg = (double) sum / N;
		System.out.println("Rata-rata: " + avg);
	}
	
  //Fungsi
	/*double MencariRataRata(double ukuran) {
		System.out.println("\nMencari Rata-Rata");
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < ukuran; i++) {
			sum += a[i];
		}
		avg = (double) sum / ukuran;
		System.out.println("Rata-rata: " + avg);
		return avg;
	}*/
//	================Fungsi search
	int MencariX ( int x ) {
		int ix = -1;
		int i;
		
		for ( i = 0; i < N; i++ ) {
			if ( a[i] == x ) {
				ix = i;
			}
		}
//		System.out.println("Keluar loop = " + i);
		return ix;
	}
	
	public static void main(String[] args) {
		Array_Int_3 B = new Array_Int_3();
		
		B.InitArray();
		B.TampilArray();
		B.IsiArray();
		B.TampilArray();
//		B.MencariRataRata();
//		---------------menampilkan index yang di inginkan (fungsi search)
		System.out.println("Mencari nilai dalam array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("nilai yang di cari ");
		int x = sc.nextInt();
		int k = B.MencariX(x);
		if( k != -1 ) {
			System.out.println("nilai " + x + " ada di element " + k );
		} else {
			System.err.println("404 NOT Pound!!!");
		}
	
		//B.MencariRataRata(5);
	}
}
