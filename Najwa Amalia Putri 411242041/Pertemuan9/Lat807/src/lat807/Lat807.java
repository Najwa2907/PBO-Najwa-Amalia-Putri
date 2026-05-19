/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat807;

/**
 *
 * @author Mahasiswa
 */
class Binatang {
    String namaBinatang;

    Binatang() {}

    Binatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public void cetakjenis() {
        System.out.println("Nama Binatang : " + namaBinatang);
    }
}

class Suara extends Binatang {
    String suaraBinatang;

    Suara() {
        super();
    }

    Suara(String namaBinatang, String suaraBinatang) {
        super(namaBinatang);
        this.suaraBinatang = suaraBinatang;
    }

    @Override
    public void cetakjenis() {
        super.cetakjenis();
        System.out.println("Suara Binatang : " + suaraBinatang);
    }
}

class JenisBinatang extends Suara {
    String kategoriBinatang;

    JenisBinatang(String namaBinatang, String suaraBinatang, String kategoriBinatang) {
        super(namaBinatang, suaraBinatang);
        this.kategoriBinatang = kategoriBinatang;
    }

    @Override
    public void cetakjenis() {
        super.cetakjenis();
        System.out.println("Jenis Binatang : " + kategoriBinatang);
    }
}

public class Lat807 {
    public static void main(String[] args) {
        JenisBinatang harimau = new JenisBinatang("Harimau", "Mengaum", "Predator");
        harimau.cetakjenis();
    }
}
