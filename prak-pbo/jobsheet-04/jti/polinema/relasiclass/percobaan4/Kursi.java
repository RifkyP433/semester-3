package jti.polinema.relasiclass.percobaan4;

public class Kursi {
  private String nomor;
  private Penumpang penumpang;

  // konstruktor
  Kursi(String nomor) {
    this.nomor = nomor;
  }

  // setter
  public void setNomor(String nomor) {
    this.nomor = nomor;
  }

  public void setPenumpang(Penumpang penumpang) {
    this.penumpang = penumpang;
  }

  // getter
  public String getNomor() {
    return nomor;
  }

  public Penumpang getPenumpang() {
    return penumpang;
  }

  // method info
  public String info() {
    String info = "";
    info += "Nomor: " + nomor + "\n";
    if (this.penumpang != null) {
      info += "Penumpang: " + penumpang.info() + "\n";
    }
    return info;
  }
}