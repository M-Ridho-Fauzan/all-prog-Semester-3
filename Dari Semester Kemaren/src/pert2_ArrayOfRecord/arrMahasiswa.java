package pert2_ArrayOfRecord;

import java.util.Scanner;

public class arrMahasiswa {
	Scanner sc = new Scanner(System.in);
		int N = 3;
		Mahasiswa []a = new Mahasiswa[N];
		
//		void InitArray() {
//			System.out.println("Inisialisasi Array");
//			for (int i = 0; i < N; i++) {
//				a[i].nrp = "";
//				a[i].nama = "sa"; bila menggunakan ini, akan error
//				a[i].ipk = 0;
//			}
//		}
		//-----------------------
		
		void InitArray() {
			System.out.println("1. Init");
			for (int i = 0; i < N; i++) {
				Mahasiswa R = new Mahasiswa();
				R.nrp = "";
				R.nama = "santi";
				R.ipk = 4;
				a[i] = R;
			}
		}
		
		//-----------------------
	
		void IsiArray() {
			System.out.println("\n2. Isi");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < N; i++) {
				System.out.println("Elemen ke :" + i);
				a[i].BacaMahasiswa();
				
//				System.out.print("Elemen ke " + i + ": ");
//				System.out.println("NRP :");
//				a[i].nrp = sc.next();
//				System.out.println("Nama :");
//				a[i].nama = sc.next();
//				System.out.println("IPK :");
//				a[i].ipk = sc.nextFloat();
			}
		}
		
		void TulisArray() {
			System.out.println("\n3. Tulis");
			for (int i = 0; i < N; i++) {
				a[i].TulisMahasiswa();
				
//				System.out.println("Elemen ke " + i  );
//				System.out.println("NRP : " + a[i].nrp  );
//				System.out.println("Nama : " + a[i].nama );
//				System.out.println("IPK : " + a[i].ipk );
//				System.out.println("----------------------");
			}
		}
		
		Mahasiswa GetElemen(int i) {
			Mahasiswa R = new Mahasiswa();
			R = a[i];
			return R;
		}
//		-----------------fungsi ubah
		
//		Mahasiswa setElement(int i) {
//			Mahasiswa U = new Mahasiswa();
//			U = a[i];
//			U.BacaMahasiswa();
//			return U;
//		}
		
//		V2
//		Mahasiswa setElement(int i) {
//			Mahasiswa R = new Mahasiswa();
//			System.out.println("--fusi ubah--");
//			R = a[i];
//			R.BacaMahasiswa();
//			Return R;
//		}
		
//		------------------akhir fungsi ubah
	public static void main(String[] args) {
//		Mahasiswa R;
		arrMahasiswa A = new arrMahasiswa();
		
//		System.out.println("cek");
		
		A.InitArray();
		A.TulisArray();
		A.IsiArray();
		A.TulisArray();
		
		int i;
		i = 2;
		Mahasiswa T = new Mahasiswa();
		T = A.GetElemen(i);
		T.TulisMahasiswa();
//		System.out.println("Elemen ke " + i + ": " + a[i].nrp + ", " + a[i].nama + ", " + a[i].ipk );
		
		
		System.out.println("Mengubah data");
		
		
		
//		System.out.println("Mengubah elemen ke " + i);
//		T = A.setElement(i);
//		T.TulisMahasiswa();
//		A.TulisArray();
		
	}
}
