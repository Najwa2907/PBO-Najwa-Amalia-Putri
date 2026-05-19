/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat804;

/**
 *
 * @author Mahasiswa
 */
class Matematika 
{ 

private int a, b; 

public Matematika() 

{ 
a = 1; 

b = 2; 
} 


public int tambah() 
{ 

return a + b; 
} 


public int kali() 
{ 
return b * 3; 
} 
}
class Hitungan extends Matematika 
{ 

private int x, y; 


public Hitungan() 
{ 
x = 1; 

y = 2; 
} 

public Hitungan(int i, int j) 

{ 
x = i; 
y = j; 

} 


public int tambah() 
{ 
    return x + y; 

} 


public int kali() 
{ 
    return y * 3; 

} 
}
class Lat804


{


public static void main(String[] args)
{






Hitungan ngitung = new Hitungan(5, 6);




System.out.println(" Hasil Pertambahannya = " + ngitung.tambah());
System.out.println(" Hasil Perkaliannya = " + ngitung.kali());
}


}















