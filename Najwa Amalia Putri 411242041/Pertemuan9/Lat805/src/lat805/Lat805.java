/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat805;

/**
 *
 * @author Mahasiswa
 */
class Aritmatika
{
private int a, b;


public Aritmatika(int x, int y)
{
this.a = x;
this.b = y;
}


public int kali()
{
return a * b;
}

public void hasil()
{
System.out.println("Nilai A = " + this.a);
System.out.println("Nilai B = " + this.b);
}
}
class Perhitungan extends Aritmatika
{
protected int z;
public Perhitungan(int z, int x, int y)
{
super(x, y);
this.z = z;
}
public int Hitung()
{
return z + super.kali();
}
public void hasil()
{
System.out.println("Nilai Z = " + this.z);
super.hasil();
}
}
public class Lat805
{
public static void main(String[] args)
{
Perhitungan matematika = new Perhitungan(5, 4, 3);
matematika.hasil();
System.out.println("Hasil Perhitungannya = " + matematika.Hitung());
}
}