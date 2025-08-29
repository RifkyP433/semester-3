public class TasRansel extends Tas {
  private int jmlKantong;
  private double berat;

  public void setJmlKantong(int newValue) {
    jmlKantong = newValue;
  }

  public void setBerat(double newValue) {
    berat = newValue;
  }

  public void cetakInformasi() {
    System.out.println("=== Tas Ransel ===");
    super.cetakInformasi();
    System.out.println("Jumlah kantong: " + jmlKantong);
    System.out.println("Berat: " + berat + " kg");
  }
}