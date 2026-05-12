import java.util.Scanner;

public class BeratBadanIdeal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ulang;
        do { 
            System.out.println("===========================================");
            System.out.println("   Program Kalkulator Berat Badan Ideal    ");
            System.out.println("===========================================");

            // Masukan jenis kelamin
           String jeniskelamin;
            while (true) {
                System.out.print("Pilih jenis kelamin (L/P) : ");
                jeniskelamin = sc.nextLine().trim().toUpperCase();
                if (jeniskelamin.equals("L") || jeniskelamin.equals("P")) {
                    break;
                } else {
                    System.out.println("Input tidak valid! Masukkan L untuk Laki-laki atau P untuk Perempuan.");
                }
            }

            // Masukan tinggi badan
            double tinggibadan;
            while (true) {
                System.out.print("Masukkan tinggi badan Anda (dalam cm) : ");
                try {
                    tinggibadan = Double.parseDouble(sc.nextLine().trim());
                    if (tinggibadan > 0) break;
                    else System.out.println("Tinggi badan harus lebih dari 0!");
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid! Masukkan angka.");
                }
            }

            // Hitung berat badann ideal
            double beratideal;
            if (jeniskelamin.equals("L")) {
                beratideal = tinggibadan - 100;
            } else {
                beratideal = tinggibadan - 110;
            }
 
            System.out.printf("Berat badan ideal yang seharusnya : %.0f Kg%n", beratideal);


            // Masukan berat badan sebenarrnya
             double beratsebenarnya;
            while (true) {
                System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
                try {
                    beratsebenarnya = Double.parseDouble(sc.nextLine().trim());
                    if (beratsebenarnya > 0) break;
                    else System.out.println("Berat badan harus lebih dari 0!");
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid! Masukkan angka.");
                }
            }
 
            // Hitung selisih dan tentukan kategorinya
            double selisih = beratsebenarnya - beratideal;
 
            System.out.println();
            if (beratsebenarnya <= beratideal) {
                double kekurangan = beratideal - beratsebenarnya;
                if (kekurangan == 0) {
                    System.out.printf("Selamat! Berat badan Anda sudah IDEAL (%.0f Kg)%n", beratsebenarnya);
                } else {
                    System.out.printf(
                        "Anda termasuk kedalam kategori Kurus dan harus menambah berat badan sebanyak %.0f Kg (%.0f Kg + %.0f Kg)%n",
                        kekurangan, beratideal, kekurangan
                    );
                }
            } else {
                System.out.printf(
                    "Anda termasuk kedalam kategori Gemuk dan harus mengurangi berat badan sebanyak %.0f Kg (%.0f Kg – %.0f Kg)%n",
                    selisih, beratsebenarnya, beratideal
                );
            }

            // jika ingin diulang
            System.out.println();
            System.out.print("Apakah ingin mengulang program? (Y/T) : ");
            ulang = sc.nextLine().trim().toUpperCase();
            System.out.println();
 
        } while (ulang.equals("Y"));
 
        System.out.println("Terima kasih telah menggunakan program ini!");
        sc.close();
    }
}
 
      
