/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");

        System.out.print("Nama Siswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Pertandingan I : ");
        double n1 = input.nextDouble();

        System.out.print("Nilai Pertandingan II : ");
        double n2 = input.nextDouble();

        System.out.print("Nilai Pertandingan III : ");
        double n3 = input.nextDouble();

        double rata = (n1 + n2 + n3) / 3;

        String hadiah;
        if (rata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (rata >= 70) {
            hadiah = "Uang Rp. 500.000";
        } else {
            hadiah = "Hadiah Hiburan";
        }

        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Memperoleh nilai rata-rata " + rata);
        System.out.println("Berhak mendapatkan hadiah: " + hadiah);
    }
}

