package tugas;

import java.util.Scanner;

public class TestKoperasi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Anggota donny = new Anggota("111333444", "Donny", 5000000);

    System.out.println("Nama Anggota : " + donny.getNama());
    System.out.println("Limit Pinjaman : " + donny.getLimitPeminjaman());

    int pilihan;
    do {
      System.out.println("\n===== MENU =====");
      System.out.println("1. Pinjam Uang");
      System.out.println("2. Bayar Angsuran");
      System.out.println("3. Lihat Jumlah Pinjaman");
      System.out.println("4. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = sc.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan jumlah pinjaman: ");
          double pinjam = sc.nextDouble();
          donny.pinjam(pinjam);
          System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
          break;
        case 2:
          System.out.print("Masukkan jumlah angsuran: ");
          double angsur = sc.nextDouble();
          donny.angsur(angsur);
          System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
          break;
        case 3:
          System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
          break;
        case 4:
          System.out.println("Terima kasih, program selesai.");
          break;
        default:
          System.out.println("Pilihan tidak valid!");
      }
    } while (pilihan != 4);

    sc.close();
  }
}

