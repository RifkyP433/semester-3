package jti.polinema.relasiclass.tugas;

public class Mahasiswa {
  private String nama;
  private Jurusan jurusan;
  private Rapor rapor;

  public Mahasiswa(String nama, Jurusan jurusan, Rapor rapor) {
    this.nama = nama;
    this.jurusan = jurusan;
    this.rapor = rapor;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Jurusan getJurusan() {
    return jurusan;
  }

  public void setJurusan(Jurusan jurusan) {
    this.jurusan = jurusan;
  }

  public Rapor getRapor() {
    return rapor;
  }

  public void setRapor(Rapor rapor) {
    this.rapor = rapor;
  }

  public void info() {
    System.out.println("Nama Mahasiswa : " + nama);
    if (jurusan != null) jurusan.info();
    if (rapor != null) rapor.info();
  }
}