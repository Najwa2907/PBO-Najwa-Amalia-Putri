import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("Program hitung nilai akhir matakuliah PBO Undira");
            System.out.print("Masukkan jumlah mahasiswa: ");
            int n = sc.nextInt(); sc.nextLine();

            String[] Nama  = new String[n];
            double[] Tugas = new double[n];
            double[] UTS   = new double[n];
            double[] UAS   = new double[n];
            double[] Akhir = new double[n];
            char[]   Grade = new char[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Mahasiswa Ke - " + (i + 1));
                System.out.print("Nama Mahasiswa : "); Nama[i]  = sc.nextLine();
                System.out.print("Nilai Tugas    : "); Tugas[i] = sc.nextDouble();
                System.out.print("Nilai UTS      : "); UTS[i]   = sc.nextDouble();
                System.out.print("Nilai UAS      : "); UAS[i]   = sc.nextDouble();
                sc.nextLine();

                Akhir[i] = (Tugas[i] * 0.30) + (UTS[i] * 0.30) + (UAS[i] * 0.40);

                if      (Akhir[i] >= 80) Grade[i] = 'A';
                else if (Akhir[i] >= 70) Grade[i] = 'B';
                else if (Akhir[i] >= 59) Grade[i] = 'C';
                else if (Akhir[i] >= 50) Grade[i] = 'D';
                else                     Grade[i] = 'E';
            }

            System.out.println("                 Daftar Nilai                                ");
            System.out.println("            Materi : Pemrograman PBO ");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("%-4s %-15s %-6s %-6s %-6s %-7s %s%n", "No.", "Nama Mahasiswa", "Tugas", "UTS", "UAS", "Akhir", "Grade");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%-4d %-15s %-6.1f %-6.1f %-6.1f %-7.2f %s%n",
                        (i + 1), Nama[i], Tugas[i], UTS[i], UAS[i], Akhir[i], Grade[i]);
            }

            System.out.println("-------------------------------------------------------------");

            System.out.print("Ulang program? (Y/T): ");
            ulang = sc.nextLine().trim().toUpperCase();
            System.out.println();

        } while (ulang.equals("Y"));

        System.out.println("Terima kasih!");
        sc.close();
    }
}