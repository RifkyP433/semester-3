public class TasLaptop extends Tas {
  private double ukuranMaks;
  private boolean antiAir;

  public void setUkuranMaks(double newValue) {
    ukuranMaks = newValue;
  }

  public void setAntiAir(boolean newValue) {
    antiAir = newValue;
  }

  public void cetakInformasi() {
    System.out.println("=== Tas Laptop ===");
    super.cetakInformasi();
    System.out.println("Ukuran Maks: " + ukuranMaks + " inch");
    System.out.println("Anti air: " + antiAir);
  }
}