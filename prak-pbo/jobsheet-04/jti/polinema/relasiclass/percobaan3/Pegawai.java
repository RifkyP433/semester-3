package jti.polinema.relasiclass.percobaan3;

public class Pegawai {
  private String nip;
  private String nama;

  // konstruktor
  Pegawai(String nip, String nama) {
    this.nip = nip;
    this.nama = nama;
  }

  // setter
  public void setNip(String nip) {
    this.nip = nip;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  // getter
  public String getNip() {
    return nip;
  }

  public String getNama() {
    return nama;
  }

  // method info
  public String info() {
    String info = "";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
  }
}