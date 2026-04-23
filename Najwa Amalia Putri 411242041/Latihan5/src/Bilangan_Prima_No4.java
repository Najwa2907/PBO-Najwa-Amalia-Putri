/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwa
 */
public class Bilangan_Prima_No4 {
    public static void main(String[] args) {
        for(int a = 2; a <= 20; a++) {
            boolean prima = true;
            for(int b = 2; b <= a / 2; b++) {
                if(a % b == 0) {
                    prima = false;
                    break;
                }
            }
            if(prima) {
                System.out.print(a + " ");
            
            }
        }
    }
}
