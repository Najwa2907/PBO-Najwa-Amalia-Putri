/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelasperhitungan;

/**
 *
 * @author Mahasiswa
 */
class Perhitungan
{
static public int hitung(int a, int b)
{
return a + b;
}
static public double hitung(double a, double b, double c) {
return (a + b)/c;
}
}
public class Lat803
{
public static void main(String[] args)
{
Perhitungan Ngitung = new Perhitungan();
int hitung; double bagi;
hitung = Ngitung.hitung(4, 8); 
bagi = Ngitung.hitung(55, 69, 2);
System.out.println("Hasil Perhitungan	=	"	+	hitung);
System.out.println("Hasil Pembagian	=	"	+	bagi);
}
}
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

