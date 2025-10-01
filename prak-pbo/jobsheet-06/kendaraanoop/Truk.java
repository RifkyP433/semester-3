package kendaraanoop;

class Truk extends Kendaraan {
  int jumlahRoda;

  public Truk(String merk, int tahunProduksi, int jumlahRoda) {
    super(merk, tahunProduksi);
    this.jumlahRoda = jumlahRoda;
  }

  @Override
  void jalankan() {
    System.out.println("Truk " + merk + " berjalan...");
  }

  void info() {
    super.info();
    System.out.println("Jumlah roda: " + jumlahRoda);
  }
}