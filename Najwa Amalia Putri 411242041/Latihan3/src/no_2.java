/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR");

        System.out.print("Nama Siswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Keaktifan : ");
        double keaktifan = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai Ujian : ");
        double ujian = input.nextDouble();

        double nKeaktifan = keaktifan * 0.2;
        double nTugas = tugas * 0.3;
        double nUjian = ujian * 0.5;

        double nilaiAkhir = nKeaktifan + nTugas + nUjian;

        String grade;
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Nilai Keaktifan * 20% : " + nKeaktifan);
        System.out.println("Nilai Tugas * 30% : " + nTugas);
        System.out.println("Nilai Ujian * 50% : " + nUjian);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
    }
}

