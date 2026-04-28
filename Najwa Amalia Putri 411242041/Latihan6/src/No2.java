/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahasiswa
 */
public class No2 {
    public static void main(String[] args) {
                  
        int n = 5; 
        
        for(int i = 1; i <= n; i++){                
            for(int j = 1; j <= n; j++){                
                
                if(j == i || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }                
            System.out.println(); 
        }                
    }                
}

    

