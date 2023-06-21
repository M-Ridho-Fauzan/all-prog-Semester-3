package pertemuan6;

import java.util.Scanner;

public class Percobaan {
	public static void main(String[] args) {
		int ikan, plastik, timbangan, modal, jgram, total, gram, untung, pcs, Tmodal;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nHarga ikan :"); ikan = sc.nextInt();
		System.out.println("Harga plastik :"); plastik = sc.nextInt();
		System.out.println("Harga timbangan :");timbangan = sc.nextInt();
		
		modal = ikan + plastik + timbangan;
		System.out.println("Modal yang harus di keluarkan : Rp" + modal);
		
		System.out.println("\nBerapa total gram ikan :"); gram = sc.nextInt();
		System.out.println("akan di jual berapa gram perkantong :" ); jgram = sc.nextInt();
		
		total = gram / jgram ;
		
		System.out.println("Maka, dari jumlah " + gram + "gram, jika di jual " + jgram + "gram per pcs");
		System.out.println("Akan menghasilkan " + total + "pcs");
		
		System.out.println("\nPer kantong, akan di jual berapa : "); pcs = sc.nextInt();
		
		untung = total * pcs;
		
		System.out.println("Jika di jual Rp" + pcs + " per pcs, maka menghasilkan untung Rp" + untung);
				
		Tmodal = untung - modal;
		
		System.out.println("dan dari modal Rp" + modal + " maka hasil akhir keuntungan adalah : " + Tmodal);
	}
}
