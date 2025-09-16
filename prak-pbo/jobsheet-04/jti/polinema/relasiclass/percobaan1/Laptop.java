package jti.polinema.relasiclass.percobaan1;

public class Laptop {
  private String merk;
  private Processor proc;

  // konstruktor default
  Laptop() {
  }

  // konstruktor berparameter
  Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
  }

  // setter
  public void setMerk(String merk) {
    this.merk = merk;
  }

  public void setProc(Processor proc) {
    this.proc = proc;
  }

  // getter
  public String getMerk() {
    return merk;
  }

  public Processor getProc() {
    return proc;
  }

  // method info
  public void info() {
    System.out.println("Merk Laptop = " + merk);
    proc.info();
  }
}