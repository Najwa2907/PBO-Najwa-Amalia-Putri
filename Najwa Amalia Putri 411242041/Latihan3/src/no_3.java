/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */import java.util.Scanner;

public class no_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, ukuran;
        int harga = 0, jumlah, total;

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println();

        System.out.print("Masukan Merk Susu [Dancow | Bendera | SGM] : ");
        merk = input.nextLine();

        System.out.print("Masukan Ukuran [Kecil | Sedang | Besar] : ");
        ukuran = input.nextLine();

        // Penentuan harga
        if (merk.equalsIgnoreCase("Dancow")) {
            if (ukuran.equalsIgnoreCase("Kecil")) harga = 25000;
            else if (ukuran.equalsIgnoreCase("Sedang")) harga = 20000;
            else if (ukuran.equalsIgnoreCase("Besar")) harga = 15000;
        } 
        else if (merk.equalsIgnoreCase("Bendera")) {
            if (ukuran.equalsIgnoreCase("Kecil")) harga = 20000;
            else if (ukuran.equalsIgnoreCase("Sedang")) harga = 17500;
            else if (ukuran.equalsIgnoreCase("Besar")) harga = 13500;
        } 
        else if (merk.equalsIgnoreCase("SGM")) {
            if (ukuran.equalsIgnoreCase("Kecil")) harga = 22000;
            else if (ukuran.equalsIgnoreCase("Sedang")) harga = 18500;
            else if (ukuran.equalsIgnoreCase("Besar")) harga = 15000;
        }

        System.out.println("Harga Satuan : Rp. " + harga);

        System.out.print("Jumlah beli : ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        System.out.println("Total Bayar : Rp. " + total);
    }
}

