package jti.polinema.relasiclass.tugas;

public class Jurusan {
  private String namaJurusan;
  private Dosen dosen;

  public Jurusan(String namaJurusan, Dosen dosen) {
    this.namaJurusan = namaJurusan;
    this.dosen = dosen;
  }

  public String getNamaJurusan() {
    return namaJurusan;
  }

  public void setNamaJurusan(String namaJurusan) {
    this.namaJurusan = namaJurusan;
  }

  public Dosen getDosen() {
    return dosen;
  }

  public void setDosen(Dosen dosen) {
    this.dosen = dosen;
  }

  public void info() {
    System.out.println("Jurusan         : " + namaJurusan);
    if (dosen != null) dosen.info();
  }
}