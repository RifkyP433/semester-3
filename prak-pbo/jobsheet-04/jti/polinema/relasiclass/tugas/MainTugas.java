package jti.polinema.relasiclass.tugas;

public class MainTugas {
  public static void main(String[] args) {
    Dosen dosen = new Dosen("Pak Budi");
    Jurusan jurusan = new Jurusan("Informatika", dosen);
    Rapor rapor = new Rapor(92.5);
    Mahasiswa mhs = new Mahasiswa("Rifky", jurusan, rapor);

    mhs.info();
  }
}