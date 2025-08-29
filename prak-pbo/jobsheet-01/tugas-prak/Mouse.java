public class Mouse {
  private String merek;
  private String jenisKoneksi;

  public void setMerek(String newValue) {
    merek = newValue;
  }

  public void setJenisKoneksi(String newValue) {
    jenisKoneksi = newValue;
  }

  public void cetakInformasi() {
    System.out.println("=== Mouse ===");
    System.out.println("Merek: " + merek);
    System.out.println("Jenis Koneksi: " + jenisKoneksi);
  }
}