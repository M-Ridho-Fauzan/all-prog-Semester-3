package pertemuan3;

import java.util.Scanner;

public class arrMahasiswa {
	Scanner sc = new Scanner(System.in);
		int N = 3;
		Mahasiswa []a = new Mahasiswa[N];
		
		
		void InitArray() {
			System.out.println("1. Init");
			for (int i = 0; i < N; i++) {
				Mahasiswa R = new Mahasiswa();
				R.nrp = "";
				R.nama = "$";
				R.ipk = 4;
				a[i] = R;
			}
		}
		
		//-----------------------
	
		void IsiArray() {
			System.out.println("\n2. Isi");
			for (int i = 0; i < N; i++) {
				System.out.println("Elemen ke :" + i);
				a[i].BacaMahasiswa();
				
			}
		}
		
		void TulisArray() {
			System.out.println("\n. Tulis");
			for (int i = 0; i < N; i++) {
				a[i].TulisMahasiswa();
				
			}
		}
		
		Mahasiswa GetElemen(int i) {
			Mahasiswa R = new Mahasiswa();
			R = a[i];
			return R;
		}
//		-----------------fungsi ubah

		
		void SetElemen( int i ) {
			a[i].BacaMahasiswa();
		}
		

		
//		------------------akhir fungsi ubah
		
		int MencariX ( String x ) {
			int ix = -1;
			
			
			for ( int i = 0; i < N; i++ ) {//equals artinya =(sama dengan)
				if ( a[i].nrp.equals(x)==true) {
					ix = i;
				}
			}

			return ix ;
		}
		
		
	public static void main(String[] args) {
//		Mahasiswa R;
		arrMahasiswa A = new arrMahasiswa();
		
		
		A.InitArray();
		A.TulisArray();
		A.IsiArray();
		A.TulisArray();
		
		
		
		int i;
		i = 2;
		Mahasiswa T = new Mahasiswa();
		T = A.GetElemen(i);
		T.TulisMahasiswa();
		

//		---------------menampilkan index yang di inginkan (fungsi search)
		System.out.println("Mencari nilai dalam array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("nilai yang di cari ");
		String x = sc.next();
		int k = A.MencariX(x);
		if( k != -1 ) {
			System.out.println("nilai " + x + " ada di element " + k );
			T = A.GetElemen(k);
			T.TulisMahasiswa();
		} else {
			System.err.println("404 NOT Pound!!!");
		}

		
//		System.out.println("Elemen ke " + i + ": " + a[i].nrp + ", " + a[i].nama + ", " + a[i].ipk );
		
		
//		System.out.println("Mengubah data");
		
		
		
//		System.out.println("Mengubah elemen ke " + i);
//		T = A.setElement(i);
//		T.TulisMahasiswa();
//		A.TulisArray();
//		========++++++++++++++++++++++++Saat ingin merubah kata 
//		===================+++++++++++++     block tulisannya, lalu -->ctrl + f
	}
}
