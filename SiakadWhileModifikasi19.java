import java.util.Scanner;
public class SiakadWhileModifikasi19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jumlah, i=0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah A");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "adalah E");
            }
            i++;
        }
    }
}