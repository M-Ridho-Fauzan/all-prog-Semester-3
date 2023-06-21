package pertemuan_1;

import java.util.Scanner;

public class Array_Int_1 {
	public static void main(String[] args) {

// ++++++++ Pertemuan 1 +++++++++++++
		
	    int N = 5;// 5 disini adalah isi/slot array
	    int [] a = new int[N]; // dan lalu array harus di tentukan bahwa 
	    					   // N ini adalah isi dari array

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Inisialisai Array");
	    for (int i = 0; i < N; i++) {
				a[i] = i;	
			}
			
	    // pertama array akan di isialisasi
	    
			System.out.println("\nTampil Array");
			for (int i = 0; i < N; i++) {
				System.out.println("Elemen ke " + i + ": " + "NULL");	
			}
				
			System.out.println("\nMembaca nilai input");
			for (int i = 0; i < N; i++) {
				System.out.print("Elemen ke " + i + ": ");
				a[i] = sc.nextInt();
			}
			
			System.out.println("\nTampil Array");
			for (int i = 0; i < N; i++) {
				System.out.println("Elemen ke " + i + ": " + a[i]);	
			}
	}
}
