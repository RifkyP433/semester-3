package jti.polinema.relasiclass.percobaan2;

public class Sopir {
  private String nama;
  private int biaya;

  // konstruktor default
  Sopir() {
  }

  // setter
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setBiaya(int biaya) {
    this.biaya = biaya;
  }

  // getter
  public String getNama() {
    return nama;
  }

  public int getBiaya() {
    return biaya;
  }

  // method hitung biaya sopir
  public int hitungBiayaSopir(int hari) {
    return biaya * hari;
  }
}