package pertemuan6;

import java.util.Scanner;

public class ArrNasabah {
	int N = 1;
	Nasabah[] a = new Nasabah[N];
	Scanner sc = new Scanner(System.in);

	void InitArray() {// pendefinisian record
		for (int i = 0; i < N; i++) {
			Nasabah R = new Nasabah();
			R.norek = "";
			R.nama = "";
			R.pin = "";
			R.saldo = 0;
			a[i] = R;
			System.out.println("Elemen ke " + i + ": " + a[i].norek + ", " + a[i].nama + ", " + a[i].username + ", "
					+ a[i].pin + ", " + a[i].saldo);
		}
	}

	void IsiArray() { // input array dari keyboard
		for (int i = 0; i < N; i++) {
			System.out.println("---Elemen " + (i + 1));
			a[i].BacaNasabah();
		}
	}

	void TampilArray() {
		for (int i = 0; i < N; i++) {
			a[i].TulisNasabah();
		}
		System.out.println();
	}

	Nasabah getElement(int i) {
		Nasabah R = new Nasabah();
		System.out.println(" +++ Mengambil Data +++");
		R = a[i];
		return R;
	}

// ++++++++++++++++++++++ Fungsi mengubah record tertentu dari input +++++++++++++++++++++++
	void setElement(int i) {
		System.out.println(" +++ Mengubah Data +++");
		a[i].BacaNasabah();
	}

	int InputIndeks() {
		System.out.print(" +++ Masukan index (Batas index adalah " + (N - 1) + "): ");
		int indeks = sc.nextInt();
		return indeks;
	}

//============================================

	int MencariX(String norek) {
		int ix = -1;
		int i;
		for (i = 0; i < N; i++) {
			if (a[i].norek.equals(norek)) {
				ix = i;
			}
		}
		// System.out.println("i keluar dari loop: " + i);
		return ix;
	}

//	int MencariX(String norek) {
//		int ix = -1;
//		int i = 0;
//		do {
//			i++;
//		}
//		while ( i < N && a[i] != x) {
//			if (a[i].norek.equals(norek)) {
//				ix = i;
//			}
//		}
//		// System.out.println("i keluar dari loop: " + i);
//		return ix;
//	}

// ++++++++++++++++++++++++++ +++ Fungsi LOGIN  +++++++++++++++++++++++++++++++++
	int Login() {
		int ulang = 0;
		int ix;
		do {
			System.out.println("Jika Norek atau Pin anda salah 3 kali maka anda akan gagal Login");
			System.out.print("Masukan norek: ");
			String norekS = sc.next();
			System.out.print("Masukan pin: ");
			String pass = sc.next();
			ix = -1;
			for (int i = 0; i < N; i++) {
				if (a[i].norek.equals(norekS) && a[i].pin.equals(pass)) {
					ix = i;
				}
			}
			ulang += 1;
		} while (ix == -1 && ulang < 3);
		return ix;
	}

//	++++++++++++++++++++++++ +++ akhir funfsi LOGIN ++++++++++++++++++++++++++++++
	void UbahNamaElemen(String no, String namaBaru) {
		int k = MencariX(no);
		if (k != -1)
			UbahNama(k, namaBaru);
		// a[k].nama = namaBaru;
		else
			System.out.println("Norek " + no + " tidak ada dalam array");
	}

	void UbahNama(int i, String name) {
		a[i].nama = name;
	}

// ++++++++++++++++++++++++  Fungsi setor tabungan, tarik tunai, cek saldo +++++++++++++++++++++++++++
	void TarikTunai(int i) {
		System.out.print("Masukan besar penarikan: ");
		float besar = sc.nextFloat();
		if (a[i].saldo < besar) {
			System.err.println("Maaf Saldo anda tidak cukup");
		} else {
			a[i].saldo -= besar;
			System.out.println("Tarik tunai berhasil sebesar: Rp." + besar);
		}
	}

	void SetorTunai(int i) {
		System.out.print("Masukan besar penyetoran: ");
		float besar = sc.nextFloat();
		a[i].saldo += besar;
		System.out.println("Setor tunai berhasil sebesar: Rp." + besar);
	}

	void CekSaldo(int i) {
		System.out.println("Saldo anda: Rp." + a[i].saldo);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrNasabah A = new ArrNasabah();
		Nasabah T = new Nasabah();
		Nasabah U = new Nasabah();

		System.out.println(" +++ Inisialisasi Array +++ ");
		A.InitArray();
		System.out.println(" +++ Isi Array +++ ");
		A.IsiArray();
		System.out.println(" +++ Tampil Array +++ ");
		A.TampilArray();

		/*
		 * System.out.println(" +++ Manipulasi Array +++ ");
		 * System.out.println("1. Mengambil Data"); int inputAmbil = A.InputIndeks(); T
		 * = A.getElement(inputAmbil); T.TulisNasabah();
		 * 
		 * System.out.println("2. Mengubah Data"); int inputUbah = A.InputIndeks();
		 * A.setElement(inputUbah);
		 * 
		 * System.out.println("\n +++ Tampil Array (Diperbarui) +++ "); A.TampilArray();
		 */

		/*
		 * System.out.println("Mencari nilai tertentu dalam array");
		 * System.out.print("Masukan nilai "); String x = sc.next(); int k =
		 * A.MencariX(x); if (k != -1) { System.out.println("Nilai yang dicari yaitu " +
		 * x + " ada di indeks " + k); U = A.getElement(k); U.TulisNasabah(); } else {
		 * System.out.println("Nilai tidak ditemukan"); }
		 */

		// System.out.println("Sistem Login Sederhana");
		// System.out.print("Masukan username: ");
		// String norek = sc.next();
		// System.out.print("Masukan pin: ");
		// String pin = sc.next();
		// A.Login(norek, pin);

		// System.out.println("Mengubah Nama");
		// System.out.print("Masukan norek: ");
		// String norek = sc.next();
		// System.out.print("Masukan nama baru: ");
		// String namaBaru = sc.next();
		// A.UbahNamaElemen(norek, namaBaru);
		// A.TampilArray();

		int L = A.Login();
		if (L != -1) {
			System.out.println("Anda berhasil login");
			boolean login = true;
			while (login == true) {
				System.out
						.println("Menu:" + "\n1. Cek Saldo" + "\n2. Tarik Tunai" + "\n3. Setor Tunai" + "\n0. Keluar");
				int menu = sc.nextInt();
				switch (menu) {
				case 1:
					A.CekSaldo(L);
					break;
				case 2:
					A.TarikTunai(L);
					break;
				case 3:
					A.SetorTunai(L);
					break;
				case 0:
					login = false;
					break;
				default:
					System.err.println("Invalid Input");
					break;
				}
			}
		} else {
			System.err.println("Anda gagal login");
			return;
		}
	}
}
