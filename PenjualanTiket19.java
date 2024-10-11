import java.util.Scanner;
public class PenjualanTiket19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahTiket = 0, totalHarga = 0, total = 0;
        double jumlahHarga = 0;
        
        do {
            System.out.print("Masukkan jumlah tiket(ketik '0' untuk selesai): ");
            jumlahTiket=sc.nextInt();
            sc.nextLine();
            
            double harga = jumlahTiket * 50000;
            if (jumlahTiket>10) {               
                jumlahHarga = harga * 0.85 ;
                System.out.println("Total harga tiket : Rp " +jumlahHarga);
            } else if (jumlahTiket>4) {
                jumlahHarga = harga * 0.90;
                System.out.println("Total harga tiket : Rp " +jumlahHarga);
            } else if (jumlahTiket<=4) {
                jumlahHarga = harga * 1;
                System.out.println("Total harga tiket : Rp " +jumlahHarga);
            }
            if (jumlahTiket==0) {
                System.out.println("Transaksi selesai");
                break;
            } else if (jumlahTiket<1) {
                System.out.println("Input tidak valid. Mohon masukkan ulang");
                continue;
            }
            total += jumlahTiket;
            totalHarga += jumlahHarga;
        } 
        while (jumlahTiket != 0); {
            System.out.println("Total tiket terjual: " +total);
        }
        while (jumlahHarga !=0); {
            System.out.println("Total penjualan tiket: Rp " +totalHarga);
        }
       
    }
}