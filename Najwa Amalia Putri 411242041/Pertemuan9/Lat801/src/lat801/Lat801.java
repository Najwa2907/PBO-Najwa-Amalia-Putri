/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat801;

/**
 *
 * @author Mahasiswa
 */
class Lat801
{
float nilakhir;
Lat801(int nilai_akhir)
{
nilakhir = nilai_akhir;
}
public String grade()
{
String nilgrade;
if(nilakhir >= 80)
nilgrade = "A";
else if(nilakhir >= 68)
nilgrade = "B";
else if(nilakhir >= 56)
nilgrade = "C";
else if(nilakhir >= 49)
nilgrade = "D";
else
nilgrade = "E";
return nilgrade;
}
public void cetak()
{
System.out.println("Grade Nilainya = " + grade());
}
public static void main(String[] args)
{
Lat801 hasil = new Lat801(67);
hasil.cetak();
}
}
