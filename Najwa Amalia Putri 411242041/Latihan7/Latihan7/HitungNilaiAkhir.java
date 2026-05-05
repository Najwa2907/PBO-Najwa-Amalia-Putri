import java.util.Scanner;

public class HitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR MATERI PEMROGRAMMAN C++");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); 

        
        String[] nama = new String[jumlahMahasiswa];
        double[] nilaiTugas = new double[jumlahMahasiswa];
        double[] nilaiUTS = new double[jumlahMahasiswa];
        double[] nilaiUAS = new double[jumlahMahasiswa];
        double[] nilaiAkhir = new double[jumlahMahasiswa];
        char[] grade = new char[jumlahMahasiswa];

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMahasiswa Ke - " + (i + 1));
            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai Tugas : ");
            nilaiTugas[i] = input.nextDouble();
            System.out.print("Nilai UTS : ");
            nilaiUTS[i] = input.nextDouble();
            System.out.print("Nilai UAS : ");
            nilaiUAS[i] = input.nextDouble();
            input.nextLine(); 

            
            double murniTugas = nilaiTugas[i] * 0.30;
            double murniUTS = nilaiUTS[i] * 0.30;
            double murniUAS = nilaiUAS[i] * 0.40;
            nilaiAkhir[i] = murniTugas + murniUTS + murniUAS;

            
            if (nilaiAkhir[i] >= 80) grade[i] = 'A';
            else if (nilaiAkhir[i] >= 70) grade[i] = 'B';
            else if (nilaiAkhir[i] >= 59) grade[i] = 'C';
            else if (nilaiAkhir[i] >= 50) grade[i] = 'D';
            else grade[i] = 'E';
        }

        
        System.out.println("\nDAFTAR NILAI MATERI : PEMROGRAMMAN C++");
        System.out.println("------------------------------------------------------");
        System.out.println("No. Nama         Nilai Nilai Nilai Nilai Grade");
        System.out.println("    Mahasiswa    Tugas  UTS   UAS   Akhir Mahasiswa");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-3d %-12s %-6.1f %-5.1f %-5.1f %-6.1f %-1c\n", 
                (i + 1), nama[i], nilaiTugas[i], nilaiUTS[i], nilaiUAS[i], nilaiAkhir[i], grade[i]);
        }
        System.out.println("------------------------------------------------------");
    }
}
