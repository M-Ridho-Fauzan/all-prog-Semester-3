package pertemuan6;

import java.util.Scanner;

public class Nasabah {
	String norek, nama, username, pin;
	float saldo;
	
	Scanner sc = new Scanner(System.in);
	
	void BacaNasabah() {
		System.out.println("Isi Data");
		System.out.print("norek: ");
		norek = sc.next();
		System.out.print("nama: ");
		nama = sc.next();
		System.out.print("pin: ");
		pin = sc.next();
		System.out.print("saldo: ");
		saldo = sc.nextFloat();
	}
	
	void TulisNasabah() {
		System.out.println("Data " + ": " + norek + ", " + nama + ", " + saldo);
		System.out.println("Norek : " + norek);
		System.out.println("Nama : " + nama);
		if( saldo < 100000 ) {
		System.out.println("Saldo : " + saldo + " miris ajg saetik pisan :v");
		} else {
			System.out.println("Saldo : " + saldo + " njay loba duid euy ");
		}
	}
	
	public static void main(String[] args) {
		Nasabah N = new Nasabah();
		N.TulisNasabah();
		N.BacaNasabah();
		N.TulisNasabah();
	}
}
