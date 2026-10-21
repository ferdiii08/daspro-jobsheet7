import java.util.Scanner;
public class TiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double totalHarga = 0, hargaBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            hargaBayar = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                hargaBayar = hargaBayar * 0.85;   // diskon 15%
            } else if (jumlahTiket > 4) {
                hargaBayar = hargaBayar * 0.90;   // diskon 10%
            }

            System.out.println("Harga yang dibayar: Rp " + hargaBayar);
            totalTiket += jumlahTiket;
            totalHarga += hargaBayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalHarga);
    }
}