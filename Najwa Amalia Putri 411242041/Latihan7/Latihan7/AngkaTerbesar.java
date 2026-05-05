import java.util.ArrayList;
import java.util.Collections;

public class AngkaTerbesar {
    private ArrayList<Double> daftarAngka;

    
    public AngkaTerbesar() {
        daftarAngka = new ArrayList<>();
    }

    
    public void tambahAngka(double angka) {
        daftarAngka.add(angka);
    }

    
    public double cariTerbesar() {
        if (daftarAngka.isEmpty()) {
            throw new IllegalStateException("Daftar angka kosong!");
        }
        
        
        return Collections.max(daftarAngka);
    }

    
    public static void main(String[] args) {
        AngkaTerbesar app = new AngkaTerbesar();
        
        
        app.tambahAngka(10.5);
        app.tambahAngka(25.0);
        app.tambahAngka(5.7);
        app.tambahAngka(30.2);
        app.tambahAngka(15.0);

        
        System.out.println("Angka terbesar adalah: " + app.cariTerbesar());
    }
}
