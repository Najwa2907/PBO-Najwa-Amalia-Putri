/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 *
 */import java.util.Scanner;
public class soal_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai Radius : ");
        double radius = sc.nextDouble();

        double luas     = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;

        System.out.println("\nHasil Perhitungan");
        System.out.printf("Luas Lingkaran     : %.2f%n", luas);
        System.out.printf("Keliling Lingkaran : %.2f%n", keliling);

        sc.close();
    }
}

