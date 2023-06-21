package pert14SalinArsip;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainFile {
	Scanner sc = new Scanner(System.in);

	public void SaveToFile(String fileName) {
		Nasabah R;
		int Saldoku;
		String No, Namaku;

		System.out.println("========== SaveToFile ======");
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fileName));

			BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < 3; i++) {
				try {
					System.out.println("No Rekening: ");
					No = brInput.readLine();
					System.out.println("Nama: ");
					Namaku = brInput.readLine();
					System.out.println("Saldo: ");
					Saldoku = Integer.parseInt(brInput.readLine());
					R = new Nasabah(No, Namaku, Saldoku);
					out.writeObject(R);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ViewFile(String fileName) {
		Nasabah R;
		int total = 0;
		System.out.println("========== ViewFile ======");
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try {
			in = new ObjectInputStream(new FileInputStream(fileName));
			out = new ObjectOutputStream(new FileOutputStream("C:\\DataJava\\NasabahCopy.dat"));

			Object curR = in.readObject();
			try {
				while (true) {
					R = (Nasabah) curR;
					out.writeObject(R);

					System.out.println("No Rekening: " + R.getNorek());
					System.out.println("Nama: " + R.getNama());
					System.out.println("Saldo: " + R.getSaldo());
					total++;

					curR = in.readObject();
				}
			} catch (EOFException e) {
				System.out.println("Total record: " + total);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class tidak ditemukan.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Nasabah R = new Nasabah();
		MainFile B = new MainFile();
		String nf1 = "C:\\DataJava\\Nasabah.dat";
		String nf2 = "C:\\DataJava\\NasabahCopy.dat";

		B.SaveToFile(nf1);
		B.ViewFile(nf1);
		B.ViewFile(nf2);
	}
}
