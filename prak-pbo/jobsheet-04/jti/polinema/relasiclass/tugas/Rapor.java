package jti.polinema.relasiclass.tugas;

public class Rapor {
  private double nilai;

  public Rapor(double nilai) {
    this.nilai = nilai;
  }

  public double getNilai() {
    return nilai;
  }

  public void setNilai(double nilai) {
    this.nilai = nilai;
  }

  public void info() {
    System.out.println("Nilai Rapor     : " + nilai);
  }
}