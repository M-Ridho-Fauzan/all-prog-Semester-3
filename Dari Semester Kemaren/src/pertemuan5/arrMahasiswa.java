package pertemuan5;

import java.util.Scanner;

public class arrMahasiswa {
	Scanner sc = new Scanner(System.in);
	int N = 3;
	Mahasiswa[] a = new Mahasiswa[N];

	void InitArray() {
		System.out.println("1. Init");
		for (int i = 0; i < N; i++) {
			Mahasiswa R = new Mahasiswa();
			R.nrp = "";
			R.nama = "$";
			R.ipk = 4;
			R.pin = "";
			a[i] = R;
		}
	}

	void IsiArray() {
		System.out.println("\n2. Isi");
		for (int i = 0; i < N; i++) {
			System.out.println("Elemen ke: " + i);
			a[i].BacaMahasiswa();
		}
	}

	void TulisArray() {
		System.out.println("\n3. Tulis");
		for (int i = 0; i < N; i++) {
			a[i].TulisMahasiswa();
		}
	}

	Mahasiswa GetElemen(int i) {
		return a[i];
	}

	void SetElemen(int i) {
		a[i].BacaMahasiswa();
	}

	int MencariX(String x) {
		int ix = -1;

		for (int i = 0; i < N; i++) {
			if (a[i].nrp.equals(x)) {
				ix = i;
				break;
			}
		}

		return ix;
	}

	int login() {
		int ulang = 1;
		int ix = -1;
		do {
			System.out.println("Masukkan NRP: ");
			String norekS = sc.next();
			System.out.println("Masukkan PIN: ");
			String pass = sc.next();
			for (int i = 0; i < N; i++) {
				if (a[i].nrp.equals(norekS) && a[i].pin.equals(pass))
					ix = i;
			}
			ulang++;
		} while (ix == -1 && ulang < 3);
		return ix;
	}

	void UbahNamaElement(String x, String nmbaru) {
		int k = MencariX(x);
		if (k != -1)
			a[k].nama = nmbaru;
		else
			System.out.println("Tidak ada dalam array");
	}

	public static void main(String[] args) {
		arrMahasiswa A = new arrMahasiswa();
		Scanner sc = new Scanner(System.in);

		A.InitArray();
		A.TulisArray();
		A.IsiArray();
		A.TulisArray();

		int i = 2;
		Mahasiswa T = A.GetElemen(i);
		T.TulisMahasiswa();

		System.out.println("Masukkan NRP yang ingin diubah: ");
		String x = sc.next();
		System.out.println("Masukkan nama baru: ");
		String nmbaru = sc.next();
		A.UbahNamaElement(x, nmbaru);
		A.TulisArray();

		int y = A.login();
		if (y != -1) {
			System.out.println("Berhasil login");
			// A.TarikTunai(y);
		} else {
			System.err.println("Password atau NRP salah!");
			A.TulisArray();
		}
	}
}

////  coment dari sini
//
//import java.util.Scanner;
//
//public class arrMahasiswa {
//	Scanner sc = new Scanner(System.in);
//	int N = 3;
//	Mahasiswa[] a = new Mahasiswa[N];
//
//	void InitArray() {
//		System.out.println("1. Init");
//		for (int i = 0; i < N; i++) {
//			Mahasiswa R = new Mahasiswa();
//			R.nrp = "";
//			R.nama = "$";
//			R.ipk = 4;
//			R.pin = "";
//			a[i] = R;
//		}
//	}
//
//	// -----------------------
//
//	void IsiArray() {
//		System.out.println("\n2. Isi");
//		for (int i = 0; i < N; i++) {
//			System.out.println("Elemen ke :" + i);
//			a[i].BacaMahasiswa();
//
//		}
//	}
//
//	void TulisArray() {
//		System.out.println("\n. Tulis");
//		for (int i = 0; i < N; i++) {
//			a[i].TulisMahasiswa();
//
//		}
//	}
//
//	Mahasiswa GetElemen(int i) {
//		Mahasiswa R = new Mahasiswa();
//		R = a[i];
//		return R;
//	}
////		-----------------fungsi ubah
//
//	void SetElemen(int i) {
//		a[i].BacaMahasiswa();
//	}
//
////		------------------akhir fungsi ubah
//
//	int MencariX(String x) {
//		int ix = -1;
//
//		for (int i = 0; i < N; i++) {// equals artinya =(sama dengan)
//			if (a[i].nrp.equals(x) == true) {
//				ix = i;
//			}
//		}
//
//		return ix;
//	}
//
////=== === ===== = ==== ====== ========= ===============
//
//	int login() {
//		Scanner sc = new Scanner(System.in);
//		int ulang = 1;
//		int ix;
//		do {
//
//			System.out.println("masukan norek : ");
//			String norekS = sc.next();
//			String pass = sc.next();
//			int ix = -1;
//			for (int i = 0; i < N; i++) {
//				if (a[i].nrp.equals(norekS) && a[i].pin.equals(pass))
//					ix = i;
//			}
//			ulang = ulang + 1;
//		} while (ix == -1 && ulang < 3);
//		return ix;
//	}
//
////======================== ====== =   ==============
//
////		void TarikTunai(int i) {
////			Scanner sc = new Scanner(System.in); 
////			System.out.println("Tunai yang ingin di ambil: ");
////			float besar = sc.nextFloat();
////			a[i].saldo = a[i].saldo - besar;
////			
////		}
//
////======== =============  ==     ======= = =======		
//	void UbahNamaElement(String x, String nmbaru) {
//		int k;
//
//		k = MencariX(x);
//		if (k != -1)
//			a[k].nama = nmbaru;
//		else
//			System.out.println("tydak ada dalam array");
//
//	}
//
//	public static void main(String[] args) {
////		Mahasiswa R;
//		arrMahasiswa A = new arrMahasiswa();
//
//		A.InitArray();
//		A.TulisArray();
//		A.IsiArray();
//		A.TulisArray();
//
//		int i;
//		i = 2;
//		Mahasiswa T = new Mahasiswa();
////		T = A.GetElemen(i);
////		T.TulisMahasiswa();
//
//		System.out.println("nilai yang di cari ");
//		String x = sc.next();
//		A.UbahNamaElement(x);
//		A.TulisArray();
////		---------------menampilkan index yang di inginkan (fungsi search)
////		System.out.println("Mencari nilai dalam array ");
////		Scanner sc = new Scanner(System.in);
////		System.out.println("nilai yang di cari ");
////		String x = sc.next();
////		int k = A.MencariX(x);
////		if( k != -1 ) {
////			System.out.println("nilai " + x + " ada di element " + k );
////			T = A.GetElemen(k);
////			T.TulisMahasiswa();
////		} else {
////			System.err.println("404 NOT Pound!!!");
//
//		int y = A.login();
//		if (y != -1) {
//			System.out.println("bla" + "kljljljlasj" + y);
//			A.TarikTunai(y);
//		} else {
//			System.err.println("pass atau id salah!!!!");
//			A.TulisArray();
//		}
//
//	}
//}
////		System.out.println("Elemen ke " + i + ": " + a[i].nrp + ", " + a[i].nama + ", " + a[i].ipk );
//
////		System.out.println("Mengubah data");
//
////		System.out.println("Mengubah elemen ke " + i);
////		T = A.setElement(i);
////		T.TulisMahasiswa();
////		A.TulisArray();
////		========++++++++++++++++++++++++Saat ingin merubah kata 
////		===================+++++++++++++     block tulisannya, lalu -->ctrl + f
//
//
//// sampe sini
