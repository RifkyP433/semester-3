package jti.polinema.relasiclass.tugas;

public class Dosen {
  private String namaDosen;

  public Dosen(String namaDosen) {
    this.namaDosen = namaDosen;
  }

  public String getNamaDosen() {
    return namaDosen;
  }

  public void setNamaDosen(String namaDosen) {
    this.namaDosen = namaDosen;
  }

  public void info() {
    System.out.println("Dosen Wali      : " + namaDosen);
  }
}