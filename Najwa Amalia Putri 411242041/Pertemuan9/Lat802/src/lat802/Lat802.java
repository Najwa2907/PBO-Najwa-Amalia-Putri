/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat802;

/**
 *
 * @author Mahasiswa
 */
class Lat802 {
    float nilakhir; 
    Lat802(int nilai_akhir) {
        nilakhir = nilai_akhir;
    }
    Lat802(int nil1, int nil2) {
        nilakhir = nil1 + nil2; 
    }

    public String grade() {
        String nilgrade;
        if (nilakhir >= 80)
            nilgrade = "A";
        else if (nilakhir >= 68)
            nilgrade = "B";
        else if (nilakhir >= 56)
            nilgrade = "C";
        else if (nilakhir >= 49)
            nilgrade = "D";
        else
            nilgrade = "E";
        return nilgrade;
    }

    public void cetak() {
        System.out.println("Nilai: " + nilakhir + " | Grade: " + grade());
    }

    public static void main(String[] args) {
        Lat802 hasil = new Lat802(67);
        hasil.cetak();
        Lat802 hasilnya = new Lat802(45, 35);
        hasilnya.cetak();
    }
}


