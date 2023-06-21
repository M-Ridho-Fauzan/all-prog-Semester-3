package pertemuan_1;

import java.util.Scanner;

public class Array_Int_2 {
	
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
	//----------------------------------------
	public static void main(String[] args) {
		Array_Int_2 B = new Array_Int_2();
		
		B.InitArray();
		B.TampilArray();
		B.IsiArray();
		B.TampilArray();
	}
}
