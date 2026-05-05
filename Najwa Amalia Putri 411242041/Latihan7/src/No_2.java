
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahasiswa
 */


public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode Jenis Harga");
        System.out.println("---------------------------");
        System.out.println("D Dada Rp. 2500");
        System.out.println("P Paha Rp. 2000");
        System.out.println("S Sayap Rp. 1500");
        System.out.println("--------------------------");

        System.out.print("Banyak Jenis : ");
        int banyakJenis = input.nextInt();

        String[] jenisPotong = new String[banyakJenis];
        int[] banyakPotong = new int[banyakJenis];
        int[] hargaSatuan = new int[banyakJenis];
        int[] jumlahHarga = new int[banyakJenis];
        int totalBayar = 0;

        // Input data
        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("Jenis Ke - " + (i + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            jenisPotong[i] = input.next().toUpperCase();
            System.out.print("Banyak Potong : ");
            banyakPotong[i] = input.nextInt();

            // Menentukan harga satuan
            if (jenisPotong[i].equals("D")) {
                hargaSatuan[i] = 2500;
                jenisPotong[i] = "Dada";
            } else if (jenisPotong[i].equals("P")) {
                hargaSatuan[i] = 2000;
                jenisPotong[i] = "Paha";
            } else if (jenisPotong[i].equals("S")) {
                hargaSatuan[i] = 1500;
                jenisPotong[i] = "Sayap";
            } else {
                hargaSatuan[i] = 0;
                jenisPotong[i] = "Salah";
            }
            
            jumlahHarga[i] = banyakPotong[i] * hargaSatuan[i];
            totalBayar += jumlahHarga[i];
        }

        // Tampilan Keluaran
        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("---------------------------------------------------------");
        System.out.println("No. Jenis Harga Banyak Jumlah");
        System.out.println(" Potong Satuan Beli Harga");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < banyakJenis; i++) {
            System.out.println((i + 1) + ".  " + jenisPotong[i] + "\t Rp. " + hargaSatuan[i] + "\t  " + banyakPotong[i] + "\t Rp. " + jumlahHarga[i]);
        }

        double pajak = totalBayar * 0.1;
        double totalAkhir = totalBayar + pajak;

        System.out.println("---------------------------------------------------------");
        System.out.println("Jumlah Bayar\t\t\t\tRp. " + totalBayar);
        System.out.println("Pajak 10%\t\t\t\tRp. " + (int)pajak);
        System.out.println("Total Bayar\t\t\t\tRp. " + (int)totalAkhir);
        System.out.println("---------------------------------------------------------");
    }
}

    

