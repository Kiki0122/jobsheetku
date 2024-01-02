import java.util.Scanner;

public class CubeStudent01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Menghitung luas kubus
        double luas = hitungLuasKubus(sisi);
        System.out.println("Luas kubus: " + luas);

        // Menghitung volume kubus
        double volume = hitungVolumeKubus(sisi);
        System.out.println("Volume kubus: " + volume);
    }

    // Fungsi untuk menghitung luas kubus
    public static double hitungLuasKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi menghitung volume kubus
    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }
}
