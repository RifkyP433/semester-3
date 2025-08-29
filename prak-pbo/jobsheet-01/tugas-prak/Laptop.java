public class Laptop {
  private String merek;
  private int ram;

  public void setMerek(String newValue) {
    merek = newValue;
  }

  public void setRam(int newValue) {
    ram = newValue;
  }

  public void cetakInformasi() {
    System.out.println("=== Laptop ===");
    System.out.println("Merek: " + merek);
    System.out.println("RAM: " + ram + " GB");
  }
}