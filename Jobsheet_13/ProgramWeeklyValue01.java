import java.util.Scanner;

public class ProgramWeeklyValue01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = scanner.nextInt();

        double[][] nilaiSiswa = new double[jumlahSiswa][jumlahMinggu];

        // Input data nilai siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa " + (i + 1) + " untuk " + jumlahMinggu + " minggu:");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilaiSiswa[i][j] = scanner.nextDouble();
            }
        }

        // Menampilkan seluruh nilai siswa
        System.out.println("\nNilai seluruh siswa dari minggu pertama hingga minggu ke-" + jumlahMinggu + ":");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Siswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiSiswa[i][j] + " ");
            }
            System.out.println();
        }

        // Mencari minggu dengan nilai tertinggi dari seluruh siswa
        int mingguTertinggi = 0;
        double nilaiTertinggi = nilaiSiswa[0][0];

        for (int j = 1; j < jumlahMinggu; j++) {
            double totalNilaiMinggu = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalNilaiMinggu += nilaiSiswa[i][j];
            }

            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = j;
            }
        }

        System.out.println("\nMinggu dengan nilai tertinggi dari seluruh siswa: " + (mingguTertinggi + 1));

        // Mencari siswa dengan nilai tertinggi dan menampilkan nilai untuk setiap minggu
        int siswaTertinggi = 0;
        double nilaiTotalTertinggi = 0;

        for (int i = 1; i < jumlahSiswa; i++) {
            double totalNilaiSiswa = 0;

            for (int j = 0; j < jumlahMinggu; j++) {
                totalNilaiSiswa += nilaiSiswa[i][j];
            }

            if (totalNilaiSiswa > nilaiTotalTertinggi) {
                nilaiTotalTertinggi = totalNilaiSiswa;
                siswaTertinggi = i;
            }
        }

        System.out.println("\nSiswa dengan nilai tertinggi: " + (siswaTertinggi + 1));
        System.out.println("Nilai untuk setiap minggu:");
        for (int j = 0; j < jumlahMinggu; j++) {
            System.out.print(nilaiSiswa[siswaTertinggi][j] + " ");
        }
    }
}
