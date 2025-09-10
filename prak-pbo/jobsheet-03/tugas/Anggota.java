package tugas;

public class Anggota {
  private String noKTP;
  private String nama;
  private double limitPeminjaman;
  private double jmlPinjaman = 0;

  Anggota(String noKTP, String nama, double limitPeminjaman) {
    this.noKTP = noKTP;
    this.nama = nama;
    this.limitPeminjaman = limitPeminjaman;
  }

  public String getNama() {
    return nama;
  }

  public double getLimitPeminjaman() {
    return limitPeminjaman;
  }

  public double getJumlahPinjaman() {
    return jmlPinjaman;
  }

  public void pinjam(double pinjam) {
    if (pinjam > limitPeminjaman) {
      System.out.println("Maaf, jumlah pinjaman melebihi limit");
    } else {
      jmlPinjaman += pinjam;
    }
  }

  public void angsur(double angsur) {
    double min = 0.1 * getJumlahPinjaman();

    if (angsur < min) {
      System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!");
    } else {
      jmlPinjaman -= angsur;
    }
  }
}
