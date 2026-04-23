/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */
public class Bilangan_Genap_No1 {
    public static void main(String[] args) {
        int jumlah = 0;
        for(int a = 1; a <= 10; a++){
            int genap = a * 2;
            System.out.print(genap);
            if(a < 10) System.out.print(" + ");
            jumlah += genap;
        }
        System.out.println(" = " + jumlah);
    }
}
