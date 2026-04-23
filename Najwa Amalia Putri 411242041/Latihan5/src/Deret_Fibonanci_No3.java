/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */
public class Deret_Fibonanci_No3 {
   public static void main(String[] args) {
        int a = 1, b = 1, c;
        System.out.print(a + ", " + b);
        for(int i = 3; i <= 8; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
