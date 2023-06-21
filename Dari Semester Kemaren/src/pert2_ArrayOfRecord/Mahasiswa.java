package pert2_ArrayOfRecord;

import java.util.Scanner;

public class Mahasiswa {
	
	String nrp,nama;
	float ipk;
	
	void BacaMahasiswa() {
		System.out.println("\n3. Tulis");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nrp : "); nrp = sc.next();
		System.out.println("nama : "); nama = sc.next();
		System.out.println("ipk : "); ipk = sc.nextFloat();
//			System.out.println("Elemen ke " +   );
//			System.out.println("NRP : " + nrp  );
//			System.out.println("Nama : " + nama );
//			System.out.println("IPK : " + ipk );
//			System.out.println("----------------------");
	}
	
	void TulisMahasiswa() {
//		System.out.println("Data nya " + ":" + nrp + ":" + "," + nama + "," + ipk );
		System.out.println("NRP : " + nrp  );
		System.out.println("Nama : " + nama );
		System.out.println("IPK : " + ipk );
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		
		Mahasiswa M = new Mahasiswa();
		
		M.BacaMahasiswa();
		M.TulisMahasiswa();
//		System.out.println("Kentot");
	}
}
