/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */
public class Bilangan_Ganjil_No2 {
    public static void main(String[] args) {
        int jumlah = 0;
        for(int a = 1; a <= 10; a++){
            int ganjil = (a * 2) - 1;
            System.out.print(ganjil);
            if(a < 10) System.out.print(" + ");
            jumlah += ganjil;
        }
        System.out.println(" = " + jumlah);
    }
}

