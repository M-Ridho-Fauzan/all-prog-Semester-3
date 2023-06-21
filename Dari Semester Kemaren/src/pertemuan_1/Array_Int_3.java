package pertemuan_1;

import java.util.Scanner;

public class Array_Int_3 {
	
	int N = 5;//5 ini ukuran jumlah array
	int []a = new int[N];
	
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
			System.out.print("Elemen ke " + i + " : ");
			a[i] = sc.nextInt();
		}
	}
	
	void TampilArray() {
		System.out.println("\nTampil Array");
		for (int i = 0; i < N; i++) {
			System.out.println("Elemen ke " + i + " : " + a[i]);	
		}
	}
	
//	boolean MencariX(int x) {
//		int i = 0;
//		while (i < N && a[i] != x) {
//			i++;
//			if (a[i] == x ) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//	}
	
	boolean MencariX (int x) {
		int i = 1;
		while ((i < N) && (a[i] != x)) {
			i = i + 1;
		}
		if (a[i] == x ) {
			return true;
		} else {
			return false;
		}
	}
	
	int MencariX2 (int x) {
		int i = 0;
		while (i < N - 1  && a[i] != x) {
			i++;	
		}
		if (a[i] == x ) {
			return i;
		} else {
			return -1;
		}
	}
	//N disini isinya 5
	// sedangkan x nilai yang di input
	boolean MencariX3 (int x) {
		int i = 0;
		boolean ketemu = false;
		while (i < N - 1  && a[i] != x) {
			i++;		
		}
		if (a[i] == x ) {
			return true;
		} else {
			return ketemu;
		}
	}
		// System.out.println("i keluar dari loop: " + i);

	
  //Prosedur
//	void MencariRataRata() {
//		System.out.println("\nMencari Rata-Rata");
//		int sum = 0;
//		double avg = 0;
//		for (int i = 0; i < N; i++) {
//			sum += a[i];
//		}
//		avg = (double) sum / N;
//		System.out.println("Rata-rata: " + avg);
//	}
	
//	==============Percobaan++++++++++++++++++
	
	int search(int x) {
		int i;
		for( i = 0; i < N; i++ ) {
			if( a[i] == x ) {
				return 1;
			} 
		}
		return -1;
	}
	
	
	
	
	
  // ---------========= Fungsi syntax mencari rata2
	
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
	
	public static void main(String[] args) {
		Array_Int_3 B = new Array_Int_3();
		
//		B.InitArray();
//		B.TampilArray();
		B.IsiArray();
		B.TampilArray();
		
		
//		System.out.println("\nMembaca nilai input");
//		Scanner sc= new Scanner(System.in);
//		System.out.println("nilai yang di cari");
//		int x = sc.nextInt();
//		B.MencariX(x);
//		if( x != -1 )
//			System.out.println("Nilai yang dicari yaitu " + x + ".") ;
//	}
		System.out.println("Mencari nilai dalam array ");
		Scanner sc= new Scanner(System.in);
		int ix;
		int x;
		boolean ketemu;
		for ( int i = 0; i < 3; i++ ) {
			System.out.println("Masukan Nilai yang ingin di cari: ");
			x = sc.nextInt();
			ketemu = B.MencariX3(x);
			if ( ketemu == true ) {
				System.out.println("nilai " + x + " ada di index " + ketemu );
			} else {
				System.err.println("Nilai tidak ada di array!");
			}
//			System.out.println(ketemu);
			}
//		System.out.println("Nilai yang di cari :");
//		x = sc.nextInt();
//		int k = B.search(x);
//		if ( k != -1 ) {
//			System.out.println("nilai " + x + " ada di index " + k );
//		} else {
//			System.err.println("Nilai tidak di temukan");
//		}
		}	
	}

