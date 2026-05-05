import java.text.DecimalFormat;
import java.util.Scanner;

public class HitungHonorEasy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        final double HONOR_TETAP = 700000;
        final int JAM_KERJA_NORMAL = 240;
        final double UPAH_LEMBUR = 2500;
        final double PAJAK = 0.05; 

        System.out.println("Program Hitung Honor Karyawan Kontrak PT. EASY");
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jumlah = input.nextInt();
        input.nextLine();

        
        String[] nama = new String[jumlah];
        double[] tjJabatan = new double[jumlah];
        double[] tjPendidikan = new double[jumlah];
        double[] lembur = new double[jumlah];
        double[] pajak = new double[jumlah];
        double[] gajiBersih = new double[jumlah];

        double totalSemua = 0;

        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nKaryawan ke-" + (i + 1));
            
            System.out.print("Nama Karyawan : ");
            nama[i] = input.nextLine();

            System.out.print("Golongan (1/2/3) : ");
            int gol = input.nextInt();

            System.out.print("Pendidikan (1=SMU/2=D3/3=S1) : ");
            int pend = input.nextInt();

            System.out.print("Jumlah Jam Kerja : ");
            int jam = input.nextInt();
            input.nextLine();

            
            double persenGol = 0;
            if (gol == 1) persenGol = 0.05;
            else if (gol == 2) persenGol = 0.10;
            else if (gol == 3) persenGol = 0.15;

            tjJabatan[i] = persenGol * HONOR_TETAP;

            
            double persenPend = 0;
            if (pend == 1) persenPend = 0.025;
            else if (pend == 2) persenPend = 0.05;
            else if (pend == 3) persenPend = 0.075;

            tjPendidikan[i] = persenPend * HONOR_TETAP;

            
            if (jam > JAM_KERJA_NORMAL) {
                lembur[i] = (jam - JAM_KERJA_NORMAL) * UPAH_LEMBUR;
            } else {
                lembur[i] = 0;
            }

            
            double total = HONOR_TETAP + tjJabatan[i] + tjPendidikan[i] + lembur[i];

            
            pajak[i] = PAJAK * total;

            
            gajiBersih[i] = total - pajak[i];

            totalSemua += gajiBersih[i];
        }

        
        System.out.println("\nPT. EASY");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("No Nama        Gaji     Tunj. Jabatan  Tunj. Pendidikan  Lembur   Pajak    Bersih");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3d %-10s Rp %-8s Rp %-15s Rp %-18s Rp %-8s Rp %-8s Rp %-10s\n",
                    (i + 1),
                    nama[i],
                    df.format(HONOR_TETAP),
                    df.format(tjJabatan[i]),
                    df.format(tjPendidikan[i]),
                    df.format(lembur[i]),
                    df.format(pajak[i]),
                    df.format(gajiBersih[i]));
        }

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Total Gaji yang dikeluarkan Rp. " + df.format(totalSemua));
    }
}