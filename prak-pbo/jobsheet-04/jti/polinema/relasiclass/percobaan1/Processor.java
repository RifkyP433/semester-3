package jti.polinema.relasiclass.percobaan1;

public class Processor {
  private String merk;
  private double cache;

  // konstruktor default
  Processor() { 
  }

  // konstruktor berparameter
  Processor(String merk, double cache) {
    this.merk = merk;
    this.cache = cache;
  }

  // setter
  public void setMerk(String merk) {
    this.merk = merk;
  }

  public void setCache(double cache) {
    this.cache = cache;
  }

  // getter
  public String getMerk() {
    return merk;
  }

  public double getCache() {
    return cache;
  }

  // method info
  public void info() {
    System.out.printf("Merk Processor = %s\n", merk);
    System.out.printf("Cache Memory = %.2f\n", cache);
  }
}