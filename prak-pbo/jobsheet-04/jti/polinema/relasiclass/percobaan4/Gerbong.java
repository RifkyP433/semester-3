package jti.polinema.relasiclass.percobaan4;

public class Gerbong {
  private String kode;
  private Kursi[] arrayKursi;

  private void initKursi() {
    for (int i = 0; i < arrayKursi.length; i++) {
      this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    }
  }
  
  // konstruktor
  Gerbong(String kode, int jumlah) {
    this.kode = kode;
    this.arrayKursi = new Kursi[jumlah];
    this.initKursi();
  }

  // setter
  public void setKode(String kode) {
    this.kode = kode;
  }
  
  public void setPenumpang(Penumpang penumpang, int nomor) {
    this.arrayKursi[nomor - 1].setPenumpang(penumpang);
  }

  // getter
  public String getKode() {
    return kode;
  }

  public Kursi[] getArrayKursi() {
    return arrayKursi;
  }

  // method info
  public String info() {
    String info = "";
    info += "Kode: " + kode + "\n";
    for (Kursi kursi : arrayKursi) {
      info += kursi.info();
    }
    return info;
  }
}