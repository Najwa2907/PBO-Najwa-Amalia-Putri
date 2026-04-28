/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahasiswa
 */
public class No1 {
    
    public static void main(String[] args) {
        int n = 5;
        for (int a = 1; a <= n; a++) {
            
            for (int s = a; s < n; s++) {
                System.out.print(" ");
            }
            
            for (int b = 1; b <= (2 * a - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    

