public class Tas {
  private String warna;
  private String bahan;

  public void setWarna(String newValue) {
    warna = newValue;
  }

  public void setBahan(String newValue) {
    bahan = newValue;
  }

  public void cetakInformasi() {
    System.out.println("Warna: " + warna);
    System.out.println("Bahan: " + bahan);
  }
}