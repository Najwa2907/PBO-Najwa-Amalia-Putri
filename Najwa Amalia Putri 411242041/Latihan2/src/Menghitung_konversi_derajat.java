/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */import java.util.Scanner;
public class Menghitung_konversi_derajat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai Derajat Celcius : ");
        double celcius = sc.nextDouble();

        double fahrenheit = (celcius * 9.0 / 5.0) + 32;
        double reamur     = celcius * 4.0 / 5.0;

        System.out.println("\nHasil Konversi        :");
        System.out.println("Derajat Fahrenheit    : " + fahrenheit);
        System.out.println("Derajat Reamor        : " + reamur);

        sc.close();
    }
}

